package Com.ComCast.CRM.genericbasetest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DatabaseUtility {

    Connection con;
    Statement stat;

    // ---------- Get Connection ----------
    public void getConnection(String url, String username, String password) throws Throwable {
        Driver driver = new Driver();
        DriverManager.registerDriver(driver);

        con = DriverManager.getConnection(url, username, password);
        stat = con.createStatement();

        System.out.println("Database connected successfully");
    }

    // ---------- Execute SELECT Query ----------
    public ResultSet executeSelectQuery(String query) throws Throwable {
        ResultSet result = stat.executeQuery(query);
        return result;
    }

    // ---------- Execute INSERT/UPDATE/DELETE ----------
    public int executeUpdateQuery(String query) throws Throwable {
        int result = stat.executeUpdate(query);
        return result;
    }

    // ---------- Close Connection ----------
    public void closeDBConnection() throws Throwable {
        if (con != null) {
            con.close();
            System.out.println("Database connection closed");
        }
    }
}