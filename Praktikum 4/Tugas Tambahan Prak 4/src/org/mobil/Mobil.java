package org.mobil;

public class Mobil {
    private String jenisKendaraan;
    private int jumlahPintu;

    public Mobil(String jenisKendaraan, int jumlahPintu){
        this.jumlahPintu = jumlahPintu;
        this.jenisKendaraan = jenisKendaraan;
    }
    public int getJumlahPintu(){
        return jumlahPintu;
    }
    public void setJumlahPintu(int jumlahPintu){
        this.jumlahPintu = jumlahPintu;
    }
    public String getJenisKendaraan(){
        return jenisKendaraan;
    }
    public void setJenisKendaraan(String jenisKendaraan){
        this.jenisKendaraan = jenisKendaraan;
    }
    public void cetakInfo(){
        System.out.println("Jumlah Pintu   =" + jumlahPintu);
    }
    public void bukaPintu(int nomorPintu){
        System.out.println("Pintu nomor " + jumlahPintu + " mobil " + jenisKendaraan + " terbuka.");
    }
    public void klakson(){
        System.out.println("Kendaraan "+ jenisKendaraan + " berbunyi");
    }
}
