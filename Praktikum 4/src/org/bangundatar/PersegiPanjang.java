/**
 * File           : PersegiPanjang.java		13/03/23
 * Nama penulis   : Elsa Hutagalung
 * NIM            : 240601222120024
 * Deskripsi      : Kelas yang berisi Persegi Panjang
 *
 */

package org.bangundatar;
import org.poligon.Poligon;

public class PersegiPanjang extends Poligon{
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar, int jumlahSisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }
    public double hitungLuas(){
        return panjang * lebar;
    }
    public void printInfo(){
        System.out.println("Bangun Persegi Panjang berisi "+this.getJumlahSisi());
    }
}
