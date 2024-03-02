/**
 * File           : BujurSangkar.java		02/03/23
 * Nama penulis   : Elsa Hutagalung
 * NIM            : 24060122120024
 * Deskripsi      : Kelas yang berisi Bujur Sangkar
 *
 */

package org.bangundatar;
import org.poligon.Poligon;

public class BujurSangkar extends Poligon 
{
    private double panjangSisi;

    public BujurSangkar(double panjangSisi)
    {
        this.jumlahSisi = 4;
        this.panjangSisi = panjangSisi;
    }

    public double hitungLuas()
    {
        return panjangSisi * panjangSisi;
    }

    public double getPanjangSisi() 
    {
        return this.panjangSisi;
    }
}
