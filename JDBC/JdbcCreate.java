import java.sql.*;


public class JdbcCreate {
    static Connection connection;
    public static  void main(String ...args) throws SQLException, ClassNotFoundException {
        if(JdbcConnectivity.getConnection() != null){
            Statement statement= connection.createStatement();
            String query = "INSERT INTO students (firstname, lastname, email, studentId) values ('Verygood', 'Muhirwa','verygoodmuhirwa2@gmail.com',1)";
            ResultSet rs= statement.executeQuery(query);
            while (rs.next()){
                int studentId= rs.getInt("studentId");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String email = rs.getString("email");
                System.out.println("The entered credentials include : "+ studentId + " "+ firstname+" "+lastname+" "+email);
            }
        }
    }
    }
