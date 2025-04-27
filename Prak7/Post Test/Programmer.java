/*  Nama File   : Programmer.java
 *  Deskripsi   : Kelas representasi Programmer sebagai subclass Pegawai
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 24 April 2025
 */

 public class Programmer extends Pegawai {
    private int bonus = 450000;

    //Method
    //Konstruktor
    public Programmer(String nama) {
        SetNama(nama);
    }

    
    @Override
    public void tampilData() {
        super.tampilData(); 
        System.out.println("Bonus: " + bonus);
    }
}