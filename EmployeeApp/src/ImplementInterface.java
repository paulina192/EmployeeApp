import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ImplementInterface implements UserInterface {

    @Override
    public void createEmployee(Employee emp) {
       
    }

    @Override
    public void showEmployees() {
        
         Connection con = DBConnection.createDBConnection();
      String query = "select * from employeedb.employee";
      System.out.println("Employee Details: ");
      System.out.println("----------------------------------------------------------------------------------------------------");
      System.out.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n", "ID","First Name", "Last Name", "Hourly Pay", "Salary","Age", "Department", "Role");
      System.out.println("----------------------------------------------------------------------------------------------------");


    try {

        Statement stmt = con.createStatement();
        ResultSet result = stmt.executeQuery(query);
        while (result.next()){
          System.out.format("%d\t%s\t%s\t%f\t%f\t%d\t%s\t%s\n",  //will print in this format
          result.getInt(1), 
          result.getString(2), 
          result.getString(3),
          result.getDouble(4), 
          result.getDouble(5),
          result.getInt(6),
          result.getString(7),
          result.getString(8));
         

          System.out.println("----------------------------------------------------------------------------------------------------");
        }

        
      } catch (Exception ex) {
        ex.printStackTrace();
        
      }

     
        
    }

    

    @Override
    public void showEmployeeId(int id) {
       
    }

    @Override
    public void updateEmployee(int id, String name) {
       
    }

    @Override
    public void deleteEmployee(int id) {
       
    }
    
}
