package Overloading;

public class Employee {
    private String name;
    private int age;
    private double salary;
    
    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    // Method to display employee details with int salary
    public void displayDetails(int bonus) {
        double totalSalary = salary + bonus;
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + totalSalary);
    }
    
    // Overloaded method to display employee details with double salary
    public void displayDetails(double bonus) {
        double totalSalary = salary + bonus;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + totalSalary);
    }
    
    public static void main(String[] args) {
        Employee emp1 = new Employee("Jyoti", 30, 50000);
        Employee emp2 = new Employee("Ankit", 35, 60000);
        
        // Calling displayDetails method with int bonus for emp1
        emp1.displayDetails(5000);
        
        // Calling displayDetails method with double bonus for emp2
        emp2.displayDetails(6000.50);
    }
}
