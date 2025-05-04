/*  Nama File   : Datum.java
 *  Deskripsi   : Kelas Datum yang merupakan kelas generik untuk menyimpan data
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 3 Mei 2025
 */

 public class Datum<T> {
    private T isi;

    public Datum(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isi) {
        this.isi = isi;
    }
}