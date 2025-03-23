/**  
* File         : Pengusaha.java   
* Deskripsi    : Class yang mewakili Pengusaha, turunan dari Manusia
*                dan mengimplementasikan interface Pajak dengan perhitungan
*                masa kerja dan pajak yang spesifik
* Pembuat      : Rayhan Septian Wijaya
* NIM          : 24060123140123
* Tanggal      : 22 Maret 2025  
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;


    public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public Pengusaha(String nama, String tgl_mulai_kerja, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Getters and setters
    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }


    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public int hitungMasaKerja() {
        int B = 2; 

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate startDate = LocalDate.parse(tgl_mulai_kerja, formatter);
        LocalDate now = LocalDate.now();

        Period period = Period.between(startDate, now);
        return period.getYears() + B;
    }

 
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NPWP: " + npwp);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + hitungPajak());
    }
}