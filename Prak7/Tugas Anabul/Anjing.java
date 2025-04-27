/*  Nama File   : Anjing.java
 *  Deskripsi   : Kelas representasi Anjing sebagai subclass Anabul
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 27 April 2025
 */


public class Anjing extends Anabul {
    
    public Anjing(String nama){
        super(nama);
    }

    public void gerak(){
        System.out.println(nama  + " Bergerak dengan cara melata");
    }

    public void bersuara(){
        System.out.println(nama  + " Bersuara Guk-guk!");
    }
}