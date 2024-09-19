package ch2;

public class ForecastDisplay implements DisplayElement, Observer {

    private float currentPressure = 29.92f;
    private float lastPressure;
    private final WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.lastPressure = this.currentPressure;
        this.currentPressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("the current pressure is: " + this.currentPressure + " , and the last pressure was: "
                + this.lastPressure);
    }
}
