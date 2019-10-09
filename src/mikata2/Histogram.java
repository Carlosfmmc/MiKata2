package mikata2;

import java.util.Map;
import java.util.TreeMap;

public class Histogram {
    
    Map<Integer, Integer> hist = new TreeMap();
    
    Histogram(int ... values) {
        for (int value : values) {
            hist.put(value, hist.getOrDefault(value, 0)+1);
        }
    }
    
    
}
