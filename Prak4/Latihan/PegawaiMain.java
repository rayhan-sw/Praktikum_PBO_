/*  Nama File   : PegawaiMain.java
 *  Deskripsi   : Main class untuk menguji sistem pegawai
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 16 Maret 2025
 */

 import java.time.LocalDate;

 public class PegawaiMain {
     public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap(
            "987654321",
            "Krating Hanzerex ", 
            LocalDate.of(1989, 4, 15), 
            LocalDate.of(2014, 10, 12), 
            2000000, 
            "Fakultas Sains dan Matematika", 
            "12246");


        DosenTamu dosenTamu = new DosenTamu(
            "912345678",
            "Big Rae Yellow",
            LocalDate.of(1999, 6, 15),
            LocalDate.of(2021, 10, 12),
            1500000,
            "Fakultas Ilmu Budaya",
            "54321",
            LocalDate.of(2025, 12, 31));


        Tendik tendik = new Tendik(
            "1234512345",
            "Rafi Althaf",
            LocalDate.of(2004, 8, 30),
            LocalDate.of(2024, 1, 10),
            10000,
            "Kebersihan");

         
         System.out.println("/-------------- INFORMASI DOSEN TETAP ---------------/");
         dosenTetap.printInfo();
         
         System.out.println("\n/------------ INFORMASI DOSEN TAMU ----------------/");
         dosenTamu.printInfo();
         
         System.out.println("\n/------------ INFORMASI TENDIK -------------------/");
         tendik.printInfo();
 
     }
 }