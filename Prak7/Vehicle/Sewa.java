/*  Nama File   : Sewa.java
 *  Deskripsi   : Kelas Main untuk sewa kendaraan
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 24 April 2025
 */

 public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();

        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
     
        System.out.println();

        Vehicle.hitungSewa(kendaraan);
        Vehicle.hitungSewa(bis);
        Vehicle.hitungSewa(mobil);
    }
    
}

