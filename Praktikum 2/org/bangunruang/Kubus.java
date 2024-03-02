/**
 * File           : Kubus.java		02/03/23
 * Nama penulis   : Elsa Hutagalung
 * NIM            : 24060122120024
 * Deskripsi      : Kelas yang berisi Kubus
 *
 */

package org.bangunruang;
import org.bangundatar.BujurSangkar;

public class Kubus
{
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan)
    {
        this.permukaan = permukaan;
    }

    public double hitungVolume()
    {
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi * panjangSisi * panjangSisi;
    }

    public double hitungLuasAlas()
    {
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi * panjangSisi;
    }
}
