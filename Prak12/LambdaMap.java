/**
 * Nama File: LambdaList.java
 * Deskripsi: Implementasi lambda pada List, digunakan sebagai parameter pada method.
 * Pembuat : Rayhan Septian Wijaya
 * NIM : 24060123140123
 * Tanggal : 6 Juni 2025
 */

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String,String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060123140123", "Adi");
        mahasiswaMap.put("24060123120144", "Bambang");
        mahasiswaMap.put("24060123120102", "Cici");
        mahasiswaMap.put("24060123130134", "Didi");

        // lambda digunakan sebagai parameter
        mahasiswaMap.forEach((key, value) -> System.out.println("NIM : " + key + ", Nama : " +value));
    }
}
