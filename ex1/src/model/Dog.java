package model;

public class Dog extends Animal implements Runable{

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void makeSound() {
        System.out.println("gau gau");
    }

    @Override
    public void run() {
        System.out.println("run");
    }
}

