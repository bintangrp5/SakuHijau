package com.util;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableLoader<T> {
    public void load(JTable table, List<T> dataList, String[] headers, TableRenderer<T> renderer) {
        DefaultTableModel model = new DefaultTableModel(headers, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // non-editable table
            }
        };

        int no = 1;
        for (T data : dataList) {
            Object[] row = renderer.toRow(data);
            Object[] rowWithNumber = new Object[row.length + 1];
            rowWithNumber[0] = no++;
            System.arraycopy(row, 0, rowWithNumber, 1, row.length);
            model.addRow(rowWithNumber);
        }

        table.setModel(model);
    }
}
