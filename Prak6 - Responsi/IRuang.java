/**
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 27 Maret 2025
 */

public interface IRuang {
    /**
     * Menghitung biaya kebersihan ruangan
     * @return 
     */
    double hitungBiayaKebersihan();
    
    /**
     * Menampilkan informasi detail ruangan
     * @return 
     */
    String tampilkanInformasi();
    
    /**
     * Mendapatkan luas ruangan
     * @return 
     */
    double getLuas();
}