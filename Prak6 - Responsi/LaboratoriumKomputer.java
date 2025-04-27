/**
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 27 Maret 2025
 */

public class LaboratoriumKomputer extends Laboratorium {
    private int jumlahKomputer;
    private static final double TARIF_KEBERSIHAN = 7500; // Tarif kebersihan lab komputer

    // Konstruktor dengan overloading
    public LaboratoriumKomputer() {
        super();
        this.jumlahKomputer = 0;
    }

    public LaboratoriumKomputer(String kode, double panjang, double lebar, double tinggi, 
                                 int kapasitas, String namaLaboratorium, 
                                 double hargaSewa, int jumlahKomputer) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLaboratorium, hargaSewa);
        this.jumlahKomputer = jumlahKomputer;
    }

    // Getter untuk jumlah komputer
    public int getJumlahKomputer() {
        return jumlahKomputer;
    }

    public void setJumlahKomputer(int jumlahKomputer) {
        this.jumlahKomputer = jumlahKomputer;
    }
    
    // Override metode hitung biaya kebersihan
    @Override
    public double hitungBiayaKebersihan() {
        return getLuas() * TARIF_KEBERSIHAN;
    }

    // Override metode tampilkan informasi
    @Override
    public String tampilkanInformasi() {
        return super.tampilkanInformasi() + 
               String.format(", Jumlah Komputer: %d", jumlahKomputer);
    }

}