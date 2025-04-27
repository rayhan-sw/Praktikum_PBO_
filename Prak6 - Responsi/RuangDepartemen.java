/**
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 27 Maret 2025
 */

public class RuangDepartemen extends Ruang {
    private int jumlahMeja;
    private int jumlahKursi;
    private int jumlahLemari;

    // Konstruktor dengan overloading
    public RuangDepartemen() {
        super();
        this.jumlahMeja = 0;
        this.jumlahKursi = 0;
        this.jumlahLemari = 0;
    }

    public RuangDepartemen(String kode, double panjang, double lebar, double tinggi, 
                            int kapasitas, int jumlahMeja, int jumlahKursi, int jumlahLemari) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
        this.jumlahLemari = jumlahLemari;
    }

    // Getter dan setter
    public int getJumlahMeja() {
        return jumlahMeja;
    }

    public void setJumlahMeja(int jumlahMeja) {
        this.jumlahMeja = jumlahMeja;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public int getJumlahLemari() {
        return jumlahLemari;
    }

    public void setJumlahLemari(int jumlahLemari) {
        this.jumlahLemari = jumlahLemari;
    }

    // Override metode hitung biaya kebersihan
    @Override
    public double hitungBiayaKebersihan() {
        // Jika departemen tidak null, gunakan tarif biaya kebersihan departemen
        if (departemen != null) {
            return getLuas() * departemen.getTarifBiayaKebersihan();
        }
        // Default tarif jika tidak ada departemen
        return getLuas() * 4000;
    }

    // Override metode tampilkan informasi
    @Override
    public String tampilkanInformasi() {
        return super.tampilkanInformasi() + 
               String.format(", Meja: %d, Kursi: %d, Lemari: %d", 
                             jumlahMeja, jumlahKursi, jumlahLemari);
    }

}