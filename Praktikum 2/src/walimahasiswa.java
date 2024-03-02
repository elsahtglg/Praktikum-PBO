/**
 * File           : walimahasiswa.java		02/03/23
 * Nama penulis   : Elsa Hutagalung
 * NIM            : 24060122120024
 * Deskripsi      : Kelas yang berisi walimahasiswa
 *
 */

class WaliMahasiswa {
    private String NomorHP;
    private String Alamat;
    private String Nama;
    private String NIK;

    public WaliMahasiswa(String Nama, String NIK, String NomorHP, String Alamat){
        this.Nama = Nama;
        this.NIK = NIK;
        this.NomorHP = NomorHP;
        this.Alamat = Alamat;
    }
    public String getNomorHP() {
        return NomorHP;
    }
    public String getAlamat() {
        return Alamat;
    }

    public String getNama(){
        return Nama;
    }

    public String getNIK(){
        return NIK;
    }

    public void setNomorHP(String NomorHP){
        this.NomorHP = NomorHP;
    }

    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setNIK(String NIK){
        this.NIK = NIK;
    }

    public void cetak(){
        System.out.println("Nama   :" + Nama);
        System.out.println("NIK    :" + NIK);
        System.out.println("NomorHP:" + NomorHP);
        System.out.println("Alamat :" + Alamat);
    }

}
