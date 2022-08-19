package observer;

import observer.model.WeatherData;
import observer.model.concept.CurrentConditionsDisplay;

public class WeaterStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
