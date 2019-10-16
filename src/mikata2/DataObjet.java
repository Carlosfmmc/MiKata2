package mikata2;

class DataObjet<T> implements Comparable<DataObjet<T>>{
    
    final private T t;

    public T getT() {
        return t;
    }

    public DataObjet(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return t.toString();
    }

    @Override
    public int compareTo(DataObjet<T> o) {//Duda, me podran enviar para comparar un DataObjet con diferente T Como un DataObjet<String> con uno <Int>
        return t.toString().compareTo(o.toString());
    }

    
        
}
