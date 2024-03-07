public class KeranjangBelanja {
    private String[] keranjang;
    private int count;

    public KeranjangBelanja() {
        keranjang = new String[5];
        count = 0;
    }

    public void addItem(String item) {
        // Cek apakah keranjang sudah penuh
        assert count < keranjang.length : "Keranjang sudah penuh";

        // Tambahkan item ke keranjang
        keranjang[count] = item;
        count++;
    }

    public void printItems() {
        for (int i = 0; i < keranjang.length; i++) {
            System.out.println(keranjang[i]);
        }
    }
}
