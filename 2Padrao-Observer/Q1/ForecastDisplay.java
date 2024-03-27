public class ForecastDisplay implements Observer, DisplayElement {
	private float atualtemperatura;
	@SuppressWarnings("unused")
    private WeatherData dados;

	public ForecastDisplay(WeatherData dados) {
		this.dados = dados;
		dados.registerObserver(this);
	}

	public void update(float temp, float humidity, float temperatura) {
        this.atualtemperatura = temperatura;

		display();
	}

	public void display() {
		System.out.print("\nTemperatura:" + atualtemperatura);
	}
}
