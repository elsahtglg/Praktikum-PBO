/**
 * File      : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 *             Pengenalan klausa 'throw' dan 'throws'
 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka==13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+"bukan angka sial");
    }

    public static void main (String[] args){
        AngkaSial as = new AngkaSial ();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/***
 * Apakah baris 12 di eksekusi?
 * Ya, pada line 18 cobaangka 10 akan di cek ke komdisi if, namun tidak masuk ke dalam kondisi if karena 10 != 13 namun saat 13 masuk maka akan dilempar ke dalam catch
 * Apakah baris 21 dieksekusi?
 * Ya, karena pertama tama akan nge cek angka 10 kemudian angka 13, karena angka 13 masuk ke exception maka dia akan nge print "hati hati memasukkan angka"
 */
