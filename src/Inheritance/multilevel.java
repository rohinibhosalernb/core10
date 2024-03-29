package Inheritance;

public class multilevel {
	
	    public static void main(String[] args) {
	        GrandChild grandChild = new GrandChild("Aarti", "Hadapsar", 22, "Sadhana", "Playing kho-kho");
	        
	        // Display grandchild information
	        grandChild.displayGrandChildInfo();
	    }
	

}

	// Parent class
	class Person {
	    String name;
	    String address;
	    int age;

	    // Constructor
	    Person(String name, String address, int age) {
	        this.name = name;
	        this.address = address;
	        this.age = age;
	    }

	    // Method to display person information
	    void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Address: " + address);
	        System.out.println("Age: " + age);
	    }
	}

	// Child class
	class Child extends Person {
	    String school;

	    // Constructor
	    Child(String name, String address, int age, String school) {
	        super(name, address, age);
	        this.school = school;
	    }

	    // Method to display child information
	    void displayChildInfo() {
	        displayInfo(); // Call parent's displayInfo method
	        System.out.println("School: " + school);
	    }
	}

	// Grandchild class
	class GrandChild extends Child {
	    String hobby;

	    // Constructor
	    GrandChild(String name, String address, int age, String school, String hobby) {
	        super(name, address, age, school);
	        this.hobby = hobby;
	    }

	    // Method to display grandchild information
	    void displayGrandChildInfo() {
	        displayChildInfo(); // Call child's displayChildInfo method
	        System.out.println("Hobby: " + hobby);
	    }
	}

	
