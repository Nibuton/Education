package Chapter_2;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private double temperature;
    private double humidity;
    private double pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update() {
        if(weatherData instanceof WeatherData) {
            temperature = ((WeatherData) weatherData).getTemperature();
            humidity = ((WeatherData) weatherData).getHumidity();
            pressure = ((WeatherData) weatherData).getPressure();
            display();
        }
    }

    @Override
    public void display() {

        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
        System.out.println("Pressure: " + pressure);
    }

}
