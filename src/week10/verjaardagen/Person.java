package week10.verjaardagen;

public class Person {
    private String name;
    private Birthday birthday;

    public Person(String name, Birthday birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Person(String name, int day, Month month) {
        this.name = name;
        this.birthday = new Birthday(day, month);
    }

    public String getName() {
        return name;
    }

    public Birthday getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return name + " -> " + birthday.toString();
    }
}
