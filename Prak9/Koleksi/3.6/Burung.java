/*  Nama File   : Burung.java
 *  Deskripsi   : Kelas representasi Burunng sebagai subclass Anabul
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 27 April 2025
 */

public class Burung extends Anabul{

    public Burung(String nama){
        super(nama);
    }

    public void gerak(){
        System.out.println(nama + " Bergerak dengan cara terbang");
    }

    public void bersuara(){
        System.out.println(nama + " Bersuara Cuit!");
    }
}