public class MBangunDatar{
    public static void main(String[] args){
        //Membuat Objek Bangundatar
        BangunDatar bd = new BangunDatar();
        bd.setJmlSisi(3);
        bd.setWarna("Biru");
        bd.setBorder("Hitam");
    
        //Membuat Objek Persegi
        Persegi p = new Persegi(5, "Hijau", "KUning");

        System.out.println("Info BangunDatar");
        bd.printInfo();

        System.out.println("");

        System.out.println("Info Persegi");
        p.printInfo();
        System.out.println("");
        p.setSisi(6);
        p.printInfo();
    }

}