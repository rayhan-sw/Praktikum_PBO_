/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihannetbeans_10c;

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
    private boolean menusuk;
    
    public Senjata (String bunyi) {
        this.bunyi = bunyi;
    }

    private String getBunyi() {
        return bunyi;
    }

    private boolean isMenusuk() {
        return menusuk;
    }

    private void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    private void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }
    
    public void menembak(int jumlah) {
        for (int i = 0 ; i < jumlah ; i++){
            System.out.print(getBunyi() + " ");
        }
        System.out.println("");
    }
    
    public void pasangBayonet(){
        setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
    
    public String menusuk(){
        if(isMenusuk()){
            return " Jleb";
        }
        else{
            return "Gagal, belum pasang bayonet";
        }
    }
}
