package Overriding;

//Child class 2
class Manager extends Employee {
public Manager(String name, double salary) {
 // Call to super constructor replaced by explicit initialization
 this.name = name;
 this.salary = salary;
}

//Override incrementSalary method for Manager
@Override
public void incrementSalary(double percentage) {
 // Managers get an additional bonus
 salary += salary * ((percentage + 20) / 100);
}
}
