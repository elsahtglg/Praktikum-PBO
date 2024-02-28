/**
 * File      	: MTitik.java		28/02/23
 * Nama penulis : Elsa Hutagalung
 * NIM          : 24060122120024
 * Deskripsi 	: Kelas yang berisi main dari Titik
 * 
 */

public class MTitik {
	public static void main(String[] args) {
		Titik t1, t2, t3;

		t1 = new Titik();
		t2 = new Titik();
		t3 = new Titik(5, 6);

		t1.setAbsis(1);
		t1.setOrdinat(2);

		t2.setAbsis(3);
		t2.setOrdinat(4);

		System.out.println("Jumlah Objek titik : " + Titik.getCounterTitik());
		System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
		System.out.println("t2(" + t2.getAbsis() + "," + t2.getOrdinat() + ")");
		System.out.println("t3(" + t3.getAbsis() + "," + t3.getOrdinat() + ")");

		t1.refleksiX(t1);
		System.out.println("Titik 1 setelah direfleksi = " + t1.getOrdinat());
		System.out.println("Jumlah objek titik : " + Titik.getCounterTitik());
		System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
		System.out.println("t1(" + t2.getAbsis() + "," + t2.getOrdinat() + ")");
//		System.out.println("Jarak pusat = " + t1.getJarakPusat());}
	}

}