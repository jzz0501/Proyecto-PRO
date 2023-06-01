package Database;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ProyectoConnection {
    public static final String URL = "jdbc:mysql://192.168.1.206:3306/Proyecto";
    public static final String USERNAME = "administrador";
    public static final String PASSWORD = "19871124";
    public static java.sql.Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
