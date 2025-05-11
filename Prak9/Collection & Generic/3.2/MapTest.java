/*  Nama File   : MapTest.java
 *  Deskripsi   : Program yang menggunakan Generic untuk pasangan Kunci-Nilai
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 8 Mei 2025
 */

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        // Kunci -> integer, nilai -> string
        Map<Integer,String> map = new HashMap<Integer,String>();
        // Menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        // Mengambil elemen pertama
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        // Mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> key = map.keySet();

    }
}