package Chapter_2;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observers;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData(){
        observers = new ArrayList();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(int i = 0; i < observers.size(); i++){
            ((Observer) observers.get(i)).update();
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setChanges(double temperature, double humidity, double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        // measurementsChanged();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
