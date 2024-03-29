package Overriding;

//Parent class
class Employee {
 protected String name;
 protected double salary;

 // Default constructor
 public Employee() {
     // Default values
     this.name = "akshata";
     this.salary = 56000;
 }

 // Parameterized constructor
 public Employee(String name, double salary) {
     this.name = name;
     this.salary = salary;
 }

 // Method to increment salary
 public void incrementSalary(double percentage) {
     salary += salary * (percentage / 100);
 }

 // Method to display employee details
 public void displayDetails() {
     System.out.println("Name: " + name);
     System.out.println("Salary: " + salary);
 }


    public static void main(String[] args) {
        Employee employee = new Employee(); // Creating an employee with default constructor
        Developer dev = new Developer("John Doe", 50000); // Creating a developer
        Manager mgr = new Manager("Jane Smith", 70000); // Creating a manager

        // Increment salary for developer and manager
        dev.incrementSalary(10); // 10% increment plus 10% bonus for Developer
        mgr.incrementSalary(15); // 15% increment plus 20% bonus for Manager

        // Display details after increment
        System.out.println("Employee Details:");
        employee.displayDetails();
        System.out.println("\nDeveloper Details:");
        dev.displayDetails();
        System.out.println("\nManager Details:");
        mgr.displayDetails();
    }
}







