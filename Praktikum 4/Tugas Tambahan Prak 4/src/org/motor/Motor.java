package org.motor;

public class Motor {
    private int cc;
    private String namaMotor;

    public Motor(String namaMotor, int cc){
        this.cc = cc;
        this.namaMotor = namaMotor;
    }
    public int getCC(){
        return cc;
    }
    public void setCC(int cc){
        this.cc = cc;
    }
    public String getNamaMotor(){
        return namaMotor;
    }
    public void setNamaMotor(String namaMotor){
        this.namaMotor = namaMotor;
    }
    public double hitungHorsepower(int angka){
        return angka;
    }
    public void klakson(){
        System.out.println("Kendaraan " + this.getNamaMotor() + " berbunyi");
    }
}
