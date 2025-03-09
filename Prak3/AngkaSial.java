/* Nama file: AngkaSial.java
 * Deskripsi:
 * Nama/Nim: Rayhan Septian Wijaya - 24060123140188
 * Tanggal: 8 Maret 2025 */

 public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch (AngkaSialException ase){
            //methid getMessage() telah ada pada class "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati hati memasukkan angka!!!");
        }
    }
}
/* 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
 * jawaban: Baris 12 tidak akan dieksekusi karena saat cobaAngka(13) dipanggil, eksepsi langsung dilempar dengan throw new AngkaSialException();.
 * sehingga eksekusi metode terhenti sebelum mencapai baris tersebut. Program langsung melompat ke blok catch di main().
 * 
 * 
 * 2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
 * jawaban: Ya. aris 21 akan dieksekusi karena berada dalam blok catch yang menangani eksepsi. 
 * Setelah eksepsi ditangkap, program menjalankan ase.getMessage() di baris 20, lalu melanjutkan ke baris 21 untuk mencetak peringatan..*/