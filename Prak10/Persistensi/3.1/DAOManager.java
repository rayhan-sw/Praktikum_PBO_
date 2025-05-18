/*  Nama File   : DAOManager.java
 *  Deskripsi   : pengelola DAO dalam program
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 15 Mei 2025
 */

 public class DAOManager{
    private static PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    public PersonDAO getPersonDAO(){
        return personDAO;
    }
 }