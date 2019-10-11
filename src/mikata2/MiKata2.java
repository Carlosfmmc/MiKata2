package mikata2;

public class MiKata2 {//Ctrl + r para cambiarle el nombre

    public static void main(String[] args) {
        Histogram histogram = new Histogram("Juan","Carlos", "Jose", "Juan", "Jose", "Carlos","Carlos", "Carlos", "Oliver", "Juan", "Carlos");
        HistogramDisplay histogramDisplay = new HistogramConsoleDisplay();
        histogramDisplay.show(histogram);
        /**
        histogram.add(9);
        histogram.add(9);
        histogram.add(-4);
        histogram.add(9);
        histogram.add(9);//Ctrl + shift + fecha para ir copiando linea
        histogram.add(9);
        histogram.remove(8);
        histogram.remove(1);
        */
        histogramDisplay.show(histogram);//Shift + alt + flecha para mover la linea
    }
    
}
