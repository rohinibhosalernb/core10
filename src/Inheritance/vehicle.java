package Inheritance;

//Superclass
class vehicle {
 String modelNumber;
 double price;

 // Constructor
 vehicle(String modelNumber, double price) {
     this.modelNumber = modelNumber;
     this.price = price;
 }

 void start() {
     System.out.println("Vehicle " + modelNumber + " is starting...");
 }

 void stop() {
     System.out.println("Vehicle " + modelNumber + " is stopping...");
 }

 void displayInfo() {
     System.out.println("Model Number: " + modelNumber);
     System.out.println("Price: $" + price);
 }
}



