import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
      String firstName; //when duplicates appeared on switch cases
        String lastName;
        int id;      // -||-

        UserInterface user = new ImplementInterface();
            
       

        System.out.println("Welcome to Employee Management Application!");

        Scanner scan = new Scanner(System.in);

        do{

            System.out.println("1. Add Employee\n" +
                               "2. Show All Employees\n" +
                               "3. Show Employees based on ID\n" +
                               "4. Update the employee\n" +
                               "5. Delete the employee\n");

        System.out.println("Enter Choice: ");    
        int ch = scan.nextInt();

        switch (ch) {
            case 1:
                Employee emp = new Employee();
                
                System.out.println("Enter first name: ");
                firstName = scan.next();
                System.out.println("Enter last name: ");
                lastName = scan.next();
                System.out.println("Enter hourly pay: ");
                double hourlyPay = scan.nextDouble();
                System.out.println("Enter age ");
                int age = scan.nextInt();
                System.out.println("Enter department: ");
                String dept = scan.next();
                System.out.println("Enter employee's role: ");
                String role = scan.next();
               
                emp.setFirstName(firstName);
                emp.setLastName(lastName);
                emp.setHourlyPay(hourlyPay);
                emp.setAge(age);
                emp.setDepartment(dept);
                emp.setRole(role);
                user.createEmployee(emp);
                break;

            case 2:
                user.showEmployees(); 
                break;  
                
            case 3:
            System.out.println("Enter ID to show the details ");
            int empID = scan.nextInt();
            user.showEmployeeId(empID);
            break;

           
        case 5:
            System.out.println("Enter the ID to delete");
            id = scan.nextInt();
            user.deleteEmployee(id);
            

            case 6:
                System.out.println("Thank you for using our Application!");
                System.exit(0);
                break;



            default:
                 System.out.println("Enter valid choice");
                 break;
        }



        }while(true);
      
    }
}

