/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanMedium_10e;

/**
 *
 * @author rayha
 */
/*  Nama File   : Senjata.java
 *  Deskripsi   : Kelas Senjata 
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 2 Mei 2025
 */

public class Senjata {
    private String bunyi;
    private int peluru;
    private boolean menusuk;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false;
        this.peluru = 0;
    }

    public String getBunyi() {
        return bunyi;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public int getPeluru() {
        return peluru;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

    public boolean isMenusuk() {
        return menusuk;
    }

    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }
}
