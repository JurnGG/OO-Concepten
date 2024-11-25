package Week4;

public class Lamp {
    private boolean on;

    public Lamp(boolean on) {
        this.on = on;
    }

    public boolean isOn() {
        return on;
    }

    public void switchOn() {
        this.on = true;
    }

    public void switchOff() {
        this.on = false;
    }

}
