package week8.contacten;

public class PhoneNumber {
    private Kind kind;
    private String number;

    public PhoneNumber(Kind kind, String number) {
        this.kind = kind;
        this.number = number;
    }

    public Kind getKind() {
        return kind;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return number +" ("+(kind == Kind.FIXED?"V":"M")+")";
    }
}
