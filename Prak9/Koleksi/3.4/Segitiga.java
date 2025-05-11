/*  Nama File   : Segitiga.java
 *  Deskripsi   : Program untuk mendefinisikan kelas Segitiga yang merupakan turunan dari kelas BangunDatar
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 8 Mei 2025
 */


public class Segitiga<T extends Number> extends BangunDatar {
    private T alas;
    private T tinggi;
    private T sisi1;
    private T sisi2;
    private T sisi3;

    public Segitiga(T alas, T tinggi, T sisi1, T sisi2, T sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    public T getAlas() {
        return alas;
    }

    public void setAlas(T alas) {
        this.alas = alas;
    }

    public T getTinggi() {
        return tinggi;
    }

    public void setTinggi(T tinggi) {
        this.tinggi = tinggi;
    }

    public T getSisi1() {
        return sisi1;
    }

    public void setSisi1(T sisi1) {
        this.sisi1 = sisi1;
    }

    public T getSisi2() {
        return sisi2;
    }

    public void setSisi2(T sisi2) {
        this.sisi2 = sisi2;
    }

    public T getSisi3() {
        return sisi3;
    }

    public void setSisi3(T sisi3) {
        this.sisi3 = sisi3;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas.doubleValue() * tinggi.doubleValue();
    }

    @Override
    public double hitungKeliling() {
        return sisi1.doubleValue() + sisi2.doubleValue() + sisi3.doubleValue();
    }
}
