public class MBangunDatar {
    public static void main(String[] args) {
        System.out.println("/~~~~~~~~~~~~~~~~~~~ PERSEGI ~~~~~~~~~~~~~~~~~~~~~~~~/");
        Persegi persegi = new Persegi(5, "Merah", "Putih");
        System.out.println("Luas PSG1: " + persegi.getLuas());
        System.out.println("Keliling PSG1: " + persegi.getKeliling());
        System.out.println("Diagonal PSG1: " + persegi.getDiagonal());
        persegi.printInfo();

        System.out.println("\n/~~~~~~~~~~~~~~~~~~~ LINGKARAN ~~~~~~~~~~~~~~~~~~~~~~~~/");
        Lingkaran lingkaran = new Lingkaran(0, "Biru", "Hitam");
        lingkaran.setJariJari(7);
        System.out.println("Luas LGKR1: " + lingkaran.getLuas());
        System.out.println("Keliling LGKR1: " + lingkaran.getKeliling());
        System.out.println("Jari-jari LGKR1: " + lingkaran.getJariJari());
        lingkaran.printInfo();

        System.out.println("\n/~~~~~~~~~~~~~~~~~~~ PERBANDINGAN LUAS DAN KELILING ~~~~~~~~~~~~~~~~~~~~~~~~/");
        double sisiPSG2 = Math.sqrt(Math.PI * 7 * 7 );
        Persegi PSG2 = new Persegi(sisiPSG2, "Biru", "Hitam");

        double diameterLGKR1 = 2 * Math.sqrt(100 / Math.PI);
        Lingkaran LGKR1 = new Lingkaran(diameterLGKR1, "Merah", "Putih");

        double sisiPSG3 = (Math.PI * 14) / 4;
        Persegi PSG3 = new Persegi(sisiPSG3, "Biru", "Hitam");

        double diameterLGKR2 = 20 / Math.PI;
        Lingkaran LGKR2 = new Lingkaran(diameterLGKR2, "Merah", "Putih");

        System.out.println("Perbandingan Luas:");
        System.out.println("PSG2 = PSG3 : " + PSG2.isEqualLuas(PSG3));
        System.out.println("PSG2 = LGKR1 : " + PSG2.isEqualLuas(LGKR1));
        System.out.println("PSG3 = LGKR2 : " + PSG3.isEqualLuas(LGKR2));

        System.out.println("\nPerbandingan Keliling:");
        System.out.println("PSG2 = PSG3 : " + PSG2.isEqualKeliling(PSG3));
        System.out.println("PSG2 = LGKR1 : " + PSG2.isEqualKeliling(LGKR1));
        System.out.println("PSG3 = LGKR2 : " + PSG3.isEqualKeliling(LGKR2));

        System.out.println("\nNilai Luas dan Keliling:");
        System.out.println("Luas PSG2: " + PSG2.getLuas());
        System.out.println("Luas PSG3: " + PSG3.getLuas());
        System.out.println("Luas LGKR1: " + LGKR1.getLuas());
        System.out.println("Luas LGKR2: " + LGKR2.getLuas());

        System.out.println("\nKeliling PSG2: " + PSG2.getKeliling());
        System.out.println("Keliling PSG3: " + PSG3.getKeliling());
        System.out.println("Keliling LGKR1: " + LGKR1.getKeliling());
        System.out.println("Keliling LGKR2: " + LGKR2.getKeliling());

        System.out.println("\n/~~~~~~~~~~~~~~~~~~~ INTERFACE IRESIZE ~~~~~~~~~~~~~~~~~~~~~~~~/");
        System.out.println("IResize Persegi PSG2");
        System.out.println("Sisi awal: " + PSG2.getSisi());
        System.out.println("Luas awal: " + PSG2.getLuas());

        PSG2.zoomIn();
        System.out.println("\nSetelah zoomIn:");
        System.out.println("Sisi: " + PSG2.getSisi());
        System.out.println("Luas: " + PSG2.getLuas());

        PSG2.zoomOut();
        System.out.println("\nSetelah zoomOut:");
        System.out.println("Sisi: " + PSG2.getSisi());
        System.out.println("Luas: " + PSG2.getLuas());

        System.out.println("\nIResize Lingkaran LGKR1");
        System.out.println("Jari-jari awal: " + LGKR1.getJariJari());
        System.out.println("Luas awal: " + LGKR1.getLuas());

        LGKR1.zoomIn();
        System.out.println("\nSetelah zoomIn:");
        System.out.println("Jari-jari: " + LGKR1.getJariJari());
        System.out.println("Luas: " + LGKR1.getLuas());

        LGKR1.zoomOut();
        System.out.println("\nSetelah zoomOut:");
        System.out.println("Jari-jari: " + LGKR1.getJariJari());
        System.out.println("Luas: " + LGKR1.getLuas());

        System.out.println("\nRefrence IResize");
        IResize resizebleP = PSG2;
        IResize resizebleL = LGKR1;

        resizebleP.zoom(50);
        System.out.println("Setelah zoom 50%:");
        System.out.println("Sisi: " + PSG2.getSisi());

        resizebleL.zoom(50);
        System.out.println("Setelah zoom 50%:");
        System.out.println("Jari-jari: " + LGKR1.getJariJari());

        System.out.println("\n/~~~~~~~~~~~~~~~~~~~ JUMLAH BANGUN DATAR ~~~~~~~~~~~~~~~~~~~~~~~~/");
        BangunDatar.printCounterBangunDatar();

    }
}