package org.example.satu;

public class Subject {
    private String nama;
    private double beban;

    public Subject(String nama, int beban) {
        this.beban = beban;
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getBeban() {
        return beban;
    }

    public void setBeban(int beban) {
        this.beban = beban;
    }

}
