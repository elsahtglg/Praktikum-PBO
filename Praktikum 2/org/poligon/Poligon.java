/**
 * File           : Poligon.java		02/03/23
 * Nama penulis   : Elsa Hutagalung
 * NIM            : 24060122120024
 * Deskripsi      : Kelas yang berisi Poligon
 *
 */

package org.poligon;

public class Poligon 
{
    protected int jumlahSisi;

    public Poligon()
    {
        this.jumlahSisi = 1;
    }

    public void setJumlahSisi(int jumlahSisi)
    {
        this.jumlahSisi = jumlahSisi;
    }

    public int getJumlahSisi()
    {
        return this.jumlahSisi;
    }
}
