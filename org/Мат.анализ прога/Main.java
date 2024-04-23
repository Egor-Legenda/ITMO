package org.example;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main extends JFrame {
    static double[] maeData1 = new double[5]; // Example MAE data
    static double[] mseData1 = new double[5]; // Example MSE data
    static double[] maeData2 = new double[5]; // Example MAE data
    static double[] mseData2 = new double[5]; // Example MSE data
    static double[] maeData3 = new double[5]; // Example MAE data
    static double[] mseData3 = new double[5]; // Example MSE data
    static double delta1;
    private static ArrayList<DoublePoint> DoublePoints1=new ArrayList<>();
    private static ArrayList<DoublePoint> DoublePoints2=new ArrayList<>();
    private static ArrayList<DoublePoint> DoublePoints3=new ArrayList<>();

    public Main() {
        super("MAE and MSE Chart");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create series for MAE and MSE
        XYSeries maeSeries1 = new XYSeries("MAE for the rectangle method");
        XYSeries mseSeries1 = new XYSeries("MSE for the rectangle method");
        XYSeries maeSeries2 = new XYSeries("MAE for the trapeze method");
        XYSeries mseSeries2 = new XYSeries("MSE for the trapeze method");
        XYSeries maeSeries3 = new XYSeries("MAE for the Simpson method");
        XYSeries mseSeries3 = new XYSeries("MSE for the Simpson method");
        int j=0;
        // Add data to the series
        for (double i = delta1; i >delta1/16; i/=2) {
            maeSeries1.add(i, maeData1[j]);
            mseSeries1.add(i, mseData1[j]);
            maeSeries2.add(i, maeData2[j]);
            mseSeries2.add(i, mseData2[j]);
            maeSeries3.add(i, maeData3[j]);
            mseSeries3.add(i, mseData3[j]);
            j+=1;
        }

        // Create series collection and add series to it
        XYSeriesCollection dataset1 = new XYSeriesCollection();
        dataset1.addSeries(maeSeries1);
        dataset1.addSeries(mseSeries1);

        JFreeChart chart = ChartFactory.createXYLineChart(
                "MAE and MSE for ractangle", // Title
                "Iteration", // X-axis label
                "Error", // Y-axis label
                dataset1 // Dataset
        );

        // Customize the chart (if needed)
        // For example, set background color
        chart.setBackgroundPaint(Color.WHITE);

        // Create ChartPanel
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(400, 300)); // Set preferred size

        // Add ChartPanel to the frame


        XYSeriesCollection dataset2 = new XYSeriesCollection();
        dataset2.addSeries(maeSeries2);
        dataset2.addSeries(mseSeries2);

        JFreeChart chart2 = ChartFactory.createXYLineChart(
                "MAE and MSE for trapeze", // Title
                "Iteration", // X-axis label
                "Error", // Y-axis label
                dataset2 // Dataset
        );

        // Customize the chart (if needed)
        // For example, set background color
        chart.setBackgroundPaint(Color.WHITE);

        // Create ChartPanel
        ChartPanel chartPanel2 = new ChartPanel(chart2);
        chartPanel2.setPreferredSize(new Dimension(400, 300)); // Set preferred size

        XYSeriesCollection dataset3 = new XYSeriesCollection();
        dataset3.addSeries(maeSeries3);
        dataset3.addSeries(mseSeries3);
        // Create JFreeChart
        JFreeChart chart3 = ChartFactory.createXYLineChart(
                "MAE and MSE for Simpson", // Title
                "Iteration", // X-axis label
                "Error", // Y-axis label
                dataset3 // Dataset
        );

        // Customize the chart (if needed)
        // For example, set background color
        chart.setBackgroundPaint(Color.WHITE);

        // Create ChartPanel
        ChartPanel chartPanel3 = new ChartPanel(chart3);
        chartPanel3.setPreferredSize(new Dimension(400, 300)); // Set preferred size

        // Add ChartPanel to the frame
        JPanel contentPane = new JPanel(new GridLayout(1, 3));
        contentPane.add(chartPanel2);
        contentPane.add(chartPanel);
        contentPane.add(chartPanel3);
        setContentPane(contentPane);

        // Pack and display the frame
        pack();
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }
    private ArrayList<DoublePoint> points;


    public static void main(String[] args) {
        Read reader =new Read();
        org.example.Rectangle rectangle = new org.example.Rectangle();
        Trapeze trapeze = new Trapeze();
        Simpson simpson =new Simpson();
        Double a =reader.read("a");
        Double b =reader.read("b");
        Double n =reader.read("n");
        Split spliter =new Split(a,b,n);
        Double delta=spliter.spliter();
        Double delta_new=delta/16;
        delta1=delta;
        double del = 1;
        int i=0;
        while (delta>=delta_new) {
            Counter.setCount(delta,a,b);
            System.out.println("Для delta=delta"+"/"+(del));
            del=del*2;
            if (a == b) {

                System.out.println("Интегральная сумма при любом методе равна 0");

            } else {

                System.out.print("Интегральная сумма по методу прямоугольника равна ");
                System.out.println((rectangle.sum_rectangle(delta, a, b)));
                DoublePoints1.add(new DoublePoint(delta, abs((1989.78295-(rectangle.sum_rectangle(delta, a, b))))/2));
                maeData1[i]=abs((1989.78295-(rectangle.sum_rectangle(delta, a, b))))/Counter.count;
                mseData1[i]=pow((1989.78295-(rectangle.sum_rectangle(delta, a, b))),2)/Counter.count;
                System.out.print("Интегральная сумма по методу трапеций ");
                System.out.println((trapeze.sum_trapeze(delta, a, b)));
                DoublePoints2.add(new DoublePoint(delta/del*2, abs((1989.78295-(trapeze.sum_trapeze(delta, a, b))))/2));
                maeData2[i]=abs((1989.78295-(trapeze.sum_trapeze(delta, a, b))))/Counter.count;
                mseData2[i]=pow((1989.78295-(trapeze.sum_trapeze(delta, a, b))),2)/Counter.count;
                System.out.print("Интегральная сумма по методу Симпсона ");
                System.out.println((simpson.sum_simpson(delta, a, b)));
                DoublePoints3.add(new DoublePoint(delta/del*2, abs((1989.78295-(simpson.sum_simpson(delta, a, b))))/2));
                maeData3[i]=abs((1989.78295-(simpson.sum_simpson(delta, a, b))))/Counter.count;
                mseData3[i]=pow((1989.78295-(simpson.sum_simpson(delta, a, b))),2)/Counter.count;
            }
            delta=delta/2;
            i+=1;
        }
        /*for (int m=0;m<5;m+=1){
            System.out.println(maeData2[m]);
            System.out.println(mseData2[m]);
        }*/
        SwingUtilities.invokeLater(Main::new);

        // Создание списка точек
        ArrayList<DoublePoint> points = DoublePoints1;



    }
}