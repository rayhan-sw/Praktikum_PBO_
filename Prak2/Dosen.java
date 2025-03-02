/*  Nama File   : Dosen.java
 *  Deskripsi   : berisi atribut dan method dalam class Dosen
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 2 Maret 2025
 */

public class Dosen {
        //atribut
        private String NIP;
        private String Nama;
        private String Prodi;
        

    // METHOD
    // konstruktor default
    public Dosen() {
        this.NIP = "";
        this.Nama = "";
        this.Prodi = "";
    }

    // konstruktor dengan parameter
    public Dosen(String NIP, String Nama, String Prodi) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    // Selector/getter methods
    public String getNIP() {
        return this.NIP;
    }

    public String getNama() {
        return this.Nama;
    }

    public String getProdi() {
        return this.Prodi;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }
}


    
