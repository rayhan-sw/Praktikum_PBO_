/**  
* File         : Manusia.java   
* Deskripsi    : Abstract class yang mewakili entitas Manusia dengan atribut dasar
*                dan method abstract untuk perhitungan masa kerja
* Pembuat      : Rayhan Septian Wijaya
* NIM          : 24060123140123
* Tanggal      : 22 Maret 2025  
*/

public abstract class Manusia {
    protected String nama;
    protected String tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    private static int counterMns = 0;
    
  
    public Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }
   
    public Manusia(String nama, String tgl_mulai_kerja, double pendapatan) {
        this(nama, tgl_mulai_kerja, null, pendapatan);
    }
    
    // Getters and setters
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String gettgl_mulai_kerja() {
        return tgl_mulai_kerja;
    }
    
    public void settgl_mulai_kerja(String tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public double getPendapatan() {
        return pendapatan;
    }
    
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }
    
    public static int getCounterMns() {
        return counterMns;
    }
    

    public abstract int hitungMasaKerja();
    
  
    public void printInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }
}
