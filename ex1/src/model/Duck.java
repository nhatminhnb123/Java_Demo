package model;

public class Duck extends Animal implements Runable, Flyable {

    public Duck(int age, String name) {
        super(age, name);
    }

    @Override
    public void makeSound() {
        System.out.println("quac quac");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void run() {
        System.out.println("run");
    }
}
