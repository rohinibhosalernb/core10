package Overriding;


public class Employee_override {
	public static void main(String[] args) {
	     Developer dev = new Developer("John Doe", 50000);
	     Manager mgr = new Manager("Jane Smith", 70000);

	     // Increment salary for developer and manager
	     dev.incrementSalary(10); // 10% increment plus 10% bonus for Developer
	     mgr.incrementSalary(15); // 15% increment plus 20% bonus for Manager

	     // Display details after increment
	     System.out.println("Developer Details:");
	     dev.displayDetails();
	     System.out.println("\nManager Details:");
	     mgr.displayDetails();
	 }
}
