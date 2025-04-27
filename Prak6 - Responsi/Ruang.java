/**
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 27 Maret 2025
 */

public abstract class Ruang implements IRuang {
    // Atribut dasar ruangan
    private String kode;
    private double panjang;
    private double lebar;
    private double tinggi;
    private int kapasitas;
    protected Departemen departemen;

    // Konstruktor dengan overloading
    public Ruang() {
        this("", 0, 0, 0, 0);
    }

    public Ruang(String kode, double panjang, double lebar, double tinggi, int kapasitas) {
        this.kode = kode;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.kapasitas = kapasitas;
    }

     // Getter dan setter dengan enkapsulasi
     public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    // Getter dan setter lainnya...

    // Metode untuk set departemen (agregasi)
    public void setDepartemen(Departemen departemen) {
        this.departemen = departemen;
    }

    public Departemen getDepartemen() {
        return departemen;
    }

    // Implementasi metode dari interface
    @Override
    public double getLuas() {
        return panjang * lebar;
    }

    // Abstract method untuk biaya kebersihan
    public abstract double hitungBiayaKebersihan();

    // Metode untuk menampilkan informasi dengan overriding
    @Override
    public String tampilkanInformasi() {
        return String.format("Kode: %s, Panjang: %.2f, Lebar: %.2f, Tinggi: %.2f, Kapasitas: %d", 
                             kode, panjang, lebar, tinggi, kapasitas);
    }


}