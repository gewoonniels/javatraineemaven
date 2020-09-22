package h7;

public class Person extends Human {
    private String name;
    private int age;
    private Gender gender = Gender.UNKNOWN;
    public static int numberOfPossibleGenders = Gender.values().length;
    private static final int MAXIMUM_AGE = 130;

    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public Person(String name, int age, Gender gender) {
        this(name, age);
        this.gender = gender;
    }

    public void setAge(int age) {
        if (age > MAXIMUM_AGE) {
            throw new PersonDiedException("Persoon is ouder dan " + MAXIMUM_AGE + " en gaat dood");
        } else {
            this.age = age;
        }
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
        setAge(++this.age);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void finalize() {
        System.out.println("FINALIZE NOW");
    }

    @Override
    public String greet() {
        return "Hello my name is " + this.name + ". Nice to meet you!";
    }
}



