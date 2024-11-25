package week8.modelbouwclub;

import java.util.Objects;

public class BoardMember extends Member {
    private String role;

    public BoardMember(String name, int number, String role) {
        super(name, number);
        this.role = role;
    }

    @Override
    public String toString() {
        return "bestuurslid " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()){
            NormalMember that = (NormalMember) o;
            return Objects.equals(getName(), that.getName()) && getNumber() == that.getNumber();
        }else {
            if (!super.equals(o)) return false;
            BoardMember that = (BoardMember) o;
            return Objects.equals(role, that.role) && Objects.equals(getName(), that.getName());
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),role, getName());
    }
}
