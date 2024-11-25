package week7.vervaldatums;

public enum Variety {
    WHITE,BROWN;

    public String toString() {
        return switch (this) {
            case WHITE -> "wit";
            case BROWN -> "bruin";
        };
    }
}
