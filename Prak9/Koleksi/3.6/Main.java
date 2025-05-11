/*  Nama File   : App.java
 *  Deskripsi   : Program kelas App merupakan kelas utama untuk menjalankan program
*  Pembuat     : Rayhan Septian Wijaya
*  NIM         : 24060123140123
 *  Tanggal     : 8 Mei 2025
 */

public class Main {
    public static void main(String[] args) {
        KoleksiAnabul koleksi = new KoleksiAnabul();

        koleksi.add(new Kucing("Mimi"));
        koleksi.add(new Anjing("Bruno"));
        koleksi.add(new Burung("Rio"));

        koleksi.showAll();
    }
}
