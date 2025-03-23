public abstract class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public abstract double getLuas();

    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }  

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Bangun Datar : " + counterBangunDatar);
    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    
    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo(){
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}

// 1. Apakah method yang dibuat pada langkah nomor 4 dapat digunakan untuk membandingkan objek bangun datar yang berbeda?
// Ya, method isEqualLuas() dan isEqualKeliling() dapat digunakan untuk membandingkan objek bangun datar yang berbeda, seperti persegi dan lingkaran. 
// Hal ini karena method tersebut membandingkan nilai hasil dari getLuas() dan getKeliling() yang telah diimplementasikan dalam masing-masing subclass, bukan langsung membandingkan objeknya.

// 2. Jika BangunDatar tidak dijadikan sebagai abstract class, dapatkah Anda membuat method isEqualLuas() dan isEqualKeliling() pada class BangunDatar? Mengapa?
// Bisa, tetapi kurang optimal. Jika BangunDatar bukan abstract class, kita harus memberikan implementasi default untuk getLuas() dan getKeliling(), yang tidak masuk akal karena setiap bentuk memiliki 
// rumus yang berbeda. Dengan menjadikannya abstract class, kita memaksa subclass untuk mengimplementasikan metode tersebut secara spesifik.

// 3. Apakah kelebihan saat class BangunDatar dijadikan sebagai abstract class daripada non-abstract class?
// - Memastikan semua subclass memiliki implementasi getLuas() dan getKeliling(), menghindari nilai default yang tidak sesuai.
// - Memungkinkan penggunaan polimorfisme sehingga kita dapat menggunakan referensi BangunDatar untuk objek dari subclass seperti Persegi dan Lingkaran.
// - Memudahkan perluasan program dengan menambahkan bentuk baru tanpa mengubah struktur utama.