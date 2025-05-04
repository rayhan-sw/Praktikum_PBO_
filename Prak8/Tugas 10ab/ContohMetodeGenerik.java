/*  Nama File   : ContohMetodeGenerik.java
 *  Deskripsi   : Kelas yang mendemonstrasikan penggunaan metode generik dengan kelas Datum
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 3 Mei 2025
 */

 import java.util.ArrayList;

 public class ContohMetodeGenerik {
     
     // Metode generik untuk menampilkan informasi dari objek Datum
     public static <T> void tampilkanDatum(Datum<T> datum) {
         System.out.println("Isi datum: " + datum.getIsi());
     }
     
     // Metode generik untuk menampilkan informasi Anabul dari Datum
     public static <T extends Anabul> void tampilkanPeliharaan(Datum<T> datum) {
         T anabul = datum.getIsi();
         System.out.println("Nama: " + anabul.getNama());
         anabul.gerak();
         anabul.bersuara();
         System.out.println();
     }
     
     // Metode untuk menukar isi dua Datum (swap)
     public static <T> void tukarIsiDatum(Datum<T> datum1, Datum<T> datum2) {
         T temp = datum1.getIsi();
         datum1.setIsi(datum2.getIsi());
         datum2.setIsi(temp);
     }
     
     //Main
     public static void main(String[] args) {
         // Membuat objek Datum yang berisi Anabul
         Datum<Anabul> datum1 = new Datum<>(new Kucing("Haerin"));
         Datum<Anabul> datum2 = new Datum<>(new Anjing("Jokowie"));
         Datum<Anabul> datum3 = new Datum<>(new Burung("Prabowow"));
 
         //Peliharaan
         ArrayList<Datum<Anabul>> daftarPeliharaanku = new ArrayList<>();
         daftarPeliharaanku.add(datum1);
         daftarPeliharaanku.add(datum2);
         daftarPeliharaanku.add(datum3);
 
         System.out.println("=== Informasi Semua Peliharaan ===");
         for (Datum<Anabul> d : daftarPeliharaanku) {
             tampilkanPeliharaan(d);
         }
         
         System.out.println("===Sebelum Tukar Isi Datum ===");
         System.out.println("Sebelum ditukar:");
         System.out.println("Datum 1: " + datum1.getIsi().getNama());
         System.out.println("Datum 2: " + datum2.getIsi().getNama());
         
         tukarIsiDatum(datum1, datum2);
         
         System.out.println("\nSetelah ditukar:");
         System.out.println("Datum 1: " + datum1.getIsi().getNama());
         System.out.println("Datum 2: " + datum2.getIsi().getNama());
     }
 }