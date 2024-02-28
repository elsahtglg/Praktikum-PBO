/**
 * File      	: Titik.java		28/02/23
 * Nama penulis : Elsa Hutagalung
 * NIM          : 24060122120024
 * Deskripsi : Kelas yang berisi main dari Titik
 * 
 */

public class Titik {
	private double absis, ordinat;
	static double counterTitik;

	public Titik() {
		this.absis = 0;
		this.ordinat = 0;
		counterTitik++;
	}

	Titik(double a, double b) {
		absis = a;
		ordinat = b;
		counterTitik++;
	}

	public void setAbsis(double abs) {
		absis = abs;
	}

	public double getAbsis() {
		return absis;
	}

	public void setOrdinat(double ord) {
		ordinat = ord;
	}

	public double getOrdinat() {
		return ordinat;
	}

	static double getCounterTitik() {
		return counterTitik;
	}

	public void refleksiX(Titik titik)
	{
		double ordinat = titik.getOrdinat();
		ordinat *= -1;
		titik.setOrdinat(ordinat);
	}

	public double getRefleksiX() {
		refleksiX(this);
		return this.getOrdinat();
	}

	public void refleksiY(Titik titik) {
		double absis = titik.getAbsis();
		absis *= -1;
		titik.setAbsis(absis);
	}

	public double getRefleksiY()
	{
		refleksiY(this);
		return this.getAbsis();
	}



}