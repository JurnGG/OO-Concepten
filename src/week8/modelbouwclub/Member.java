package week8.modelbouwclub;

import java.util.Objects;

public class Member {
    private String name;
    private int number;

    public Member(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Member member = (Member) obj;
        return number == member.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
