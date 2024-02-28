public class MGaris {
    public static void main(String[] args) {
        Titik titikAwal = new Titik(1, 2);
        Titik titikAkhir = new Titik(4, 6);

        Garis garis = new Garis(titikAwal, titikAkhir);

        System.out.println("Titik Awal: (" + garis.getTitikAwal().getAbsis() + ", " + garis.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + garis.getTitikAkhir().getAbsis() + ", " + garis.getTitikAkhir().getOrdinat() + ")");

        System.out.println("Panjang Garis: " + garis.getPanjang());

        System.out.println("Gradien Garis: " + garis.getGradien());


    }
}