package week8.modelbouwclub;

import java.util.Objects;

public class NormalMember extends Member {
    private String specialization;

    public NormalMember(String name, int number, String specialization) {
        super(name, number);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "gewoon lid " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NormalMember that = (NormalMember) o;
        return Objects.equals(getName(), that.getName()) && getNumber() == that.getNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), specialization);
    }
}
