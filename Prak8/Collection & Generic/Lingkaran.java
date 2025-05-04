/*  Nama File   : Lingkaran.java
 *  Deskripsi   : Implementasi Lingkaran sebagai subclass dari BangunDatar
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 2 Mei 2025
 */

 public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }
    public double hitungKeliling() {
        return 2*jejari*3.14;
    }
}