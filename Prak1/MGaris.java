/*
Nama File       : MGaris.java
Deskripsi       : berisi atribut dan method dalam class garis
Pembuat         : Rayhan Septian Wijaya - 24060123140123
Tanggal         : 23-2-2025
*/

public class MGaris {
    public static void main(String[] args) {
        Titik A = new Titik(5,4);
        Titik B = new Titik(5,-4);

        Garis garis1 = new Garis(); // Konstruktor default
        System.out.println("Garis 1: ");
        garis1.printGaris();
        
        Garis garis2 = new Garis(A,B);
        System.out.println("Garis 2: ");
        garis2.printGaris();

        Garis garis3 = new Garis(new Titik(-5,4), new Titik(-5,-4));
        System.out.println("Garis 3: ");
        garis3.printGaris();

        // Counter Garis
        System.out.println("----------------------");
        System.out.println("Jumlah objek Garis yang telah dibuat: " + Garis.getCounterGaris());

        //Panjang Garis
        System.out.println("----------------------");
        System.out.println("Panjang Garis 2: " + garis2.getPanjangGaris());
        System.out.println("Panjang Garis 3: " + garis3.getPanjangGaris());

        //Gradien Garis
        System.out.println("----------------------");
        System.out.println("Gradien Garis 1: " + garis1.getGradien());

        //Titik tengah
        System.out.println("----------------------");
        Titik titikTengah = garis2.getTitikTengah();
        System.out.println("Titik tengah Garis 2: (" + titikTengah.getAbsis() + ", " + titikTengah.getordinat() + ")");

        //Apakah Sejajar?
        System.out.println("----------------------");
        System.out.println("Apakah Garis 2 sejajar dengan Garis 3? " + garis2.isSejajar(garis3));

        //Apakah Tegak Lurus?
        System.out.println("----------------------");
        System.out.println("Apakah Garis 2 tegak lurus dengan Garis 3? " + garis2.isTegakLurus(garis3));

        //Persamaan Garis
        System.out.println("----------------------");
        System.out.println("Persamaan Garis dari Titik (0,0) ke (1,1): ");
        System.out.println(garis1.getPersamaanGaris());

    }

}



