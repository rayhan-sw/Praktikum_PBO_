/*  Nama File   : MBangunDatar.java
 *  Deskripsi   : Kelas Main untuk demo menguji generic pada bangun datar
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 8 Mei 2025
 */


public class MBangunDatar {
    public static void main(String[] args) {
        //Persegi
        Persegi<Double> persegi = new Persegi<>(4.0);
        BangunDatarGeneric<Persegi<Double>> bdPersegi = new BangunDatarGeneric<>();
        bdPersegi.set(persegi);
        System.out.println("Persegi : ");
        bdPersegi.display();

        //Persegi Panjang
        PersegiPanjang<Integer> pp = new PersegiPanjang<>(5, 3);
        BangunDatarGeneric<PersegiPanjang<Integer>> bdPP = new BangunDatarGeneric<>();
        bdPP.set(pp);
        System.out.println("\nPersegi Panjang :");
        bdPP.display();

        //Segitiga
        Segitiga<Double> segitiga = new Segitiga<>(6.0, 4.0, 5.0, 6.0, 7.0);
        BangunDatarGeneric<Segitiga<Double>> bdSegitiga = new BangunDatarGeneric<>();
        bdSegitiga.set(segitiga);
        System.out.println("\nSegitiga : ");
        bdSegitiga.display();
    }
}
