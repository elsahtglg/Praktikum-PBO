/**
 * File: MLingkaran.java
 * Nama: Elsa Hutagalung
 * NIM : 24060122120024
 */

import java.util.Scanner;
public class MLingkaran {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jari-jari: ");
        double jari = scan.nextDouble();
        Lingkaran l = new Lingkaran(jari);
        System.out.println("Luas lingkaran dengan jejari " + jari + " adalah " +l.hitungLuas());
    }
}
