package mikata2;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class NHistogram implements Iterable<Map.Entry<DataObjet, Integer>>{
    
    Map<DataObjet, Integer> histogram = new TreeMap();
    
    NHistogram(DataObjet ... values) {
        for (DataObjet value : values) {
            histogram.put(value, histogram.getOrDefault(value, 0)+1);
        }
    }
    
    public Stream<Map.Entry<DataObjet, Integer>> stream(){
        return histogram.entrySet().stream();
    }
    public Iterator<Map.Entry<DataObjet, Integer>> iterator() {
        return histogram.entrySet().iterator();
    }
    public Iterator<DataObjet> iterator(Predicate p) {
        return histogram.entrySet().stream().filter(p).iterator();
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
