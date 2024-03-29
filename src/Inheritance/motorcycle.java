package Inheritance;

//Subclass 2
class motorcycle extends vehicle {
motorcycle(String modelNumber, double price) {
   super(modelNumber, price);
}

void ride() {
   System.out.println("Motorcycle " + modelNumber + " is riding...");
}
}


