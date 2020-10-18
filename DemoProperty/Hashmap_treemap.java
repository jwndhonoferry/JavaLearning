package DemoPropertyCilsy;

import java.util.HashMap;

public class Hashmap_treemap {
    public static void main(String[] args) {
        HashMap<Integer, String> hari = new HashMap<Integer, String>();
        String[] hari_h = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        for(int i = 0; i < 7; i++){
            for(int j = 0; j < hari_h.length; j++){
                hari.put(i, hari_h[i]);
            }
        }

        hari.put(5, "Libur");
        hari.replace(8, "Libur 2");
        System.out.println(hari.isEmpty());
        System.out.println(hari.size());
        System.out.println(hari.values());
        System.out.println(hari.keySet());
        System.out.println(hari.containsValue("Senin"));
        System.out.println(hari);
    }
}
//        hari.put(1, "Senin");
//        hari.put(2, "Selasa");
//        hari.put(3, "Rabu");
//        hari.put(4, "Kamis");
//        hari.put(5, "Jumat");
//        hari.put(6, "Sabtu");
//        hari.put(7, "Minggu");
//
//
//        System.out.println("remove");
//        hari.remove(2);
//
//        hari.put(7, "Ahad");
//        hari.replace(3, "Raboooo");
//        System.out.println("clear");
////        hari.clear();
//        System.out.println("Kumpulan hari " + hari);