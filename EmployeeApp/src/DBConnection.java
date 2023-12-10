import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static Connection con;

    public static Connection createDBConnection() {
        //load driver 
       try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //get connection
        String url = "jdbc:mysql://localhost:3306/employeedb";
        String username = "sqluser";
        String password ="password";
        con = DriverManager.getConnection(url, username, password);

        }catch(Exception ex){

            ex.printStackTrace();
             
        
        } 

        return con; 
    
    }
}

    

