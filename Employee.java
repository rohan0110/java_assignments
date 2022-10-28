class EmployeeDetails {
    private int emp_id, salary;
    private String name, department, email, designation;

    public EmployeeDetails()
    {
        // Constructor
    }
    public EmployeeDetails(int emp_id, int salary, String name, String department, String email, String designation) {
        this.emp_id = emp_id;
        this.salary = salary;
        this.name = name;
        this.department = department;
        this.email = email;
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void showEmployeeDetails() {
        System.out.println("emp_id : " + emp_id + ", name : " + name + ", salary : " + salary + ", department : " + department + ", designation : " + designation + ", email : " + email);
    }
}

public class Employee {
    public static void main(String[] args) {
        EmployeeDetails emp = new EmployeeDetails(101, 100000, "Aman Kumar", "IT", "aman321@gmail.com", "Head");
        emp.setSalary(10000000);
        emp.showEmployeeDetails();
    }
}