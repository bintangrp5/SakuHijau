package com.model;

public class Sampah {
    private String kodeSampah;
    private String kategori;
    private String jenis;
    private String deskripsi;
    private double harga1;
    private double harga2;
    private double hargaPengepul;
    private double stok;

    public Sampah(String kodeSampah, String kategori, String jenis, String deskripsi,
                  double harga1, double harga2, double hargaPengepul, double stok) {
        this.kodeSampah = kodeSampah;
        this.kategori = kategori;
        this.jenis = jenis;
        this.deskripsi = deskripsi;
        this.harga1 = harga1;
        this.harga2 = harga2;
        this.hargaPengepul = hargaPengepul;
        this.stok = stok;
    }

    public String getKodeSampah() { return kodeSampah; }
    public String getKategori() { return kategori; }
    public String getJenis() { return jenis; }
    public String getDeskripsi() { return deskripsi; }
    public double getHarga1() { return harga1; }
    public double getHarga2() { return harga2; }
    public double getHargaPengepul() { return hargaPengepul; }
    public double getStok() { return stok; }
}
