/*  Nama File   : DosenTamu.java
 *  Deskripsi   : Dosen tamu dengan NIDK dan kontrak berakhir
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 16 Maret 2025
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class DosenTamu extends Dosen {
    private String nidk;
    private LocalDate tglAkhirKontrak;

    public static final DateTimeFormatter FORMATTGL = DateTimeFormatter.ofPattern("d MMMM yyyy");

    public String getNidk() {
        return nidk;
    }

    public LocalDate gettglAkhirKontrak() {
        return tglAkhirKontrak;
    }

    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    public void settglAkhirKontrak(LocalDate tglAkhirKontrak) {
        this.tglAkhirKontrak = tglAkhirKontrak;
    }

    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidk, LocalDate tglAkhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tglAkhirKontrak = tglAkhirKontrak;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK : " + getNidk());
        System.out.println("Jabatan: Dosen Tamu");
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("Tanggal Berakhir Kontrak : " + gettglAkhirKontrak().format(FORMATTGL));
    }
}