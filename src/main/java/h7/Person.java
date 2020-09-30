package h7;

import h12.MyAnnotation;
import h12.MyAnnotation2;

import java.util.Objects;

@MyAnnotation(value = "class person")
public class Person extends Human {
    private String name;
    private int age;
    private Gender gender = Gender.UNKNOWN;
    public static int numberOfPossibleGenders = Gender.values().length;
    private static final int MAXIMUM_AGE = 130;
    private HistoryRecord[] historyArray = new HistoryRecord[10];
    private int historyArrayCounter = 0;

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

    @MyAnnotation(value = "addhistory")
    @MyAnnotation2(value = "addhistory")
    public void addHistory(String descr) {
        HistoryRecord his = new HistoryRecord(descr);
        if (historyArrayCounter <= 9) {
            historyArray[historyArrayCounter] = his;
            historyArrayCounter++;
        } else {
            System.out.println("Array is full");
        }
    }

    @MyAnnotation2(value = "printhistory")
    public void printHistory() {
        for (HistoryRecord h : historyArray) {
            if (h != null) {
                System.out.println(h);
            }
        }
    }

    public Human createSubHuman() {
        return new Human() {
            @Override
            public String greet() {
                return "Sub is the best.";
            }
        };
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

    @Override
    public String greet() {
        return "Hello my name is " + this.name + ". Nice to meet you!";
    }

    private class HistoryRecord {
        String description;

        public HistoryRecord(String d) {
            this.description = d;
        }

        @Override
        public String toString() {
            return "HistoryRecord{" +
                    "description='" + description + '\'' +
                    '}';
        }
    }


}



