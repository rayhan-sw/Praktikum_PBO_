/**
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 27 Maret 2025
 */

public class Main {
    public static void main(String[] args) {
        // Membuat departemen
        Departemen departemenInformatika = new Departemen("Informatika", "Dr. Rayhan Septian", 4500);
        Departemen departemenSistem = new Departemen("Sistem Informasi", "Dr. Rajwaa Muflihul", 4000);
        Departemen departemenBiologi = new Departemen("Biologi", "Dr. Rafi Hendiansyah", 4200);

        // Membuat Ruang Kelas
        RuangKelas kelasA = new RuangKelas("K001", 8, 6, 3, 40, 40, 2);
        RuangKelas kelasB = new RuangKelas("K002", 7, 5, 3, 35, 35, 3);
        RuangKelas kelasC = new RuangKelas("K003", 9, 7, 3.5, 45, 42, 1);

        // Membuat Laboratorium
        LaboratoriumKomputer labKomputer1 = new LaboratoriumKomputer(
            "LK001", 10, 8, 3, 30, "Lab Komputer Utama", 5000, 30
        );
        
        LaboratoriumKomputer labKomputer2 = new LaboratoriumKomputer(
            "LK002", 12, 9, 3.5, 35, "Lab Komputer Lanjutan", 5500, 35
        );

        String[] mataKuliahBiologi = {"Biologi Umum", "Mikrobiologi", "Genetika"};
        LaboratoriumNonKomputer labBiologi = new LaboratoriumNonKomputer(
            "LB001", 12, 9, 4, 25, "Lab Biologi", 6000, mataKuliahBiologi
        );

        String[] mataKuliahFisika = {"Fisika Dasar", "Mekanika", "Termodinamika"};
        LaboratoriumNonKomputer labFisika = new LaboratoriumNonKomputer(
            "LF001", 11, 8, 3.5, 20, "Lab Fisika", 6200, mataKuliahFisika
        );

        // Membuat Ruang Departemen
        RuangDepartemen ruangInfoDept = new RuangDepartemen(
            "RD001", 15, 10, 4, 20, 10, 15, 5
        );

        RuangDepartemen ruangSistemDept = new RuangDepartemen(
            "RD002", 14, 9, 4, 18, 8, 12, 4
        );

        // Membuat Ruang Dosen
        RuangDosen ruangDosenBudi = new RuangDosen(
            "RDS001", 6, 4, 3, 2, "Dr. Rayhan Septian", 2, 1
        );

        RuangDosen ruangDosenAni = new RuangDosen(
            "RDS002", 5.5, 4, 3, 2, "Dr. Rajwaa Muflihuul", 2, 1
        );

        // Menambahkan ruangan ke departemen
        departemenInformatika.tambahRuangan(kelasA);
        departemenInformatika.tambahRuangan(kelasB);
        departemenInformatika.tambahLaboratorium(labKomputer1);
        departemenInformatika.tambahLaboratorium(labKomputer2);
        departemenInformatika.tambahRuangDepartemen(ruangInfoDept);
        departemenInformatika.tambahRuangDosen(ruangDosenBudi);

        departemenSistem.tambahRuangan(kelasC);
        departemenSistem.tambahRuangDepartemen(ruangSistemDept);
        departemenSistem.tambahRuangDosen(ruangDosenAni);

        departemenBiologi.tambahLaboratorium(labBiologi);
        departemenBiologi.tambahLaboratorium(labFisika);

        // Fungsi untuk menampilkan detail departemen
        tampilkanDetailDepartemen(departemenInformatika);
        tampilkanDetailDepartemen(departemenSistem);
        tampilkanDetailDepartemen(departemenBiologi);

        // dengan Interface
        System.out.println("\n~~~~~~~~~~~~ DENGAN INTERFACE ~~~~~~~~~~~~");
        IRuang[] ruanganInterface = {
            kelasA, kelasB, kelasC,
            labKomputer1, labKomputer2, labBiologi, labFisika,
            ruangInfoDept, ruangSistemDept,
            ruangDosenBudi, ruangDosenAni
        };

        double totalBiayaKebersihan = 0;
        int jumlahRuangan = 0;

        for (IRuang ruang : ruanganInterface) {
            System.out.println("\nInformasi Ruang via Interface:");
            System.out.println(ruang.tampilkanInformasi());
            double biayaKebersihan = ruang.hitungBiayaKebersihan();
            System.out.printf("Biaya Kebersihan: Rp %.2f\n", biayaKebersihan);
            
            totalBiayaKebersihan += biayaKebersihan;
            jumlahRuangan++;
        }

        // Statistik Total
        System.out.println("\n~~~~~~~~~~~~ STATISTIK TOTAL ~~~~~~~~~~~~");
        System.out.printf("Total Ruangan: %d\n", jumlahRuangan);
        System.out.printf("Total Biaya Kebersihan Seluruh Ruangan: Rp %.2f\n", totalBiayaKebersihan);
        System.out.printf("Rata-rata Biaya Kebersihan per Ruangan: Rp %.2f\n", 
                          totalBiayaKebersihan / jumlahRuangan);
    }

    // Fungsi untuk menampilkan detail departemen
    public static void tampilkanDetailDepartemen(Departemen departemen) {
        System.out.println("\n~~~~~~~~~~~~ DETAIL DEPARTEMEN: " + departemen.getNama() + " ~~~~~~~~~~~~");
        System.out.println("Ketua Departemen: " + departemen.getKetuaDepartemen());
        System.out.println("Tarif Biaya Kebersihan: Rp " + departemen.getTarifBiayaKebersihan());
    
        System.out.println("\nDaftar Ruangan:");
        for (Ruang ruang : departemen.getDaftarRuangan()) {
            System.out.println("\n" + ruang.tampilkanInformasi());
            System.out.printf("Luas Ruangan: %.2f m²\n", ruang.getLuas());
            System.out.printf("Biaya Kebersihan: Rp %.2f\n", ruang.hitungBiayaKebersihan());
        }
    }
}