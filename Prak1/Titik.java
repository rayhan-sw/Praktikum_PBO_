/*
Nama File       : Titik.java
Deskripsi       : berisi atribut dan method dalam class titik
Pembuat         : Rayhan Septian Wijaya - 24060123140123
Tanggal         : 20-2-2025
*/

public class Titik {
    /**********Atribut************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;


    /*******Method********/
    //konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //konstruktor untuk membuat titik (0,0)
    public Titik(){
        this(0,0);
    }

    //mengembalikan nilai counterTitik
    public static int getcounterTitik(){
        return counterTitik;
    }

    //mengembalikan absis
    public double getAbsis(){
        return absis;
    }

    //mengembalikan ordinat
    public double getordinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    public void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mengembalikan nilai kuadran titik
    public int getKuadran(){
        if (absis > 0 && ordinat > 0){
            return 1;
        }else if (absis < 0 && ordinat > 0){
            return 2;
        }else if (absis > 0 && ordinat < 0){
            return 3;
        }else if ( absis < 0 && ordinat < 0){
            return 4;
        }else{
            return 0;
        }
    }

    //mengembalikan nilai jarak titik ke jarak pusat
    public double getJarakPusat(){
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    //mengembalikan nilai jarak antar titik
    public double getJarak(Titik T){
        double deltaX = this.absis - T.absis;
        double deltaY = this.ordinat - T.ordinat;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    //refleksi titik X
    public void refleksiX(){
        this.ordinat = -this.ordinat;
    }

    //refleksi titik Y
    public void refleksiY(){
        this.absis = -this.absis;
    }

    //mengembalikan nilai refleksi sumbu X
    public Titik getrefleksiX(){
        return new Titik(this.absis, -this.ordinat);
    }

    //mengembalikan nilai refleksi sumbu Y
    public Titik getrefleksiY(){
        return new Titik(-this.absis, this.ordinat);
    }

    //mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat +")");
    }

    public void printcounterTitik(){
        System.out.println(this.counterTitik);

    }
    
}//end class Titik
