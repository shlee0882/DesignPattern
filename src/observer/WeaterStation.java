package observer;

import observer.model.WeatherData;
import observer.model.concept.CurrentConditionsDisplay;
import observer.model.concept.StatisticsDisplay;

public class WeaterStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(82, 70, 29.2f);
    }
}
