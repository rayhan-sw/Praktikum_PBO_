/**
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 27 Maret 2025
 */

public class RuangDosen extends Ruang {
    private String namaDosen;
    private int jumlahKursi;
    private int jumlahMeja;

    // Konstruktor dengan overloading
    public RuangDosen() {
        super();
        this.namaDosen = "";
        this.jumlahKursi = 0;
        this.jumlahMeja = 0;
    }

    public RuangDosen(String kode, double panjang, double lebar, double tinggi, 
                      int kapasitas, String namaDosen, int jumlahKursi, int jumlahMeja) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaDosen = namaDosen;
        this.jumlahKursi = jumlahKursi;
        this.jumlahMeja = jumlahMeja;
    }

    // Getter dan setter
    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public int getJumlahMeja() {
        return jumlahMeja;
    }

    public void setJumlahMeja(int jumlahMeja) {
        this.jumlahMeja = jumlahMeja;
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
               String.format(", Nama Dosen: %s, Kursi: %d, Meja: %d", 
                             namaDosen, jumlahKursi, jumlahMeja);
    }


}