/**
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 27 Maret 2025
 */

public abstract class Laboratorium extends Ruang {
    private String namaLaboratorium;
    private double hargaSewa;

    // Konstruktor dengan overloading
    public Laboratorium() {
        super();
        this.namaLaboratorium = "";
        this.hargaSewa = 0;
    }

    public Laboratorium(String kode, double panjang, double lebar, double tinggi, 
                        int kapasitas, String namaLaboratorium, double hargaSewa) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaLaboratorium = namaLaboratorium;
        this.hargaSewa = hargaSewa;
    }

    // Getter dan setter
    public String getNamaLaboratorium() {
        return namaLaboratorium;
    }

    public void setNamaLaboratorium(String namaLaboratorium) {
        this.namaLaboratorium = namaLaboratorium;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    // Override metode tampilkan informasi
    @Override
    public String tampilkanInformasi() {
        return super.tampilkanInformasi() + 
               String.format(", Nama Lab: %s, Harga Sewa: %.2f", 
                             namaLaboratorium, hargaSewa);
    }
}