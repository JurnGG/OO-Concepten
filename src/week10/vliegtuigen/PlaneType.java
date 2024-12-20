package week10.vliegtuigen;

public class PlaneType {
    private String code;
    private String description;

    public PlaneType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "PlaneType{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
