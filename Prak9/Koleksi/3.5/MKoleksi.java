/*  Nama File   : MKoleksi++++++++++++++++++++++++++++++++++++++++++.java
 *  Deskripsi   : Program App yang merupakan main Koleksi
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 8 Mei 2025
 */

public class MKoleksi {
    public static void main(String[] args) {
        Koleksi<Character> koleksiKarakter = new Koleksi<>();

        // Menambahkan 10 karakter ke dalam koleksi (A sampai J)
        for (char c = 'A'; c <= 'J'; c++)  {
            koleksiKarakter.add(c);
        }

        // Menampilkan seluruh elemen
        System.out.println("Koleksi Karakter:");
        koleksiKarakter.showAll();

        // Mengubah elemen pada indeks ke-1 menjadi 'Z'
        koleksiKarakter.setIsi(1, 'Z');
        System.out.println("\nKoleksi Karakter setelah dilakukan setIsi:");
        koleksiKarakter.showAll();

        // Menghapus elemen terakhir
        Character hapus = koleksiKarakter.delete();
        System.out.println("\nElemen yang terhapus: " + hapus);
        System.out.println("\nElemen koleksi saat ini: " + koleksiKarakter.getSize());
        koleksiKarakter.showAll();
    }
}
