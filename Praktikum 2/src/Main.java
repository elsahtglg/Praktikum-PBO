/**
 * File           : Main.java		02/03/23
 * Nama penulis   : Elsa Hutagalung
 * NIM            : 24060122120024
 * Deskripsi      : Kelas yang berisi main mahasiswa dan walimahasiswa
 *
 */

public class Main{
    public static void main(String[] args) {
        WaliMahasiswa WaliWali = new WaliMahasiswa("Saut", "789456321547", "081256987458", "Balige");
        Mahasiswa Mhs = new Mahasiswa("Elsa Hutagalung", "123456789123", "24060122120024", "Informatika", WaliWali);
        Mhs.cetak();
    }
}