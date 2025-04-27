/**
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 27 Maret 2025
 */

public class RuangKelas extends Ruang {
    private int jumlahKursiTersedia;
    private int jumlahKursiRusak;
    private static final double TARIF_KEBERSIHAN = 5000; // Tarif kebersihan untuk ruang kelas

    // Konstruktor dengan overloading
    public RuangKelas() {
        super();
        this.jumlahKursiTersedia = 0;
        this.jumlahKursiRusak = 0;
    }

    public RuangKelas(String kode, double panjang, double lebar, double tinggi, 
                      int kapasitas, int jumlahKursiTersedia, int jumlahKursiRusak) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.jumlahKursiTersedia = jumlahKursiTersedia;
        this.jumlahKursiRusak = jumlahKursiRusak;
    }

    // Getter dan setter
    public int getJumlahKursiTersedia() {
        return jumlahKursiTersedia;
    }

    public void setJumlahKursiTersedia(int jumlahKursiTersedia) {
        this.jumlahKursiTersedia = jumlahKursiTersedia;
    }

    public int getJumlahKursiRusak() {
        return jumlahKursiRusak;
    }

    public void setJumlahKursiRusak(int jumlahKursiRusak) {
        this.jumlahKursiRusak = jumlahKursiRusak;
    }

    // Override metode hitung biaya kebersihan
    @Override
    public double hitungBiayaKebersihan() {
        // Perhitungan biaya kebersihan untuk ruang kelas
        return getLuas() * TARIF_KEBERSIHAN;
    }

    // Override metode tampilkan informasi
    @Override
    public String tampilkanInformasi() {
        return super.tampilkanInformasi() + 
               String.format(", Kursi Tersedia: %d, Kursi Rusak: %d", 
                             jumlahKursiTersedia, jumlahKursiRusak);
    }

}