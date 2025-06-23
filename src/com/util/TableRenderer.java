package com.util;

public interface TableRenderer<T> {
    Object[] toRow(T item);
}
