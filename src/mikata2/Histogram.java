package mikata2;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Histogram implements Iterable<Integer>{
    
    Map<Integer, Integer> hist = new TreeMap();
    
    Histogram(int ... values) {
        for (int value : values) {
            hist.put(value, hist.getOrDefault(value, 0)+1);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return hist.keySet().iterator();
    }
    

    public int getTimes(int h1) {
        return hist.get(h1);
    }

    public void add(int i) {
        hist.put(i, hist.getOrDefault(i, 0)+1);
    }

    void remove(int i) {
        hist.put(i, hist.getOrDefault(i, 0)-1);
    }

    public void clear() {
        hist.clear();
    }
    
    
    
}
