/* Nama file: Asersi1.java
 * Deskripsi: program untuk menunjukkan asersi
 * Nama/Nim: Rayhan Septian Wijaya - 24060123140123
 * Tanggal: 8 Maret 2025 */

public class Asersi1{
    public static void mai(String [] args){
        int x=0;
        if(x>0){
            System.out.println("X bilangan positif");
        }else{
            assert(x<0) : "ada kesalahan kode";
            System.out.println("X Bilangan negatif");
        }
    }
}