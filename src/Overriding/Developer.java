package Overriding;

//Child class 1
public class Developer extends Employee {
public Developer(String name, double salary) {
 // Call to super constructor replaced by explicit initialization
 this.name = name;
 this.salary = salary;
}

//Override incrementSalary method for Developer
@Override
public void incrementSalary(double percentage) {
 // Developers get an additional bonus
 salary += salary * ((percentage + 10) / 100);
}
}