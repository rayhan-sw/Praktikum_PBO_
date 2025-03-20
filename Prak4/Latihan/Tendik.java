/*  Nama File   : Tendik.java
 *  Deskripsi   : Tenaga kependidikan dengan bidang dan tunjangan 1%
 *  Pembuat     : Rayhan Septian WIjaya
 *  NIM         : 24060123140123
 *  Tanggal     : 16 Maret 2025
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Tendik extends Pegawai {
    private String bidang;
    private LocalDate bup;
    public static final DateTimeFormatter FORMATTGL = DateTimeFormatter.ofPattern("d MMMM yyyy");


    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public LocalDate getBup() {
        return bup;
    }

    public void setBup(LocalDate bup) {
        this.bup = bup;
    }

    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
        this.bup = tanggalLahir.plusYears(55).plusMonths(1);
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bidang : " + getBidang());
        System.out.println("BUP : " + getBup().format(FORMATTGL));
    }
}