package org.truk;

public class Truk {
    private int kapasitasMuatan;
    private int beratMuatan;
    private String namaTruk;

    public Truk(String namaTruk, int kapasitasMuatan) {
        this.kapasitasMuatan = kapasitasMuatan;
        this.beratMuatan = 0;
        this.namaTruk = namaTruk;
    }

    public int getKapasitasMuatan() {
        return kapasitasMuatan;
    }

    public void setKapasitasMuatan(int kapasitasMuatan) {
        this.kapasitasMuatan = kapasitasMuatan;
    }

    public String getNamaTruk() {
        return namaTruk;
    }

    public void setNamaTruk(String namaTruk) {
        this.namaTruk = namaTruk;
    }

    public int getBeratMuatan() {
        return beratMuatan;
    }

    public void setBeratMuatan(int beratMuatan) {
        this.beratMuatan = beratMuatan;
    }

    public void cetakInfo() {
        System.out.println("Kapasitas Muatan   :" + kapasitasMuatan);
        System.out.println("Berat Muatan    :" + beratMuatan);
    }

    public void muatBarang(int berat) {
        if (this.beratMuatan + berat <= kapasitasMuatan) {
            this.beratMuatan += berat;
            System.out.println("Berat muatan saat ini: " + this.beratMuatan + " kg.");
        } else {
            System.out.println("Muatan melebihi kapasitas truk.");
        }
    }
    public void klakson(){
            System.out.println("Kendaraan " + this.getNamaTruk() + " berbunyi");
        }
}
