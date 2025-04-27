/*  Nama File   : MAnabul.java
 *  Deskripsi   : Kelas Main demo untuk Anabul, Anjing, Kucing, dan Burung
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 27 April 2025
 */

import java.util.ArrayList;

public class MAnabul {
  public static void main(String[] args) {

    Anabul anabul1 = new Kucing("Haerin");
    Anabul anabul2 = new Anjing("Jokowie");
    Anabul anabul3 = new Burung("Prabowow");

    ArrayList<Anabul> Peliharaanku = new ArrayList<>();
    Peliharaanku.add(anabul1);
    Peliharaanku.add(anabul2);
    Peliharaanku.add(anabul3);

    for (Anabul a : Peliharaanku) {
      a.gerak();
      a.bersuara();
      System.out.println();
    }
  }
}