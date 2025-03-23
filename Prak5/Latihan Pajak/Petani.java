/**  
* File         : Petani.java   
* Deskripsi    : Class yang mewakili Petani, turunan dari Manusia
* Pembuat      : Rayhan Septian Wijaya
* NIM          : 24060123140123
* Tanggal      : 22 Maret 2025  
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;


    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public Petani(String nama, String tgl_mulai_kerja, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Getter dan setter
    public String getasal_kota() {
        return asal_kota;
    }

    public void setasal_kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }


    @Override
    public int hitungMasaKerja() {
        int C = 1; 

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate startDate = LocalDate.parse(tgl_mulai_kerja, formatter);
        LocalDate now = LocalDate.now();

        Period period = Period.between(startDate, now);
        return period.getYears() + C;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Kota Ladang: " + asal_kota);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + hitungPajak());
    }
}
