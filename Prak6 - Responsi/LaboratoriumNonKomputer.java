/**
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 27 Maret 2025
 */

public class LaboratoriumNonKomputer extends Laboratorium {
    private String[] mataKuliah;
    private static final double TARIF_KEBERSIHAN = 6000; // Tarif kebersihan lab non-komputer

    // Konstruktor dengan overloading
    public LaboratoriumNonKomputer() {
        super();
        this.mataKuliah = new String[0];
    }

    public LaboratoriumNonKomputer(String kode, double panjang, double lebar, double tinggi, 
                                    int kapasitas, String namaLaboratorium, 
                                    double hargaSewa, String[] mataKuliah) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLaboratorium, hargaSewa);
        this.mataKuliah = mataKuliah;
    }

    // Getter untuk mata kuliah
    public String[] getMataKuliah() {
        return mataKuliah;
    }
    public void setMataKuliah(String[] mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    // Override metode hitung biaya kebersihan
    @Override
    public double hitungBiayaKebersihan() {
        return getLuas() * TARIF_KEBERSIHAN;
    }

    // Override metode tampilkan informasi
    @Override
    public String tampilkanInformasi() {
        StringBuilder mataKuliahStr = new StringBuilder();
        for (String mk : mataKuliah) {
            mataKuliahStr.append(mk).append(", ");
        }
        return super.tampilkanInformasi() + 
               String.format(", Mata Kuliah: %s", 
                             mataKuliahStr.length() > 0 ? 
                             mataKuliahStr.substring(0, mataKuliahStr.length() - 2) : 
                             "Tidak ada");
    }


}