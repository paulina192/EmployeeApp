public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private double hourlyPay;
    private double salary;
    private int age;
    private String department;
    private String role;

    public Employee() {

    }

    public Employee(int id, String firstName, String lastName, double hourlyPay, double salary, int age, String department, String role ) {
        this.id = id;
        this.firstName = firstName;
        this.hourlyPay = hourlyPay;
        this.age = age;
        this.department = department;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }
    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    
}

