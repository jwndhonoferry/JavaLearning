package JSON_CILSY;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class jsonjson {
    public static void main(String[] args) throws JSONException {
        String file = "resources/json_simple.json";
        JSONParser jsonParser = new JSONParser();
        ClassLoader classLoader = jsonjson.class.getClassLoader();
        try {
            FileReader reader = new FileReader(new File(classLoader.getResource(file).getFile()));
//            Object object = jsonParser.parse(new FileReader(new File(classLoader.getResource(file).getFile())));
            Object object = jsonParser.parse(reader);
            JSONObject jsonObjectRoot = (JSONObject) object;

            // ambil nilai nama
            String nama = (String) jsonObjectRoot.get("nama");

            // ambil nilai hobi
            JSONArray jsonArrayHobi = (JSONArray)
                    jsonObjectRoot.get("hobi");

            // ambil nilai usia
            long usia = (Long) jsonObjectRoot.get("usia");

            // ambil nilai orang tua
            JSONObject jsonObjectOrangTua = (JSONObject) jsonObjectRoot.get("orang_tua");

            // ambil nilai nama ibu
            JSONObject jsonObjectIbu = (JSONObject) jsonObjectOrangTua.get("ibu");
            String namaIbu = (String) jsonObjectIbu.get("nama");

            // ambil nilai nama ayah
            JSONObject jsonObjectAyah = (JSONObject) jsonObjectOrangTua.get("ayah");
            String namaAyah = (String) jsonObjectAyah.get("nama");

            // tampilkan nilai hasil baca json
            System.out.println("nama: \n" + nama + "\n");
            System.out.println("hobi:");
//            for (Object objHobi : jsonArrayHobi) {
//                String hobi = (String) objHobi;
//                System.out.println(hobi);
//            }
            for (int i=0; i<jsonArrayHobi.length(); i++) {
                JSONObject item = jsonArrayHobi.getJSONObject(i);
                String hobi = item.getString("hobi");
                System.out.println(hobi);
            }
            System.out.println("\nusia: \n" + usia + "\n");
            System.out.println("nama ibu: \n" + namaIbu + "\n");
            System.out.println("nama ayah: \n" + namaAyah);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
