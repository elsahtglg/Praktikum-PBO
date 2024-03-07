/**
 * File           : BukuTidakTersedia.java		06/03/23
 * Nama penulis   : Elsa Hutagalung
 * NIM            : 240601222120024
 * Deskripsi      : Kelas yang berisi Eksepsi dari buku tidak tersedia
 * *
 */

public class BukuTidakTersediaException extends MaksimumBukuTerpinjamException{
    public BukuTidakTersediaException(String message) {
        super(message);
    }
}
