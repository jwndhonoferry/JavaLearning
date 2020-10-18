import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.sun.xml.internal.bind.v2.runtime.output.C14nXmlOutput;
import org.json.simple.JSONArray;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class tesConnection {
    private static Properties prop = new Properties();
    private static FileInputStream ip;
    private static Connection conn = null;

    static {
        try {
            ip = new FileInputStream("/home/jwndhono/Belajar Java/SmallProject1/src/main/java/conn.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Connection connect() throws IOException {
        prop.load(ip);
        try {
            conn = DriverManager.getConnection(prop.getProperty("db_url"), prop.getProperty("db_user"),
                    prop.getProperty("db_pass"));
//            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public void closed() throws IOException {
//        Connection cl = new tesConnection().connect();
        if (conn != null) {
            try { conn.close();
            } catch (SQLException e) {}
        }
    }
//    public static void main(String[] args) throws IOException {
//        tesConnection con = new tesConnection();
//        con.connect();
//        con.closed((Connection) con);
//    }
}

