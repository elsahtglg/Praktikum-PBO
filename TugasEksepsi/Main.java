/**
 * File           : Main.java		06/03/23
 * Nama penulis   : Elsa Hutagalung
 * NIM            : 240601222120024
 * Deskripsi      : Kelas yang berisi main dari Buku dan Anggota
 *
 */

public class Main {
    public static void main(String[] args) {
        Anggota anggota = new Anggota("Elsa Hutagalung");
        Buku buku1 = new Buku("Pemrograman Berbasis Objek");
        Buku buku2 = new Buku("Gravika dan Komputasi Visual");
        Buku buku3 = new Buku("Analisis dan Strategi Algoritma");
        Buku buku4 = new Buku("Sistem Cerdas");

        try {
            anggota.pinjamBuku(buku1);
            anggota.pinjamBuku(buku2);
            anggota.pinjamBuku(buku3);
            anggota.pinjamBuku(buku4); // Akan melempar MaksimumBukuTerpinjamException karena anggota sudah meminjam maksimum jumlah buku
            System.out.println("Jumlah buku pinjaman:" + anggota.getJumlahBukuPinjaman());

            for (Buku buku : anggota.getBukuPinjaman())
                System.out.println("judul buku yg di pinjam: " + buku.getJudul());
        }catch (BukuTidakTersediaException e) {
            System.out.println(e.getMessage());
        }catch (MaksimumBukuTerpinjamException e){
            System.out.println(e.getMessage());
        }
    }
}