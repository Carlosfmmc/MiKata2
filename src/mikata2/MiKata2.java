package mikata2;

public class MiKata2 {//Ctrl + r para cambiarle el nombre

    public static void main(String[] args) {
        Histogram histogram = new Histogram(3,1,4,5,34,2,1,-4,4,5,2,-2,4,-4,2,1,6,7,7,8,2,1);
        HistogramDisplay histogramDisplay = new HistogramConsoleDisplay();
        histogramDisplay.show(histogram);
        histogram.add(9);
        histogram.remove(8);
    }
    
}
