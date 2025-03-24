package model;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public abstract void makeSound();

    public void displayInfo(){
        System.out.println("Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}');
    }
}

