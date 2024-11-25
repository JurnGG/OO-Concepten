package week7.boogschietclub;

public class Member {
    private int number;
    private String name;
    private static int nextId = 10000;

    public Member(String name) {
        this.name = name;
        number = nextId++;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public static int getNextId() {
        return nextId;
    }
}
