/*  Nama File   : MMahasiswa.java
 *  Deskripsi   : berisi atribut dan method dalam class MMahasiswa
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 2 Maret 2025
 */

public class MMahasiswa {
    public static void main(String[] args){
    MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
    MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
    MataKuliah GKV = new MataKuliah("GKV","Grafika dan Komputasi Visuak", 3);
    MataKuliah ASA = new MataKuliah("ASA", "Analisis Strategi Algoritma", 3);
    MataKuliah RPL = new MataKuliah("RPL","Rekayasa Perangkat Lunak", 3);
    MataKuliah Siscer = new MataKuliah("Siscer", "Sistem Cerdas", 3);
    Mahasiswa MHS1 = new Mahasiswa("24060123140123", "Rayhan Septian Wijaya", "Informatika");
    Dosen DSN1 = new Dosen("12345678", "EKo Adi Sarwoko", "Informatika");
    Kendaraan KDR1 = new Kendaraan("B 124 Y", "Motor");

    MHS1.setdosenWali(DSN1);
    MHS1.setkendaraan(KDR1);
    MHS1.addMatkul(PBO);
    MHS1.addMatkul(MBD);
    MHS1.addMatkul(GKV);
    MHS1.addMatkul(ASA);
    MHS1.addMatkul(RPL);
    MHS1.addMatkul(Siscer);
    System.out.println("----------------------");
    MHS1.printDetailMhs();
    System.out.println("----------------------");
    System.out.println("Jumlah Mata Kuliah = " + MHS1.getJumlahMatKul());
    System.out.println("----------------------");
    System.out.println("Jumlah SKS Mata Kuliah = " + MHS1.getJumlahSKS());
    System.out.println("----------------------");
    
    }
}
