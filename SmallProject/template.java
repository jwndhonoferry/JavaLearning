import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class template {
    String sql;
    private static final tesConnection conn = new tesConnection();
    protected List<Map<String, String>> extract(String query) {
        sql = query;
        List<Map<String, String>> data = null;
        try {
            Statement stmt = conn.connect().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            List<String> columns = new ArrayList<String>(rsmd.getColumnCount());
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                columns.add(rsmd.getColumnName(i));
            }
            data = new ArrayList<Map<String, String>>();
            while (rs.next()) {
                Map<String, String> row = new HashMap<String, String>(columns.size());
                for (String col : columns) {
                    row.put(col, rs.getString(col));
                }
                data.add(row);
            }
//           System.out.println(data);
            rs.close();
            stmt.close();
            conn.closed();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            Logger lgr = Logger.getLogger(s_project.class.getName());
            lgr.log(Level.SEVERE, sqlException.getMessage(), sqlException);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return data;
    }

    protected int excec(String query) {
        try
        {
            Statement stmt = conn.connect().createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            conn.closed();
        }
        catch (Exception e)
        {
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }
        System.out.println("Table Created successfully");
        return 0;
    }
}
