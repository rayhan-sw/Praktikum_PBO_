/*
Nama File       : Mtitik.java
Deskripsi       : berisi atribut dan method dalam class titik
Pembuat         : Rayhan Septian Wijaya - 24060123140123
Tanggal         : 20-2-2025
*/

public class Mtitik {
    public static void main (String[] args) {
    //-------Titik1-----
    Titik T1 = new Titik();
    T1.setAbsis(3);
    T1.setOrdinat(4);
    System.out.println("Koordinat T1 :");
    T1.printTitik();
    //-----Titik2------
    Titik T2 = T1;
    System.out.println("Koordinat T2 :");
    T2.printTitik();
    //------TItik 3-----
    Titik T3 = new Titik();
    T3.setAbsis(7);
    T3.setOrdinat(-6);
    System.out.println("Koordinat T3 :");
    T3.printTitik();

    //GetAbsis
    System.out.println("----------------------");
    double x = T1.getAbsis();
    System.out.println("Nilai absis T1 adalah :" + x);

    //GetOrdinat
    System.out.println("----------------------");
    double y = T1.getordinat();
    System.out.println("Nilai ordinat T1 adalah :" + y);

    //SetAbsis
    System.out.println("----------------------");
    T1.setAbsis(-10);
    System.out.println("Koordinat T1 setelah set absis: " + T1.getAbsis());
    T1.printTitik();

    //SetOrdinat
    System.out.println("----------------------");
    T1.setOrdinat(5);
    System.out.println("Koordinat T1 setelah set ordinat: " + T1.getordinat());
    T1.printTitik();

    //Geser Titik
    System.out.println("----------------------");
    T1.geser(2,2);
    System.out.println("Koordinat T1 setelah digeser: ");
    T1.printTitik();

    //Jumlah Titik
    System.out.println("----------------------");
    int counterTitik = Titik.getcounterTitik();
    System.out.println("Jumlah titik T1 ada " + counterTitik);

    //Kuadran
    System.out.println("----------------------");
    System.out.println("T1 berada di kuadran: " + T1.getKuadran());
    System.out.println("T2 berada di kuadran: " + T2.getKuadran());
    System.out.println("T3 berada di kuadran: " + T3.getKuadran());

    //Jarak Titik ke Pusat
    System.out.println("----------------------");
    System.out.println("Jarak pusat T1: " + T1.getJarakPusat());
    System.out.println("Jarak pusat T2: " + T2.getJarakPusat());
    System.out.println("Jarak pusat T3: " + T3.getJarakPusat());

    //Jarak Titik
    System.out.println("----------------------");
    System.out.println("Jarak T1 dan T3: " + T1.getJarak(T3));

    //Refleksi X
    System.out.println("----------------------");
    System.out.println("Koordinat T3: ");
    T3.printTitik();
    T3.refleksiX();
    System.out.println("T3 setelah refleksi X: ");
    T3.printTitik();

    //Refleksi Y
    System.out.println("----------------------");
    System.out.println("Koordinat T3: ");
    T3.printTitik();
    T3.refleksiY();
    System.out.println("T3 setelah refleksi Y: ");
    T3.printTitik();

    //GetRefleksiX
    System.out.println("----------------------");
    Titik T_refleksi1 = T1.getrefleksiX();
    System.out.println("T1 setelah refleksi terhadap sumbu X:");
    T_refleksi1.printTitik();

    //GetRefleksiY
    System.out.println("----------------------");
    Titik T_refleksi2 = T1.getrefleksiY();
    System.out.println("T1 setelah refleksi terhadap sumbu Y:");
    T_refleksi2.printTitik();













    }
}

