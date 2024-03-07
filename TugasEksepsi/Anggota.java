/**
 * File           : Anggota.java		06/03/23
 * Nama penulis   : Elsa Hutagalung
 * NIM            : 240601222120024
 * Deskripsi      : Kelas yang berisi Anggota
 *
 */

public class Anggota {
    private String nama;
    private Buku[] bukuPinjaman;
    private int jumlahBukuPinjaman;

    public Anggota(String nama) {
        this.nama = nama;
        bukuPinjaman = new Buku[3];
        jumlahBukuPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public Buku[] getBukuPinjaman() {
        return bukuPinjaman;
    }

    public int getJumlahBukuPinjaman() {
        return jumlahBukuPinjaman;
    }

    public void pinjamBuku(Buku buku) throws BukuTidakTersediaException, MaksimumBukuTerpinjamException {
        if (jumlahBukuPinjaman >= bukuPinjaman.length)
            throw new MaksimumBukuTerpinjamException("Anda sudah mencapai maksimum peminjaman buku");
        if (!buku.isTersedia())
            throw new BukuTidakTersediaException("Buku tidak tersedia");

        buku.setTersedia(false);
        bukuPinjaman[jumlahBukuPinjaman] = buku;
        jumlahBukuPinjaman++;

    }
}