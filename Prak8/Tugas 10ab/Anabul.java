/*  Nama File   : Anabul.java
 *  Deskripsi   : Kelas representasi Anabul sebagai superclass
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 3 Mei 2025
 */


 public abstract class Anabul {
    protected String nama;

    //Method
    //getter
    public Anabul(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }

    public abstract void gerak();
    public abstract void bersuara();
}