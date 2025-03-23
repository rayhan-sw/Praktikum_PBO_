/**  
* File         : PNS.java   
* Deskripsi    : Class yang mewakili Pegawai Negeri Sipil
* Pembuat      : Rayhan Septian Wijaya 
* NIM          : 24060123140123
* Tanggal      : 22 Maret 2025  
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;


    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public PNS(String nama, String tgl_mulai_kerja, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public int hitungMasaKerja() {
        int A = 3; 

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate startDate = LocalDate.parse(tgl_mulai_kerja, formatter);
        LocalDate now = LocalDate.now();

        Period period = Period.between(startDate, now);
        return period.getYears() + A;
    }

    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIP: " + nip);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + hitungPajak());
    }
}
