package mikata2;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class NHistogram implements Iterable<DataObjet>{
    
    Map<DataObjet, Integer> histogram = new TreeMap();
    
    NHistogram(DataObjet ... values) {
        for (DataObjet value : values) {
            histogram.put(value, histogram.getOrDefault(value, 0)+1);
        }
    }

    @Override
    public Iterator<DataObjet> iterator() {
        return histogram.keySet().iterator();
    }
    public int getTimes(DataObjet h1) {
        return histogram.get(h1);
    }

    public void add(DataObjet i) {
        histogram.put(i, histogram.getOrDefault(i, 0)+1);
    }

    void remove(DataObjet i) {
        histogram.put(i, histogram.getOrDefault(i, 0)-1);
    }

    public void clear() {
        histogram.clear();
    }
    
}
