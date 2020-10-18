import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import java.util.Scanner;

public class s_project {
    private static final query q_sin = new query();
    private static final String tahun1 = "awal_tahun";
    private static final String tahun2 = "akhir_tahun";
    private static final String tahun3 = "belum_bayar";
    private static Properties prop = new Properties();
    private static FileInputStream ip = null;
    private static Connection conn = null;
    static{
        try {
            ip = new FileInputStream("/home/jwndhono/Belajar Java/SmallProject1/src/main/java/query.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    private static String getQueryProperties(String s) throws IOException{
        prop.load(ip);
        String a = prop.getProperty(s);
        return a;
    }
    //    Buat mengambil invoice pada Hashmap
    private static void getInvoiceData(List<Map<String, String>> list_inp, String tahun , int dis){
        for (Map<String, String> a: list_inp ) {
            if(tahun.equals(tahun1) || tahun.equals(tahun2)){
                System.out.println("Terima kasih karena anda telah melakukan pembayaran pada " +
                        "invoice " + a.get("invoiceID") + " Anda berhak mendapatkan Diskon " + tahun +" sebesar "
                        + dis + "%!");
            }
            else {
                System.out.println("Yuk segera bayar tagihan invoice " +
                         a.get("invoiceID") + ", dan dapatkan Diskon sebesar " + dis + "%!");
            }
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);
        System.out.println("Masukkan query 'Ya' atau 'tidak' ");
        String scan = inp.nextLine();
        if(scan.equals("Ya")){
            q_sin.query_bebas();
        } else {
//            q_sin.create_tab_sudah_bayar();
//            q_sin.create_tab_awal(tahun1);
//            q_sin.create_tab_akhir(tahun2);
//            q_sin.create_tab_belum_bayar(tahun3);
//            System.out.println("\n");
            String query = getQueryProperties("q_awal_tahun");
            System.out.println(query);
            getInvoiceData(q_sin.getDataQuery(query), tahun1, 10);
//            System.out.println("\n");
//            getInvoiceData(q_sin.getDataAkhirTahun(tahun2), tahun2, 20);
//            System.out.println("\n");
//            getInvoiceData(q_sin.getDataBelumBayar(tahun3), tahun3, 15);
        }
    }
}

