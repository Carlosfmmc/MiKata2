package mikata2;
@Deprecated
class HistogramConsoleDisplay implements HistogramDisplay {

    public HistogramConsoleDisplay() {
        System.out.println("Histogram");
    }

    @Override
    public void show(Histogram h) {
        System.out.println("--------------------------------------");
        for (Object h1 : h) {
            System.out.println(h1 + ":" + h.getTimes(h1) + "veces");
        }
        System.out.println("-------------------------------------");
        
    }
    
}
