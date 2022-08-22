package observer.model.concept;

import observer.itf.DisplayElement;
import observer.itf.Observer;
import observer.model.WeatherData;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StatisticsDisplay implements Observer, DisplayElement {
    private List<Float> temperatureList = new ArrayList<>();
    private float temperature;
    private float avgTemperature;
    private float humidity;
    private float lowTemperature;
    private float highTemperature;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("평균 : " + avgTemperature + " 최저 : " + lowTemperature +" 최고 : " + highTemperature);
    }
    @Override
    public void update(float temperature, float humidity, float pressure) {
        temperatureList.add(temperature);
        avgTemperature = (float) temperatureList.stream().mapToDouble(Float::floatValue).average().orElse(Double.NaN);
        highTemperature = temperatureList.stream().max(Comparator.comparing(Float::floatValue)).get();
        lowTemperature = temperatureList.stream().min(Comparator.comparing(Float::floatValue)).get();
        display();
    }
}
