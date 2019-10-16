package mikata2;

public interface NHistogramDisplay {

    public default void NHistogramDisplay(){
        System.out.println("Histogram");
    }
    public void    show(NHistogram h);
    
}
