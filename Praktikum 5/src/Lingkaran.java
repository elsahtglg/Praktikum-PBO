/**
 * File: Lingkaran.java
 * Nama: Elsa Hutagalung
 * NIM : 24060122120024
 */

//mengambil konstanta yang ada di kelas java.lang.Math
import static java.lang.Math.PI;
class Lingkaran implements IArea{
    private double jejari;
    public Lingkaran(double r){
        jejari = r;
    }
    @Override
    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}
