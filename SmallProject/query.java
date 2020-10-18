import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class query {
    private static template temp = new template();
    private String query;
    private List<Map<String,String>> li;

    protected void query_bebas(){
        System.out.println("Masukkan query : ");
        Scanner inp = new Scanner(System.in);
        String input = inp.nextLine();
        System.out.println((temp.extract(input)));
    }
    protected void create_tab_sudah_bayar(){
        String ct = "create table if not exists sudah_bayar as\n" +
                "select \"invoiceID\", \"userID\", \"paymentStatus\", \"date\" \n" +
                "from invoice\n" +
                "where \"paymentStatus\" ILIKE '%successfully%'\n" +
                "group by \"invoiceID\", \"userID\", \"paymentStatus\", \"date\" order by \"userID\";";
        String.valueOf(temp.excec(ct));
    }
    protected void create_tab_awal(String tn){
        String ct = " CREATE TABLE IF NOT EXISTS " + tn + " AS\n" +
                " select \"userID\",\"invoiceID\", \"date\", \"paymentStatus\" \n" +
                " from sudah_bayar where EXTRACT(MONTH FROM \"date\") < 4 order by \"date\" desc;";
        String.valueOf(temp.excec(ct));
    }
    protected void create_tab_akhir(String tn){
        String ct = "CREATE TABLE IF NOT EXISTS " + tn + " AS\n" +
                " select \"userID\", \"invoiceID\", \"date\", \"paymentStatus\" \n" +
                " from sudah_bayar where EXTRACT(MONTH FROM \"date\") > 9 " +
                "and EXTRACT(MONTH FROM \"date\") < 13 order by \"date\" desc";
        String.valueOf(temp.excec(ct));
    }
    protected void create_tab_belum_bayar(String tn){
        String ct = "CREATE TABLE IF NOT EXISTS " + tn + " AS \n" +
                "select \"invoiceID\", \"userID\", \"date\", \"paymentStatus\"\n" +
                "from invoice  where \"paymentStatus\" ILIKE '%expired%' or \"paymentStatus\" ILIKE '%waiting%'\n" +
                "order by \"userID\";";
        String.valueOf(temp.excec(ct));
    }
    protected List<Map<String, String>> getDataQuery(String tabel) {
        System.out.println("Data User Awal Tahun");
        return temp.extract(tabel);
    }

    protected List<Map<String, String>> getDataAkhirTahun(String tabel) {
        String sql_get = "select \"userID\", \"invoiceID\", \"date\"\n" +
                " from " + tabel + " where EXTRACT(MONTH FROM \"date\") < 13 " +
                "and EXTRACT(MONTH FROM \"date\") > 9 order by \"date\" desc;";
        System.out.println("Data User Akhir Tahun");
        return temp.extract(sql_get);
    }
    protected List<Map<String, String>> getDataBelumBayar(String tabel) {
        String sql_get = "select \"invoiceID\", \"userID\", \"date\", \"paymentStatus\"\n" +
                "from " +tabel+ " where \"paymentStatus\" ILIKE '%expired%'";
        System.out.println("Data User Belum Bayar (Expired)");
        return temp.extract(sql_get);
    }
    protected List<Map<String, String>> getData(String tabel){
        return null;
    }
}
