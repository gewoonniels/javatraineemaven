package h7;

public class Teacher extends Person {

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    public String greet() {
        return super.greet();
    }
}
