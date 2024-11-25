package week9.transportmiddelen;

import java.util.Collections;

public class Step extends MeansOfTransport {
    public Step(double speed) {
        super(speed);
    }

    @Override
    public String travelDistance(double distance) {
        int count = (int) Math.round((10 * distance) / speed);
        return String.join("-", Collections.nCopies(count, "zzz"));
    }
}