/**
 * File           : LimasSegiEmpat.java		02/03/23
 * Nama penulis   : Elsa Hutagalung
 * NIM            : 24060122120024
 * Deskripsi      : Kelas yang berisi LimasSegiEmpat
 *
 */


package org.bangunruang;

import org.bangundatar.SegitigaSamaSisi;

public class LimasSegiEmpat {
    private double panjangSisiAlas;
    private double tinggiLimas;
    private SegitigaSamaSisi segitiga;

    public LimasSegiEmpat(double panjangSisiAlas, double tinggiLimas, SegitigaSamaSisi segitiga) {
        this.panjangSisiAlas = panjangSisiAlas;
        this.tinggiLimas = tinggiLimas;
        this.segitiga = segitiga;
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * segitiga.hitungLuas() * tinggiLimas;
    }

    public double hitungLuasPermukaan() {
        double luasAlas = panjangSisiAlas * panjangSisiAlas;
        double luasSegitiga = segitiga.hitungLuas();
        return luasAlas + (4 * luasSegitiga);
    }
}