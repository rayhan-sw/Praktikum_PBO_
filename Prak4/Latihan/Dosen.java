/*  Nama File   : Dosen.java
 *  Deskripsi   : Subclass dari Pegawai untuk dosen universitas
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 16 Maret 2025
 */

import java.time.LocalDate;

public class Dosen extends Pegawai {
    private String fakultas;

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas : " + getFakultas());
    }
}
