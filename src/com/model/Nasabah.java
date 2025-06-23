package com.model;

/**
 *
 * @author binta
 */
public class Nasabah {
    private String id;
    private String nama;

    public Nasabah(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }
}