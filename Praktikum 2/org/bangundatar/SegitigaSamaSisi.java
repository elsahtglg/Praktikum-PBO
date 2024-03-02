/**
 * File           : SegitigaSamaSisi.java		02/03/23
 * Nama penulis   : Elsa Hutagalung
 * NIM            : 24060122120024
 * Deskripsi      : Kelas yang berisi SegitigaSamaSisi
 *
 */

package org.bangundatar;

public class SegitigaSamaSisi {
    private double alas;
    private double tinggi;

    public SegitigaSamaSisi(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}
