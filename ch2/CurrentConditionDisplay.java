package ch2;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;
    private float heatIndex;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    public void update() {
        this.temp = weatherData.getTemp();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        this.heatIndex = weatherData.getHeatIndex();
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + this.temp
                + "F degrees and " + this.humidity + "% humidity and " + this.pressure + " Pressuer and "
                + this.heatIndex
                + " heatIndex");
    }
}