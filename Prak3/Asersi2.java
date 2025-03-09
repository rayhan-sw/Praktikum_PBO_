/* Nama file: Asersi2.java
 * Deskripsi: 
 * Nama/Nim: Rayhan Septian Wijaya - 24060123140123
 * Tanggal: 8 Maret 2025 */

 //class Lingkaran
 class Lingkaran{
    private double jariJari;
    public Lingkaran (double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
 }

 //class Asersi2
 public class Asersi2{
    public static void main (String[] args){
        double jariJari = 0;
        assert (jariJari > 0): "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran (jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " +kelilingLingkaran);
    }
 }

// Sebaiknya asersinya dibuat sebelum membuat lingkaran, bukan saat setelah membuat lingkaran/objek baru dicek oleh asersi. 
//Karena asersi dibuat sesudah pembuatan lingkaran, Pembuatan Objek Lingkaran Tetap Berjalan Jika Asersi Dinonaktifkan
