public interface IResize {
    void zoomIn();
  
    void zoomOut();
  
    void zoom(double percent);
  }

// 1. Apakah keuntungan saat method zoomIn(), zoomOut(), dan zoom() dikemas dalam  
// interface IResize dibanding dijadikan sebagai abstract method dalam class BangunDatar?

// - Lebih Fleksibel, Interface memungkinkan class lain di luar BangunDatar, seperti Garis atau Bangun3D, 
// untuk mengimplementasikan fitur resize tanpa harus menjadi subclass BangunDatar.

// - Tidak terikat dari Hierarki – Jika metode resize dimasukkan ke dalam BangunDatar, hanya turunannya yang dapat menggunakannya. 
// Dengan interface, berbagai class dapat memiliki fitur resize tanpa harus terkait dengan BangunDatar.

// - Pemisahan Konsep, Resize adalah perilaku umum yang tidak harus dimiliki semua bangun datar. 
// Dengan interface, fitur ini dapat diterapkan tanpa mengganggu struktur BangunDatar, yang lebih fokus pada luas dan keliling.