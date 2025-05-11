/*  Nama File   : ArrayListTest.java
 *  Deskripsi   : Program penggunaan objek ArrayList sebagai collection class
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 8 Mei 2025
 */

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //Inisialisasi ArrayList yang hanya dapat berisi objek String
        ArrayList<String> strings = new ArrayList<String>();
        //Menambahkan elemen ke dalam ArrayList
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        //Menghapus elemen
        strings.remove("Praktikum");
        //Iterasi pada ArrayList
        for (String s : strings) {
            System.out.println(s+" ");
        }
    }
}