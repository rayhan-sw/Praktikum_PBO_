/**
 * Nama         : Overloading.java
 * Deskripsi    : Polimorfisme dengan method overloading
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 24 April 2025
 */


public class Overloading {
    int tambah (int x, int y){
        return x + y;
    }
    int tambah (int x, int y, int z){
        return x + y + z;
    }
    double tambah (double x, double y){
        return x + y;
    }
    double tambah (int y, double x){
        return y + x;
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        System.out.println(o.tambah(1, 2));
        System.out.println(o.tambah(1, 2, 3));
        System.out.println(o.tambah(2, 1.0));
    }
}