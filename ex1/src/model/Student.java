package model;

public class Student extends Person {

    private String studentId;
    private String major;

    public Student(String name, int age, String studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }

    @Override
    public void displayInfo() {
        System.out.println("Person{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() + '\'' +
                ", major='" + major + '\'' +
                ", studentId='" + studentId +
                '}');
    }
}
