package JSON_CILSY;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import org.json.simple.JSONArray;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class tugas_json<cj> {
    public static String[] ArrPenulis = {"Ferry J", "Andrea Hirata", "TEre Liye", "Dewi Lestari", "Eka Kurniawan"
            , "Ahmad Fuadi", "Ayu Utami", "Ika Natassa", "Pidi Baiq", "Chairul Tanjung"};
    public static String[] ArrJudul = {"Tutorial Java", "Tutorial Kotlin", "Tutorial Android", "Tutorial Flutter"
            ,"Tutorial PHP", "Dilan", "Marmut Merah Jambu", "Manusia salmon", "The Walking Dead", "Alive"};
    public static String[] ArrTahun = {"2015","2016","2018","2019","2020", "2011", "2012", "2013", "2014","2017"};
    public static String[] bookKey = {"Judul Buku", "Nama Penulis","Tahun Terbit"};
    JSONArray judul = new JSONArray();
    JSONArray penulis = new JSONArray();
    JSONArray tahunterbit = new JSONArray();

    public Map InitiateHashmap(){
        Map<String, JSONArray> HBuku = new HashMap<>();
        Map<String, Object> HRootBuku = new HashMap<>();
        //create class obj
        createJSON cj = new createJSON();
//        Create JSONArray
        JSONArray a = cj.add_Array(judul, ArrJudul);
        JSONArray b = cj.add_Array(penulis, ArrPenulis);
        JSONArray c = cj.add_Array(tahunterbit, ArrTahun);
        cj.Put_map(HBuku, new String[]{bookKey[0]}, a);
        cj.Put_map(HBuku, new String[]{bookKey[1]}, b);
        cj.Put_map(HBuku, new String[]{bookKey[2]}, c);
        HRootBuku.put("HBuku", HBuku);
        return HRootBuku;
    }

    public Map InitiateTreemap(){
        Map<String, JSONArray> TBuku = new TreeMap<>();
        Map<String, Object> TRootBuku = new TreeMap<>();
        //create class obj
        createJSON cj = new createJSON();
//        Create JSONArray
        JSONArray a = cj.add_Array(judul, ArrJudul);
        JSONArray b = cj.add_Array(penulis, ArrPenulis);
        JSONArray c = cj.add_Array(tahunterbit, ArrTahun);
        cj.Put_map(TBuku, new String[]{bookKey[0]}, a);
        cj.Put_map(TBuku, new String[]{bookKey[1]}, b);
        cj.Put_map(TBuku, new String[]{bookKey[2]}, c);
        TRootBuku.put("TBuku", TBuku);
        return TRootBuku;
    }
    private Map InitiateLHMAP() {
        Map<String, JSONArray> LHBuku = new LinkedHashMap<>();
        Map<String, Object> LHRootBuku = new LinkedHashMap<>();
        //create class obj
        createJSON cj = new createJSON();
//        Create JSONArray
        JSONArray a = cj.add_Array(judul, ArrJudul);
        JSONArray b = cj.add_Array(penulis, ArrPenulis);
        JSONArray c = cj.add_Array(tahunterbit, ArrTahun);
        cj.Put_map(LHBuku, new String[]{bookKey[0]}, a);
        cj.Put_map(LHBuku, new String[]{bookKey[1]}, b);
        cj.Put_map(LHBuku, new String[]{bookKey[2]}, c);
        LHRootBuku.put("LHBuku", LHBuku);
        return LHRootBuku;
    }

    public static void main(String[] args) {
        // create Hashmap
        createJSON cj = new createJSON();
        tugas_json obj = new tugas_json();

        Map HM = obj.InitiateHashmap();
        Map TM = obj.InitiateTreemap();
        Map LM = obj.InitiateLHMAP();

        System.out.println("JSON Hashmap");
        cj.build_json(HM);
        System.out.println("JSON Treemap");
        cj.build_json(TM);
        System.out.println("JSON LinkedHashmap");
        cj.build_json(LM);

//        cj.write_json(HM);
    }
}

class createJSON{
    protected JSONArray add_Array(JSONArray j, String[] s){
        for(int i = 0; i < s.length; i++){
            j.add(s[i]);
        }
        return j;
    }
    protected Map Put_map(Map<String, JSONArray> m, String[] a, JSONArray ja){
        for(int i = 0; i < a.length; i++){
            m.put(a[i], ja);
        }
        return m;
    }
    protected void write_json(Map Sj){
        try (FileWriter file = new FileWriter("Hasil JSON.json")) {
            file.write(Sj.toString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    protected String build_json(Map<String, Object> JO){
        GsonBuilder gsonmap = new GsonBuilder();
        Gson gsobj = gsonmap.create();
        String Sj = gsobj.toJson(JO);
        System.out.println(Sj);
        return Sj;
    }
}