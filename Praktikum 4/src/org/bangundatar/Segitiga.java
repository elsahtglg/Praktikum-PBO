/**
 * File           : Segitiga.java		13/03/23
 * Nama penulis   : Elsa Hutagalung
 * NIM            : 240601222120024
 * Deskripsi      : Kelas yang berisi Segitiga
 *
 */

package org.bangundatar;
import org.poligon.Poligon;

public class Segitiga extends Poligon {
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public double hitungLuasSegitiga(){
        return 0.5 * alas * tinggi;
    }
}
