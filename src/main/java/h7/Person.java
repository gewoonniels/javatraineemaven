package h7;

public class Person {
    private String name;
    private int age;
    private Gender gender = Gender.UNKNOWN;
    public static int numberOfPossibleGenders = Gender.values().length;
    private static final int maximumAge = 130;

    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public void setAge(int age) {
        if (age > maximumAge) {
            throw new PersonDiedException("Persoon is ouder dan " + maximumAge + " en gaat dood");
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
}



