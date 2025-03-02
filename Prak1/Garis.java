/*
Nama File       : Garis.java
Deskripsi       : Berisi atribut dan method dalam class Garis
Pembuat         : Rayhan Septian Wijaya - 24060123140123
Tanggal         : 23-2-2025
*/

public class Garis {
    /* ATRIBUT */
    private Titik TitikMula;
    private Titik TitikAkhir;
    private static int CounterGaris = 0;

    /* METHOD */

    // Konstruktor untuk membuat garis ((0,0),(1,1))
    public Garis() {
        this.TitikMula = new Titik(0, 0); 
        this.TitikAkhir = new Titik(1, 1);
        CounterGaris++;
    }

    // Konstruktor untuk membuat garis ((x1,y1),(x2,y2))
    public Garis(Titik TitikMula, Titik TitikAkhir) {
        this.TitikMula = TitikMula;
        this.TitikAkhir = TitikAkhir;
        CounterGaris++;
    }

    // Mengembalikan nilai TitikMula
    public Titik getTitikMula() {
        return TitikMula;
    }

    // Mengembalikan nilai TitikAkhir
    public Titik getTitikAkhir() {
        return TitikAkhir;
    }

    // Mengembalikan nilai CounterGaris
    public static int getCounterGaris() {
        return CounterGaris;
    }

    // Mengubah/set TitikMula
    public void setTitikMula(Titik TitikMula) {
        this.TitikMula = TitikMula;
    }

    // Mengubah/set TitikAkhir
    public void setTitikAkhir(Titik TitikAkhir) {
        this.TitikAkhir = TitikAkhir;
    }

    // Mengembalikan nilai panjang garis
    public double getPanjangGaris() {
        return Math.sqrt(
            (TitikAkhir.getAbsis() - TitikMula.getAbsis()) * (TitikAkhir.getAbsis() - TitikMula.getAbsis()) + (TitikAkhir.getordinat() - TitikMula.getordinat()) * (TitikAkhir.getordinat() - TitikMula.getordinat()));
    }

    // Mengembalikan nilai gradien garis
    public double getGradien() {
        return (
            (TitikAkhir.getordinat() - TitikMula.getordinat()) / (TitikAkhir.getAbsis() - TitikMula.getAbsis()));
    }

    // Mengembalikan titik tengah garis
    public Titik getTitikTengah() {
        double tengahX = (TitikMula.getAbsis() + TitikAkhir.getAbsis()) / 2;
        double tengahY = (TitikMula.getordinat() + TitikAkhir.getordinat()) / 2;
        return new Titik(tengahX, tengahY);
    }

    // Mengecek apakah garis sejajar dengan garis lain
    public boolean isSejajar(Garis garisLain) {
        return this.getGradien() == garisLain.getGradien();
    }

    // Mengecek apakah garis tegak lurus dengan garis lain
    public boolean isTegakLurus(Garis garisLain) {
        return this.getGradien() * garisLain.getGradien() == -1;
    }

    // Menampilkan titik awal dan akhir garis
    public void printGaris() {
        System.out.println("Garis dari Titik awal (" + TitikMula.getAbsis() + ", " + TitikMula.getordinat() + ") ke Titik (" + TitikAkhir.getAbsis() + ", " + TitikAkhir.getordinat() + ")");
    }

    // Mengembalikan persamaan garis dalam bentuk y = mx + c
    public String getPersamaanGaris() {
        double m = getGradien();
        double c = TitikMula.getordinat() - m * TitikMula.getAbsis();
        return "y = " + m + "x + " + c;
    }
} // end class Garis
