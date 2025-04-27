/*  Nama File   : TestPolimorfisme.java
 *  Deskripsi   : Kelas Main demo untuk Peggawai, Programmer, dan Manajer
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 24 April 2025
 */

 import java.util.ArrayList;

 public class TestPolimorfisme {
     public static void main(String[] args) {
         Pegawai pegawai1 = new Manajer("Asep");
         Pegawai pegawai2 = new Programmer("Ape");
         Manajer pegawai3 = new Manajer("Anin");
         Manajer pegawai4 = new Manajer("Syala");
         Programmer pegawai5 = new Programmer("Enji");
         Programmer pegawai6 = new Programmer("Ncus");
 
         ArrayList<Pegawai> emps = new ArrayList<>();
         emps.add(pegawai1);
         emps.add(pegawai2);
         emps.add(pegawai3);
         emps.add(pegawai4);
         emps.add(pegawai5);
         emps.add(pegawai6);
 
         for (Pegawai emp : emps) {
             emp.tampilData();
         }
     }
 }

/*  2. Jelaskan manfaat polimorfisme pada kasus ini.
    Jawab : Manfaat polimorfisme pada kasus ini adalah program menjadi lebih fleksibel dan sederhana 
    dalam mengelola berbagai tipe objek yang berasal dari satu induk kelas, yaitu Pegawai. Dengan adanya polimorfisme, 
    objek Manager dan Programmer dapat diperlakukan sebagai objek bertipe Pegawai, sehingga saat memanggil metode tampilData(),
    program secara otomatis menjalankan metode yang sesuai dengan tipe objek aslinya. Hal ini membuat kode lebih rapi, mudah diperluas, 
    dan mengurangi kebutuhan untuk melakukan pengecekan tipe secara manual, sehingga pemrograman menjadi lebih efisien dan minim risiko kesalahan.

    3.Apabila pada main program perlu menambahkan pegawai4 dan pegawai5! Apa permasalahan yang muncul jika diterapkan tanpa polimorfisme (inclusion)?
    Jawab : Jika program tidak menggunakan polimorfisme, maka setiap kali ingin memanggil metode tampilData(), kita harus mengecek tipe objek secara manual 
    menggunakan percabangan seperti if-else atau instanceof. Hal ini akan membuat kode menjadi lebih panjang, rumit, dan sulit untuk dipelihara, apalagi jika 
    jumlah jenis pegawai bertambah di masa depan. Selain itu, tanpa polimorfisme, diperlukan casting tipe data yang meningkatkan kemungkinan terjadinya kesalahan runtime, 
    sehingga membuat program lebih rentan terhadap bug dan mengurangi keandalan sistem secara keseluruhan.
 */ 