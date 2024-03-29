package Inheritance;

public class hierarchical_inhe {

	
		 public static void main(String[] args) {
		     car car = new car("C100", 20000);
		     motorcycle motorcycle = new motorcycle("M200", 10000);
		     
		     // Display information about vehicles
		     System.out.println("Car Information:");
		     car.displayInfo();
		     System.out.println();

		     System.out.println("Motorcycle Information:");
		     motorcycle.displayInfo();
		     System.out.println();

		    

		     // Perform actions on vehicles
		     car.start();
		     car.drive();
		     car.stop();
		     System.out.println();

		     motorcycle.start();
		     motorcycle.ride();
		     motorcycle.stop();
		     System.out.println();

		     
		 }
		}
