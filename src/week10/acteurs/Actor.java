package week10.acteurs;

import java.util.Objects;

public class Actor implements Comparable{
    private String name;
    private int birthYear;

    public Actor(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public int compareTo(Actor other){
        int yearcomparison = Integer.compare(this.birthYear, other.birthYear);

        if(yearcomparison != 0){
            return yearcomparison;
        }

        return this.name.compareTo(other.name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Actor other)) return false;
        return this.birthYear == other.birthYear && this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + Integer.hashCode(birthYear);
    }

    @Override
    public String toString() {
        return birthYear + " " + name;
    }
}
