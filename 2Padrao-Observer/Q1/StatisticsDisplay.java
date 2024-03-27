public class StatisticsDisplay implements Observer, DisplayElement {
    private float umidade_maxima = 10;
    private float umidade_minima = 5;
    private int contadorupdate;
    private float umidade_soma_total = 0;
    @SuppressWarnings("unused")
    private WeatherData dados;

    public void update(float temperature, float humidity, float pressure) {
		umidade_soma_total += temperature;
		contadorupdate++;

		if (temperature > umidade_maxima) {
			umidade_maxima = temperature;
		}

		if (temperature < umidade_minima) {
			umidade_minima = temperature;
		}

		display();
	}

    public void display() {
		System.out.println("\nMaxima: " + umidade_maxima);
        System.out.println("Minmia: " + umidade_minima);
        System.out.println("media: " + umidade_soma_total/contadorupdate);
	}

    public StatisticsDisplay(WeatherData dados) {
		this.dados = dados;
		dados.registerObserver(this);
	}
}
