/*  Nama File   : MainDAO.java
 *  Deskripsi   : main program untuk menguji DAO
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 15 Mei 2025
 */

 public class MainDAO{
    public static void main(String[] args) {
        Person person = new Person("Rafi");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 }