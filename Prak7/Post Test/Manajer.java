/*  Nama File   : Menajer.java
 *  Deskripsi   : Kelas representasi Manajer sebagai subclass Pegawai
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 24 April 2025
 */

 public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    //Method
    //Konstruktor
    public Manajer(String nama) {
        SetNama(nama);
    }

    //Tampil Data Manajer
    @Override
    public void tampilData() {
        super.tampilData(); 
        System.out.println("Tunjangan: " + tunjangan);
    }
    
}