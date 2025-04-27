/*  Nama File   : Car.java
 *  Deskripsi   : Kelas Representasi Car
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 24 April 2025
 */

 public class Car extends Vehicle{
    void calRent (int jarak, float harga) {
        float fare = jarak * harga;
        System.out.println("harga sewa mobil = "+fare);
    }
}