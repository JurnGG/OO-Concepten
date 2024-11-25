package week9.transportmiddelen;

import java.util.Collections;

public class OnFoot extends MeansOfTransport {
    public OnFoot(double speed) {
        super(speed);
    }

    @Override
    public String travelDistance(double distance) {
        int count = (int) Math.round((10 * distance) / speed);
        return String.join("-", Collections.nCopies(count, "stap"));
    }
}
