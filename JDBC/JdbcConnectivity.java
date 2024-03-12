import java.sql.*;
public class JdbcConnectivity {
    static String jdbcUrl = "jdbc:postgresql://localhost:5433/student_jdbc";
    static  String jdbcDriver = "org.postgresql.Driver";
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
            Class.forName(jdbcDriver);
            Connection isConnected = DriverManager.getConnection(jdbcUrl, "postgres", "1234");
            return isConnected;
    }

    public  static void closeConnection(Connection connection) throws SQLException {
        if(connection != null){
            connection.close();
        }
    }
}
