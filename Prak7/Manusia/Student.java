/*  Nama File   : Student.java
 *  Deskripsi   : Kelas Representasi Student
 *  Pembuat     : Rayhan Septian Wijaya
 *  NIM         : 24060123140123
 *  Tanggal     : 24 April 2025
 */

 public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    @Override
    public boolean isAsleep(int hr) { 
        return hr > 2 && hr < 8;
    }
}