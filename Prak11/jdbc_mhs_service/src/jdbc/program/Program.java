/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc.program;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

/**
 *
 * @author rayha
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        List<Mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");
        
        //Insert 
        System.out.println("===insert");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Rayhan");
        service.add (mhsAdd);
        System.out.println("Berhasil insert : " + mhsAdd);
        displayAll();
        
        //update
        System.out.println("===update");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama : " + mhsUpdate);
       mhsUpdate.setNama("Tony");
        System.out.println("dengan data baru : " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();
        
        //delete
         System.out.println("===delete");
         System.out.println("akan didelete : " + service.getById(5));
         service.delete(5);
         displayAll();
    } 
    
    public static void displayAll() throws SQLException{
         System.out.println("===displayAll");
         List<Mahasiswa> list = service.getAll();
         if (list.isEmpty()){
              System.out.println("Tabel Kosong");
         }else {
             for (Mahasiswa m : list){
                  System.out.println(m.toString());
             }
         }
    }
}
