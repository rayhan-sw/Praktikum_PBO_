/**
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 27 Maret 2025
 */

import java.util.ArrayList;
import java.util.List;

public class Departemen {
    private String nama;
    private String ketuaDepartemen;
    private double tarifBiayaKebersihan;
    
    // List untuk menyimpan ruangan yang terkait dengan departemen
    private List<Ruang> daftarRuangan;
    private List<RuangDosen> ruangDosenList;
    private List<RuangDepartemen> ruangDepartemenList;
    private List<Laboratorium> laboratoriumList;

    // Konstruktor
    public Departemen() {
        this.daftarRuangan = new ArrayList<>();
        this.ruangDosenList = new ArrayList<>();
        this.ruangDepartemenList = new ArrayList<>();
        this.laboratoriumList = new ArrayList<>();
    }

    public Departemen(String nama, String ketuaDepartemen, double tarifBiayaKebersihan) {
        this.nama = nama;
        this.ketuaDepartemen = ketuaDepartemen;
        this.tarifBiayaKebersihan = tarifBiayaKebersihan;
        this.daftarRuangan = new ArrayList<>();
        this.ruangDosenList = new ArrayList<>();
        this.ruangDepartemenList = new ArrayList<>();
        this.laboratoriumList = new ArrayList<>();
    }

    // Getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKetuaDepartemen() {
        return ketuaDepartemen;
    }

    public void setKetuaDepartemen(String ketuaDepartemen) {
        this.ketuaDepartemen = ketuaDepartemen;
    }

    public double getTarifBiayaKebersihan() {
        return tarifBiayaKebersihan;
    }

    public void setTarifBiayaKebersihan(double tarifBiayaKebersihan) {
        this.tarifBiayaKebersihan = tarifBiayaKebersihan;
    }

    // Getter untuk daftar ruangan
    public List<Ruang> getDaftarRuangan() {
        return daftarRuangan;
    }

    public void tambahRuangan(Ruang ruang) {
        daftarRuangan.add(ruang);
        ruang.setDepartemen(this);
    }

    public void tambahRuangDosen(RuangDosen ruangDosen) {
        daftarRuangan.add(ruangDosen);
        ruangDosenList.add(ruangDosen);
        ruangDosen.setDepartemen(this);
    }

    public void tambahRuangDepartemen(RuangDepartemen ruangDepartemen) {
        daftarRuangan.add(ruangDepartemen);
        ruangDepartemenList.add(ruangDepartemen);
        ruangDepartemen.setDepartemen(this);
    }

    public void tambahLaboratorium(Laboratorium laboratorium) {
        daftarRuangan.add(laboratorium);
        laboratoriumList.add(laboratorium);
        laboratorium.setDepartemen(this);
    }
}