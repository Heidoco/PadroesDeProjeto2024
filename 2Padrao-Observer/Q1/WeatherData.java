import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	private float humidity;
    private float temperature;
	private float pressure;

    private List<Observer> observers;

    public WeatherData() {
		observers = new ArrayList<Observer>();
	}

    public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}

    public float getHumidity() {
        return humidity;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void measurementsChanged(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
        notifyObservers();
    }
}
