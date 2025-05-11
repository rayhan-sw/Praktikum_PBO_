/*  Nama File   : MAnabulRevisi.java
 *  Deskripsi   : Program kelas App merupakan kelas utama untuk menjalankan program
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 8 Mei 2025
 */

import java.util.Random;

public class MAnabulRevisi {
    public static void main(String[] args) {
        KoleksiAnabul koleksi = new KoleksiAnabul();
        Random rand = new Random();

        // Daftar nama contoh
        String[] namaAnabul = {
            "Milo", "Luna", "Charlie", "Max", "Bella", 
            "Rocky", "Coco", "Oliver", "Mimi", "Leo"
        };

        for (int i = 0; i < 10; i++) {
            int jenis = rand.nextInt(3); // 0 = Kucing, 1 = Anjing, 2 = Burung
            String nama = namaAnabul[i];

            switch (jenis) {
                case 0:
                    koleksi.add(new Kucing(nama));
                    break;
                case 1:
                    koleksi.add(new Anjing(nama));
                    break;
                case 2:
                    koleksi.add(new Burung(nama));
                    break;
            }
        }

        // Tampilkan seluruh koleksi anabul
        koleksi.showAll();
    }
}