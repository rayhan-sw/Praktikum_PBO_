/*  Nama File   : Kucing.java
 *  Deskripsi   : Kelas representasi Kucing sebagai subclass Anabul
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 3 Mei 2025
 */


 public class Kucing extends Anabul {

    public Kucing(String nama){
        super(nama);
    }

    public void gerak(){
        System.out.println(nama + " Bergerak dengan cara melata");
    }

    public void bersuara(){
        System.out.println(nama + " Bersuara Meong!");
    }
}
