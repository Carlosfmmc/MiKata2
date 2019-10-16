package mikata2;

public class MiKata2 {//Ctrl + r para cambiarle el nombre

    public static void main(String[] args) {
        
        NHistogram nHistogram = new NHistogram(new DataObjet('a'), new DataObjet('a'), new DataObjet('e'), new DataObjet('c'), new DataObjet('b'), new DataObjet('c'));
        nHistogram.add(new DataObjet(9));
        nHistogram.add(new DataObjet(9));
        nHistogram.add(new DataObjet("y si soy el p*** amo?"));
        NHistogramDisplay nHistogramDisplay = new NHistogramConsoleDisplay();
        nHistogramDisplay.show(nHistogram);
        
        
                
    }
    
}
