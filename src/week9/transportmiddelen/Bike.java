package week9.transportmiddelen;

import java.util.Collections;

public class Bike extends MeansOfTransport {
    public Bike(double speed) {
        super(speed);
    }

    @Override
    public String travelDistance(double distance) {
        int count = (int) Math.round((10 * distance) / speed);
        return String.join("-", Collections.nCopies(count, "iepe"));
    }
}
