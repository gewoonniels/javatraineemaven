package h7;

public class Person {
    public String name;
    public int age;
    public Gender gender;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void haveBirthday() {
        this.age++;
    }

    public static int numberOfPossibleGenders() {
        return Gender.values().length;
    }
}



