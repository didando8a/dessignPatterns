package observer;

import java.util.ArrayList;

public class WeatherData implements ISubject {
  private ArrayList<IObserver> observers;
  private float temperature;
  private float humidity;
  private float pressure;

  public void registerObserver(IObserver observer) {
    observers.add(observer);
  }

  public void removeObserver(IObserver observer) {
    int i = observers.indexOf(observer);

    if (i > 0) {
      observers.remove(i);
    }
  }

  public void notifyObservers() {
    for (IObserver observer : observers) {
      observer.update(temperature, humidity, pressure);
    }
  }

  public void measurementsChanged() {
    notifyObservers();
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;

    measurementsChanged();
  }
}
