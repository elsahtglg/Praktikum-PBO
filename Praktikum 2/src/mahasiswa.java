/**
 * File           : mahasiswa.java		02/03/23
 * Nama penulis   : Elsa Hutagalung
 * NIM            : 24060122120024
 * Deskripsi      : Kelas yang berisi mahasiswa
 *
 */

class Mahasiswa {
    private String NIM;
    private String Jurusan;
    private String Wali;
    private String Nama;
    private String NIK;
    private WaliMahasiswa WaliMhs;

    public Mahasiswa(String Nama, String NIK, String NIM, String Jurusan, WaliMahasiswa WaliMhs){
        this.Nama = Nama;
        this.NIK = NIK;
        this.Jurusan = Jurusan;
        this.NIM = NIM;
        this.WaliMhs = WaliMhs;
    }
    public String getNIM() {
        return NIM;
    }
    public String getJurusan() {
            return Jurusan;
    }

    public String getWali(){
            return Wali;
    }

    public String getNama(){
        return Nama;
    }

    public String getNIK(){
        return NIK;
    }

    public WaliMahasiswa getWaliMhs(){
        return WaliMhs;
    }

    public void setNIM(String NIM){
            this.NIM = NIM;
    }

    public void setJurusan(String Jurusan){
            this.Jurusan = Jurusan;
    }

    public void setWali(String WaliMahasiswa){
            this.Wali = Wali;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setNIK(String NIK){
        this.NIK = NIK;
    }

    public void setWaliMhs(WaliMahasiswa WaliMhs){
        this.WaliMhs = WaliMhs;
    }

    public void cetak(){
        System.out.println("Nama   :" + Nama);
        System.out.println("NIM    :" + NIM);
        System.out.println("NIK    :" + NIK);
        System.out.println("Jurusan:" + Jurusan);
        System.out.println("Wali   :" + Wali);
        WaliMhs.cetak();
    }


}



