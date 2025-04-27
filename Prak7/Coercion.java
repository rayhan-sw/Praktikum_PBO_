/**
 * Nama         : Coercion.java
 * Deskripsi    : Polimorfisme dengan coercion
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 24 April 2025
 */

public class Coercion {
    public static void main(String[] args) {
        // Program nomer 1
        int output1 = 'a';
        System.out.println(output1);

        /** Output: 97 (Berhasil)
         * Penjelasan: Dari ASCII code a merupakan 97,
         * a dikonversi oleh kompiler secara implisit
         */

         // Program nomer 2
         //double x = 15.5;
         //int output2 = x;
        //System.out.println(output2); 

        /** Output: Gagal (Error)
         * Penjelasan: Gagal mrngkonversi double ke integer, menghilangkan
         * nlai dibelakang koma. Harus menggunakan casting
         */

       // Program nomer 3
       int y = 25;
       double output3 = y;
       System.out.println(output3); 

        /** Output: 25.0 (Berhasil)
         * Penjelasan: Coercion, dikonversi oleh kompiler ke tipe data double
         */

        // Program nomer 4
        int z = 78;
        char output4 = (char) z;
        System.out.println(output4);
        
        /** Output: N (Berhasil)
         * Penjelasan: Casting, mengubah 78 ke character code ASCII 'N'
         */

         // Program nomer 5
         char a = 'a';
        double output5 = a;
        System.out.println(output5);
        
        /** Output: 97.0 (Berhasil)
         * Penjelasan: Coercion, a dikonversi oleh kompiler ke kode ASCII
         * dan menjadi double 97.0
         */
    }
}
