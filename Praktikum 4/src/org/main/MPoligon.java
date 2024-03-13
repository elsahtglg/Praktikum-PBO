/**
 * File           : MPoligon.java		13/03/23
 * Nama penulis   : Elsa Hutagalung
 * NIM            : 240601222120024
 * Deskripsi      : Kelas yang berisi main poligon
 *
 */

package org.main;
import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
    }
}
