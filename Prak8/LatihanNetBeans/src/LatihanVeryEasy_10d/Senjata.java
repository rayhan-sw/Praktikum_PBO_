/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanVeryEasy_10d;

/**
 *
 * @author rayha
 */
/*  Nama File   : Senjata.java
 *  Deskripsi   : Kelas senjata 
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 2 Mei 2025
 */

public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

    public String getBunyi() {
        return bunyi;
    }

    public int getPeluru() {
        return peluru;
    }
    
    public void menembak(){
        if (this.getPeluru() > 0) {
            System.out.println(this.getBunyi());
            this.setPeluru(this.getPeluru() - 1);
            System.out.println("Sisa Peluru: " + this.getPeluru());
        }
        else{
            System.out.println("Peluru Habis");
        }
    }
}
