/**  
* File         : MManusia.java   
* Deskripsi    : Main class untuk menjalankan dan menguji implementasi
*                dari semua class
* Pembuat      : Rayhan Septian WIjaya 
* NIM          : 24060123140123
* Tanggal      : 22 Maret 2025  
*/

public class MManusia {
    public static void main(String[] args) {
        PNS p1 = new PNS("Satriyo", "01-04-2006", "Jl. Seroja", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", "01-01-2000", "Jl.Air", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", "09-01-1977", "Jl. Bunga 9 Tembalang", 5000000, "wonogiri");
        PNS p2 = new PNS("Panji", "01-04-2010", 10000000, "198004212010041002");

        p2.setAlamat("Jl. Panorama 111 Tembalang");
        
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("\nJumlah PNS = " + PNS.getCounterPNS());
        System.out.println("\nJumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("\nJumlah Petani = " + Petani.getCounterPetani());

        System.out.println("\nPajak PNS p1 = " + p1.hitungPajak());

        System.out.println("\nPajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("\nPajak Petani pt1 = " + pt1.hitungPajak());

        System.out.println("\nMasa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("\nMasa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("\nMasa Kerja pt1 = " + pt1.hitungMasaKerja());

         System.out.println("\n/~~~~~~~~~~~~~~~~~~~ Informasi Data ~~~~~~~~~~~~~~~~~~~~~~~~/");
        System.out.println("\nInformasi p1:");
        p1.printInfo();
        System.out.println("\nInformasi pe1:");
        pe1.printInfo();
        System.out.println("\nInformasi pt1:");
        pt1.printInfo();
    }
}