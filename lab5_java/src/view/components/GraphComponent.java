package view.components;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;

import model.Dataset;
import org.jfree.ui.ApplicationFrame;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;

import org.jfree.data.category.CategoryDataset;

import org.jfree.chart.renderer.category.LineAndShapeRenderer;

public class GraphComponent extends ApplicationFrame
{
    private static final long serialVersionUID = 1L;
    String title;

    public GraphComponent(final String title, int type)
    {
        super(title);
        this.title = title;
        if (type == 1) {
            final CategoryDataset dataset = Dataset.createDatasetAddSR();
            final JFreeChart chart = createChart(dataset);
            final ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new Dimension(560, 480));
            setContentPane(chartPanel);
        }
        else if (type == 2) {
            final CategoryDataset dataset = Dataset.createDatasetAddOB();
            final JFreeChart chart = createChart(dataset);
            final ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new Dimension(560, 480));
            setContentPane(chartPanel);
        }
        else if (type == 3) {
            final CategoryDataset dataset = Dataset.createDatasetRemoveSR();
            final JFreeChart chart = createChart(dataset);
            final ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new Dimension(560, 480));
            setContentPane(chartPanel);
        }
        else if (type == 4) {
            final CategoryDataset dataset = Dataset.createDatasetRemoveOB();
            final JFreeChart chart = createChart(dataset);
            final ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new Dimension(560, 480));
            setContentPane(chartPanel);
        }
    }

    private JFreeChart createChart(final CategoryDataset dataset)
    {
        final JFreeChart chart = ChartFactory.createLineChart(
                title,       // chart title
                null,                      // domain axis label
                "Значение",                // range axis label
                dataset,                   // data
                PlotOrientation.VERTICAL,  // orientation
                true,                      // include legend
                true,                      // tooltips
                false                      // urls
        );

        chart.setBackgroundPaint(Color.white);

        final CategoryPlot plot = (CategoryPlot) chart.getPlot();
        plot.setBackgroundPaint(Color.black);
        plot.setRangeGridlinePaint(Color.white);

        // customise the range axis...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        rangeAxis.setAutoRangeIncludesZero(true);

        // customise the renderer...
        final LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();

        renderer.setSeriesStroke(
                0, new BasicStroke(
                        2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND,
                        1.0f, new float[] {10.0f, 6.0f}, 0.0f
                )
        );
        renderer.setSeriesStroke(
                1, new BasicStroke(
                        2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND,
                        1.0f, new float[] {6.0f, 6.0f}, 0.0f
                )
        );
        return chart;
    }
}
