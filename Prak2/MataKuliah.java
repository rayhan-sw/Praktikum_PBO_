/*  Nama File   : Matakuliah.java
 *  Deskripsi   : berisi atribut dan method dalam class Mata Kuliah
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 2 Maret 2025
 */

public class MataKuliah {
    // ATRIBUT
    private String idMatkul;
    private String Nama;
    private int SKS;

    // METHOD
    /// konstruktor default
    public MataKuliah() {
        this.idMatkul = "";
        this.Nama = "";
        this.SKS = 0;
    }

    // konstruktor dengan parameter
    public MataKuliah(String idMatkul, String Nama, int SKS) {
        this.idMatkul = idMatkul;
        this.Nama = Nama;
        this.SKS = SKS;
    }

    // Selector/getter methods
    public String getidMatkul() {
        return this.idMatkul;
    }

    public String getNama() {
        return this.Nama;
    }

    public int getSKS() {
        return this.SKS;
    }

    public void setidMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setSKS(int SKS){
        this.SKS = SKS;
    }
}