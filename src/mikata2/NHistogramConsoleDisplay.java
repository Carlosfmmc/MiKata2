package mikata2;

class NHistogramConsoleDisplay implements NHistogramDisplay {

    public NHistogramConsoleDisplay() {
        System.out.println("Console Histogram");
    }

    @Override
    public void show(NHistogram h) {
        h.stream().forEach((x) -> {
            System.out.println(x);
        });
        System.out.println("--------------------------------------");

    }
    
}
