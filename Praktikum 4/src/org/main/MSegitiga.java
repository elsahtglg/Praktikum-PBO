/**
 * File           : MSegitga.java		13/03/23
 * Nama penulis   : Elsa Hutagalung
 * NIM            : 240601222120024
 * Deskripsi      : Kelas yang berisi main segitiga
 *
 */

package org.main;
import org.bangundatar.*;
public class MSegitiga {
    public static void main(String[] args){
        Segitiga segitiga = new Segitiga(5, 10);
        System.out.println("Luas Segitiga adalah : "+segitiga.hitungLuasSegitiga());
    }
}
