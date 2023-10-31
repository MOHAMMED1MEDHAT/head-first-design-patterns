package ch2;

public class ForecastDisplay implements DisplayElement, Observer {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    public void update() {
        this.lastPressure = this.currentPressure;
        this.currentPressure = weatherData.getPressure();
        display();
    }

    public void display() {
        System.out.println("the current Pressuer is: " + this.currentPressure + " , and the last pressure was: "
                + this.lastPressure);
    }
}
