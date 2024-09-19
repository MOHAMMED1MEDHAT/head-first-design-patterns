package ch2;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(132, 312, 32.4f);
        weatherData.setMeasurements(134, 311, 31.4f);
        weatherData.setMeasurements(133, 310, 33.4f);
        currentConditionDisplay.display();
        forecastDisplay.display();
    }
}
