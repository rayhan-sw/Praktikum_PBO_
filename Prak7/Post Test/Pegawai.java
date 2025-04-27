/*  Nama File   : Pegawai.java
 *  Deskripsi   : Kelas Representasi Pegawai sebagai superclass
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 24 April 2025
 */

 public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    //method
    //Setter 
    public void SetNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji Pokok : " + gajiPokok); 

    }

}