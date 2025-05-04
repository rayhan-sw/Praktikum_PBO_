/*  Nama File   : BangunDatarGenericTest.java
 *  Deskripsi   : Kelas Main untuk demo menguji generic pada bangun datar
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 3 Mei 2025
 */

 public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<>();
        bdg.set(l);
        System.out.println("keliling lingkaran : " + bdg.hitungKeliling());
        System.out.println("tipe generic : " + bdg.get().getClass().getName()); 
    }
}