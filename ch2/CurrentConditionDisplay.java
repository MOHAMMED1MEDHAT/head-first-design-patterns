package ch2;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + this.temp
                + "F degrees and " + this.humidity + "% humidity");
    }
}