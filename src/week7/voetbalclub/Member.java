package week7.voetbalclub;

public class Member {
    private int id;
    private String name;
    private MemberType type;

    public Member(int id, String name, MemberType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public MemberType getType() {
        return type;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Type: " + type;
    }
}
