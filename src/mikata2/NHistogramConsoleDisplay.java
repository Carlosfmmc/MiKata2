package mikata2;

class NHistogramConsoleDisplay implements NHistogramDisplay {

    public NHistogramConsoleDisplay() {
        System.out.println("Histogram");
    }

    @Override
    public void show(NHistogram h) {
        System.out.println("--------------------------------------");
        for (DataObjet h1 : h) {
            System.out.println(h1 + ":" + h.getTimes(h1) + "veces");
        }

    }
    
}
