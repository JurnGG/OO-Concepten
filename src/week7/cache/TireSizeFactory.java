package week7.cache;

import java.util.Arrays;

public class TireSizeFactory {
    private static TireSize[] tireSizeCache = new TireSize[100];
    private static int size = 0;

    public static TireSize create(int width, int aspect, int diameter) {
        for (int i = 0; i < size; i++) {
            if (tireSizeCache[i].getWidth() == width && tireSizeCache[i].getAspect() == aspect && tireSizeCache[i].getDiameter() == diameter) {
                return tireSizeCache[i];
            }
        }

        TireSize tireSize = new TireSize(width, aspect, diameter);
        if (size < tireSizeCache.length) {
            tireSizeCache[size] = tireSize;
            size++;
        }

        return tireSize;
    }


}
