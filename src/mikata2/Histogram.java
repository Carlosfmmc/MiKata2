package mikata2;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
@Deprecated
public class Histogram<T> implements Iterable<T>{
    
    Map<T, Integer> hist = new TreeMap();
    
    Histogram(T ... values) {
        for (T value : values) {
            hist.put(value, hist.getOrDefault(value, 0)+1);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return hist.keySet().iterator();
    }
    

    public int getTimes(T h1) {
        return hist.get(h1);
    }

    public void add(T i) {
        hist.put(i, hist.getOrDefault(i, 0)+1);
    }

    void remove(T i) {
        hist.put(i, hist.getOrDefault(i, 0)-1);
    }

    public void clear() {
        hist.clear();
    }
    
    
    
}
