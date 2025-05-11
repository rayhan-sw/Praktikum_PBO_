/*  Nama File   : BangunDatarGeneric.java
 *  Deskripsi   : Kelas generic untuk bangun datar
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 8 Mei 2025
 */

 public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T get() {
        return bangunDatar;
    }

    public double hitungKeliling()  {
        return bangunDatar.hitungKeliling();
    }

    public double hitungLuas()  {
        return bangunDatar.hitungLuas();
    }

      public void display() {
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}