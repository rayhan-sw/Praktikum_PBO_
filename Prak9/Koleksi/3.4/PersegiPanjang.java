/*  Nama File   : PersegiPanjang.java
 *  Deskripsi   : Program untuk mendefinisikan kelas Persegi Panjang yang merupakan turunan dari kelas Bangun Datar
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 8 Mei 2025
 */

public class PersegiPanjang<T extends Number> extends BangunDatar {
    private T panjang;
    private T lebar;

    public PersegiPanjang(T panjang, T lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public T getPanjang() {
        return panjang;
    }

    public void setPanjang(T panjang) {
        this.panjang = panjang;
    }

    public T getLebar() {
        return lebar;
    }

    public void setLebar(T lebar) {
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        return panjang.doubleValue() * lebar.doubleValue();
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang.doubleValue() + lebar.doubleValue());
    }
}
