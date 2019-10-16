package mikata2;

import java.util.Map;

class NHistogramConsoleDisplay implements NHistogramDisplay {

    public NHistogramConsoleDisplay() {
        System.out.println("Histogram");
    }

    @Override
    public void show(NHistogram h) {
        h.stream().forEach((x) -> {
            System.out.println(x);
        });
        System.out.println("--------------------------------------");

    }
    
}
