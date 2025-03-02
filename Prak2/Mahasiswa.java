/*  Nama File   : Mahasiswa.java
 *  Deskripsi   : berisi atribut dan method dalam class Mahasiswa
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 2 Maret 2025
 */

import java.util.ArrayList;

public class Mahasiswa {
    //Atribut
    private String NIM;
    private String Nama;
    private String Prodi;
    private ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;


    //Methode
    //Konstruktor 
    public Mahasiswa() {
        this.listMatKul = new ArrayList<MataKuliah>();
    }

    //Konstruktor dengan Parameter
    public Mahasiswa(String NIM, String Nama, String Prodi){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Prodi = Prodi;
        this.listMatKul = new ArrayList<MataKuliah>();
 
    }

    //Selektor/getter Methods
    public void setNIM (String NIM){
        this.NIM = NIM;
    }

    public String getNIM (){
        return this.NIM;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public String getNama(){
        return this.Nama;
    }

    public void setProdi(String Prodi){
        this.Prodi = Prodi;
    }

    public String getProdi(){
        return this.Prodi;
    }

    public void setdosenWali (Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public Dosen getdosenWali (){
        return this.dosenWali;
    }

    public void setkendaraan (Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    public Kendaraan getkendaraan(){
        return this.kendaraan;
    }

    public void addMatkul(MataKuliah mataKuliah) {
        if (this.listMatKul.size() < 50){
            this.listMatKul.add(mataKuliah);
        }
        else {
            System.out.println("List Mata Kuliah sudah penuh");
        }
    }

    public int getJumlahSKS(){
        int totalSKS = 0;
        for (MataKuliah mataKuliah : this.listMatKul) {
            totalSKS += mataKuliah.getSKS();
        }
        return totalSKS;
    }

    public int getJumlahMatKul(){
        return this.listMatKul.size();
    }

    public void printMhs(){
        System.out.println("NIM : "+ this.NIM);
        System.out.println("Nama : "+ this.Nama);
        System.out.println("Prodi : "+ this.Prodi);
    }

    public void printDetailMhs(){
        System.out.println("Dosen Wali : "+ this.dosenWali.getNama()) ;
        System.out.println("NIM : "+ this.NIM) ;
        System.out.println("Nama : "+ this.Nama) ;
        System.out.println("Prodi : "+ this.Prodi) ;
        System.out.println("Kendaraan Mahasiswa : "+ this.kendaraan.getJenis()) ;
        System.out.println("No Plat Kendaraan : "+ this.kendaraan.getNoPlat()) ;
        int i ;
        for(i = 0 ; i < this.listMatKul.size() ; i++){
            System.out.println("Daftar Mata Kuliah ke - "+(i+1)+" : "+this.listMatKul.get(i).getNama()) ;
        }
    }

}
