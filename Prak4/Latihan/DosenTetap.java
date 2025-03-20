/*  Nama File   : DosenTetap.java
 *  Deskripsi   : Dosen tetap dengan NIDN dan tunjangan 2%
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 16 Maret 2025
 */


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


class DosenTetap extends Dosen {
    private String nidn;
    private LocalDate bup;

    public static final DateTimeFormatter FORMATTGL = DateTimeFormatter.ofPattern("d MMMM yyyy");

    public String getNidn() {
        return nidn;
    }

    public LocalDate getBup() {
        return bup;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public void setBup(LocalDate bup) {
        this.bup = bup;
    }

    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidn) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas); 
        this.nidn = nidn;
        this.bup = tanggalLahir.plusYears(65).plusMonths(1);
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN : " + getNidn());
        System.out.println("Jabatan: Dosen Tetap");
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("BUP : " + getBup().format(FORMATTGL));
    } 
}