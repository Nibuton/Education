package Chapter_2;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.addObserver(currentConditionsDisplay);
        weatherData.setChanges(36.6, 123.456, 765.0);
        weatherData.measurementsChanged();
    }
}
