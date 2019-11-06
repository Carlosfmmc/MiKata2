package kata3;

import java.awt.Container;
import mikata2.NHistogram;
import mikata2.NHistogramDisplay;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class JHistogramDisplay extends ApplicationFrame implements NHistogramDisplay{
    
    private final NHistogram histogram;
    private final String titleX;
    private final String titleY;
    private final String histogramtitle;

    public JHistogramDisplay(String title, NHistogram histogram, String histogramtitle, String titleX,String titleY) {
        super(title);
        this.histogramtitle = histogramtitle;
        this.histogram = histogram;
        this.titleX = titleX;
        this.titleY = titleY;
        this.setContentPane(createPanel());
        pack();
    }
    

    private Container createPanel() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        //Meter en el dataset la mierda esta
        JFreeChart chart = ChartFactory.createBarChart(histogramtitle, titleX, titleY, dataset, PlotOrientation.VERTICAL, false, false, false);
        returm chart;
    }

    @Override
    public void show(NHistogram h) {
        setVisible(true);
    }
    
}
