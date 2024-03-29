package Inheritance;

//Subclass 1
class car extends vehicle {
car(String modelNumber, double price) {
   super(modelNumber, price);
}

void drive() {
   System.out.println("Car " + modelNumber + " is driving...");
}
}

