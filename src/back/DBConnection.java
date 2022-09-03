package back;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    Connection con;

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        if (con == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "Naser1987");
        }
        return con;
    }
}
