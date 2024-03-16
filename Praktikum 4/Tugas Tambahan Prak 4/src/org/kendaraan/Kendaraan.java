package org.kendaraan;

public class Kendaraan {
    protected String nama;
    protected int kecepatan;
    private String jenis;
    private int kecepatanMax;

    public Kendaraan(String nama){
        this.nama = nama;
        this.kecepatan = 0;
        this.jenis = jenis;
        this.kecepatanMax = kecepatanMax;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

    public String getJenis(){
        return jenis;
    }
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    public int getKecepatanMax(){
        return kecepatanMax;
    }
    public void setKecepatanMax(int kecepatanMax){
        this.kecepatanMax = kecepatanMax;
    }
    public int getKecepatan(){
        return kecepatan;
    }
    public void setKecepatan(int kecepatan){
        this.kecepatan = kecepatan;
    }
    public void cetakInfo(){
        System.out.println("Nama   :" + nama);
        System.out.println("Jenis Kendaraan    :" + jenis);
        System.out.println("Kecepatan    :" + kecepatan);
    }
    public void gas(int kecepatan, int durasi){
        if (kecepatan <= kecepatanMax){
            this.kecepatan = kecepatan;
            System.out.println("Kecepatan kendaraan diatur menjadi " + this.kecepatan + " km/jam selama " + durasi + " jam.");
        }else{
            System.out.println("Kecepatan maksimal kendaraan adalah " + kecepatanMax + " km/jam.");
        }
    }
    public void berhenti(){
        this.kecepatan = 0;
        System.out.println("Kendaraan berhenti");
    }
    public void klakson(){
        System.out.println( nama + " berbunyi");
    }
}
