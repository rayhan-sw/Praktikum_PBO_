/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LatihanVeryEasy_10d;

/**
 *
 * @author rayha
 */
/*  Nama File   : TestSenjata.java
 *  Deskripsi   : Main class Senjata 
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 2 Mei 2025
 */

public class TestSenjata {
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");
        
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 Mengisi Peluru: ");
        ak47.setPeluru(5);
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        
        System.out.println("AK47 Menembak");
        ak47.menembak(); 
    }
}
