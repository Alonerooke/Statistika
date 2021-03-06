package model;

import javafx.scene.chart.XYChart;

import java.util.ArrayList;

public class Chart extends Filter3 implements Step<ArrayList<Double>, XYChart.Series<String, Double>>{


    public Chart(Filter3 processor) {
        super(processor);
    }

    @Override
    public XYChart.Series<String, Double> execute(ArrayList<Double> input) {
        ArrayList<String> str = new ArrayList<String>();
        str.add("1");
        str.add("2");
        str.add("3");
        str.add("4");
        str.add("5");
        XYChart.Series<String, Double> series = new XYChart.Series<>();
        for (int i = 0; i < input.size(); i++) {
            series.getData().add(new XYChart.Data<>(str.get(i), input.get(i)));
        }
        return series;
    }
}
