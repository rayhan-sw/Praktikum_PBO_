/*  Nama File   : Pegawai.java
 *  Deskripsi   : Superclass untuk semua pegawai perguruan tinggi
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 16 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pegawai {
    private String nip;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate tmt;
    private double gajiPokok;


    
    public static final DateTimeFormatter FORMATTGL = DateTimeFormatter.ofPattern("d MMMM yyyy");
    
    public Pegawai() {
        this.nip = "";
        this.nama = "";
        this.tanggalLahir = LocalDate.now();
        this.tmt = LocalDate.now();
        this.gajiPokok = 0.0;
    }

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok){
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public LocalDate getTmt() {
        return tmt;
    }

    public double getGajiPokok(){
        return gajiPokok;
    }


    public void setNip(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setTanggalLahir(LocalDate tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public void setTmt(LocalDate tmt) {
        this.tmt = tmt;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }


    public int getMasaKerja() {
        return Period.between(tmt, LocalDate.now()).getYears();
    }

    public double getTunjangan() {
        return 0.02 * getMasaKerja() * getGajiPokok();
    }

    public void printInfo() {
        System.out.println("NIP: " + getNip());
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal Lahir : " + getTanggalLahir().format(FORMATTGL));
        System.out.println("TMT : " + getTmt().format(FORMATTGL));
        System.out.println("Masa Kerja : " + getMasaKerja() + " tahun");
        System.out.println("Gaji Pokok : Rp. " + getGajiPokok());
        System.out.println("Tunjangan : Rp " + getTunjangan());
    }
}