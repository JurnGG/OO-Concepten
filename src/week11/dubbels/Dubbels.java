package week11.dubbels;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Dubbels {
    private List<String> data;

    public Dubbels(List<String> data) {
        this.data = data;
    }

    public void verwijderDubbels() {
        Set<String> uniqueData = new TreeSet<>(data);

        data = new ArrayList<>(uniqueData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(String merk : data) {
            sb.append(String.format("%-20s ",merk));
            index++;
            if(index % 4 == 0) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
