package h7;

public class Employee extends Person {

    public Employee(String name, int age) {
        super(name, age);
    }

    public Employee(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    public String greet() {
        return "I'm tired of working. This is inhuman!";
    }
}
