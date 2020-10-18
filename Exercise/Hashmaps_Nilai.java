package TugasMasSaipul;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Hashmaps_Nilai {
    public static void main(String[] args) {
        Map<String, Double> nilai_hm = new HashMap<String, Double>();
        TreeMap<String, Double> nilai_tm = new TreeMap<String, Double>();
        LinkedHashMap<String, Double> nilai_lhm = new LinkedHashMap<String, Double>();
        String[][] isi_nilai = {
                {"Ferdi", "3.6"}, {"Febi", "3.1"}, {"Didi", "2.7"},
                {"Andi", "3.3"}, {"Dino", "3"}, {"Dimas", "2.7"}, {"Bima", "2.9"},
                {"Bibi", "2.5"}, {"Lalu", "3.4"}, {"Sakti", "4.0"}
        };
        for (int i = 0; i < isi_nilai.length; i++) {
            for (int j = 0; j < isi_nilai[i].length; j++) {
//                Put data
                nilai_hm.put(isi_nilai[i][0], Double.parseDouble(isi_nilai[i][1]));
                nilai_tm.put(isi_nilai[i][0], Double.parseDouble(isi_nilai[i][1]));
                nilai_lhm.put(isi_nilai[i][0], Double.parseDouble(isi_nilai[i][1]));

            }
        }

//        System.out.println("== HASHMAP ==");
//        soal object_hm = new soal(nilai_hm);
//        object_hm.soal1(nilai_hm);
//        object_hm.soal2(nilai_hm);
//        object_hm.soal3(nilai_hm);
//        object_hm.soal4(nilai_hm);
//        object_hm.soal5(nilai_hm);
//
//        System.out.println("\n");
//        System.out.println("== TreeMap ==");
//        soal object_tm = new soal(nilai_tm);
//        object_tm.soal1(nilai_tm);
//        object_tm.soal2(nilai_tm);
//        object_tm.soal3(nilai_tm);
//        object_tm.soal4(nilai_tm);
//        object_tm.soal5(nilai_tm);
//
//        System.out.println("\n");
//        System.out.println("== LinkedHashmap ==");
//        soal object_lhm = new soal(nilai_lhm);
//        object_lhm.soal1(nilai_lhm);
//        object_lhm.soal2(nilai_lhm);
//        object_lhm.soal3(nilai_lhm);
//        object_lhm.soal4(nilai_lhm);
//        object_lhm.soal5(nilai_lhm);
//        for(int i = 0; i < 5; i++) {
//            try {
//                object_soal.getClass().getMethod("soal" + i , Map.class).invoke(object_soal);
//            } catch (Exception e) {
//                System.out.println("==========Gagal===========");
//                break;
//            }
//        }
        GsonBuilder gsonmap = new GsonBuilder();
        Gson gsobj = gsonmap.create();
        String Sj = gsobj.toJson(nilai_hm);
        System.out.println(Sj);
        System.out.println("JSON Object");
    }
}
class soal{
    Map<String, Double> x1;

    protected soal(Map<String, Double> mapp){
        x1 = mapp;
    }
    protected Map soal1(Map<String, Double> mapp){
        System.out.println("== No. 1 ==");
        System.out.println(mapp);
        System.out.println(" Replace " + mapp.replace("Ferdi", 3.7) + " ?");
        System.out.println(mapp);
        return mapp;
    }
    protected Map soal2(Map<String, Double> mapp2){
        System.out.println("== No. 2 ==");
        System.out.println("Tambahkan data ");
        mapp2.put("Fendy",2.0);
        System.out.println(mapp2);
        return mapp2;
    }
    protected Map soal3(Map<String, Double> mapp3){
        System.out.println("== No. 3 ==");
        System.out.println("Remove Dimas ? " + mapp3.remove("Dimas"));
        System.out.println(mapp3);
        return mapp3;
    }
    protected Map soal4(Map<String, Double> mapp4){
        System.out.println("== No. 4 ==");
        System.out.println("Adakah nilai 3.6 dalam map ? "+ "\n" + mapp4.containsValue("3.6"));
        return mapp4;
    }
    protected Map soal5(Map<String, Double> mapp5){
        System.out.println("== No. 5 ==");
        System.out.println("Jumlah data dalam map = " + mapp5.size());
        System.out.println("Hasil akhir MAP : "  +"\n"+ mapp5);
        return mapp5;
    }
}