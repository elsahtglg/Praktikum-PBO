/**
 * File      : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input jari jari lingkaran yang bernilai nol
 */

//class Lingkaran
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
//
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2{
    public static void main (String[] args){
        double jariJari = 0;
        assert(jariJari>0): "jari jari tidak boleh nol!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/***
 * secara konsep, ada yg kurang dari program tsb?
 * tidak, program tersebut sebetulnya sudah tepat karena apabila kondisi dalam asesrsi terpenuhi maka perintah dibawahnya akan dijalankan
 */
