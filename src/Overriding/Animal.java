package Overriding;

//Parent class
class Animal {
 public void printSound() {
     System.out.println("Animal makes a sound");
 }
 public static void main(String[] args) {
     Animal animal1 = new Dog();
     Animal animal2 = new Cat();
     Animal animal3 = new Pig();

     animal1.printSound(); // This will print "Dog barks"
     animal2.printSound(); // This will print "Cat meows"
     animal3.printSound(); // This will print "Pig oinks"
 }
}

//Subclass Dog
class Dog extends Animal {
 @Override
 public void printSound() {
     System.out.println("Dog barks");
 }
}

//Subclass Cat
class Cat extends Animal {
 @Override
 public void printSound() {
     System.out.println("Cat meows");
 }
}

//Subclass Pig
class Pig extends Animal {
 @Override
 public void printSound() {
     System.out.println("Pig oinks");
 }
}

