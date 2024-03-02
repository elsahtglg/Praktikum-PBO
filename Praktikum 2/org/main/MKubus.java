/**
 * File           : MKubus.java		02/03/23
 * Nama penulis   : Elsa Hutagalung
 * NIM            : 24060122120024
 * Deskripsi      : Kelas yang berisi main Kubus
 *
 */

package org.main;
import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus
{
    public static void main(String[] args)
    {
        BujurSangkar bujurSangkar = new BujurSangkar(4);
        Kubus kubus = new Kubus(bujurSangkar);
        System.out.println("Luas permukaan kubus dengan panjang sisi 4 satuan: " + kubus.hitungLuasAlas());
        System.out.println("Volume kubus dengan panjang sisi 4 satuan: " + kubus.hitungVolume());
    }
}
