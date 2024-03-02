/**
 * File           : BujurSangkar.java		02/03/23
 * Nama penulis   : Elsa Hutagalung
 * NIM            : 24060122120024
 * Deskripsi      : Kelas yang berisi main LimasSegiEmpat
 *
 */

package org.main;

import java.util.Scanner;
import org.bangundatar.SegitigaSamaSisi;
import org.bangunruang.LimasSegiEmpat;

public class MainLimasSegiEmpat
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi alas: ");
        double panjangSisiAlas = scanner.nextDouble();

        System.out.print("Masukkan tinggi limas: ");
        double tinggiLimas = scanner.nextDouble();

        System.out.print("Masukkan alas segitiga: ");
        double alasSegitiga = scanner.nextDouble();

        System.out.print("Masukkan tinggi segitiga: ");
        double tinggiSegitiga = scanner.nextDouble();

        SegitigaSamaSisi segitiga = new SegitigaSamaSisi(alasSegitiga, tinggiSegitiga);
        LimasSegiEmpat limas = new LimasSegiEmpat(panjangSisiAlas, tinggiLimas, segitiga);

        double volume = limas.hitungVolume();
        double luasPermukaan = limas.hitungLuasPermukaan();

        System.out.println("Volume limas segitiga: " + volume);
        System.out.println("Luas permukaan limas segitiga: " + luasPermukaan);
    }
}

