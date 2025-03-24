import model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        doBank();
//        doStudent();
        doAnimal();
    }

    public static void doBank(){
        BankAccount ba1 = new BankAccount("Minh", 1, 1000);

        ba1.deposit(200);
        System.out.println(ba1.getBalance());;
        ba1.withdraw(500);
        System.out.println(ba1.getBalance());;
    }

    public static void doStudent(){
        Student s1 = new Student("John", 18, "J001", "Math");
        s1.displayInfo();
    }

    public static void doAnimal(){
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog(5,"Mic"));
        animals.add(new Dog(2,"Lu"));
        animals.add(new Duck(5,"Mic"));

        for (Animal a : animals) {
            a.displayInfo();
            a.makeSound();
            if (a instanceof Runable) {
                ((Runable) a).run();
            }
            if (a instanceof Flyable) {
                ((Flyable) a).fly();
            }
        }
    }

}