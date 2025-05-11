/*  Nama File   : Persegi.java
 *  Deskripsi   : Program untuk mendefinisikan kelas Persegi yang merupakan turunan dari kelas Bangun Datar
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 8 Mei 2025
 */

public class Persegi<T extends Number> extends BangunDatar {
    private T sisi;

    public Persegi(T sisi) {
        this.sisi = sisi;
    }

    public T getSisi() {
        return sisi;
    }

    public void setSisi(T sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return Math.pow(sisi.doubleValue(), 2);
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi.doubleValue();
    }
}
