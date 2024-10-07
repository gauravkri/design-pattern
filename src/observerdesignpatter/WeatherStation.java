package observerdesignpatter;

import java.util.*;

public class WeatherStation implements Subject{

    List<Observer> observers;

    private float temperature,  humidity, pressure;


    WeatherStation(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setWeatherMatrix(float temperature, float humidity, float pressure){
        this.humidity=humidity;
        this.temperature=temperature;
        this.pressure=pressure;
        notifyObserver();
    }

}
