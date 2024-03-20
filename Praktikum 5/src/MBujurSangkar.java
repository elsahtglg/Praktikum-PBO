/**
 * File: MBujurSangkar.java
 * Nama: Elsa Hutagalung
 * NIM : 24060122120024
 */

import java.util.Scanner;
class MBujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi "+sisi+ " satuan adalah "+bs.hitungLuas(sisi));
    }
}
