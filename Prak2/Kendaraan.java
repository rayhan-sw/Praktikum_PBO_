/*  Nama File   : Kendaraan.java
 *  Deskripsi   : berisi atribut dan method dalam class Kendaraan
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 2 Maret 2025
 */

public class Kendaraan {
    //Atribut
    private String noPlat;
    private String Jenis;

    //Method
    // konstruktur default
    public Kendaraan(){
        this.noPlat = "";
        this.Jenis = "";
    }

    // konstruktor dengan parameter
    public Kendaraan(String noPlat, String Jenis){
        this.noPlat = noPlat;
        this.Jenis = Jenis;
    }

    // Selector/getter methods
    public String getNoPlat(){
        return this.noPlat;
    }

    public String getJenis(){
        return this.Jenis;
    }

    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        if (Jenis.toLowerCase().equals("motor") || Jenis.toLowerCase().equals("mobil")) {
            this.Jenis = Jenis.toLowerCase();
        } else {
            System.out.println("Jenis Kendaraan Harus Motor atau Mobil");
        }
    }
}


