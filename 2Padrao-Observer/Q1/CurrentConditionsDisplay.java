public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperatura;
	private float umidade;
    private float pressao;
	@SuppressWarnings("unused")
    private WeatherData dados;
	
	public CurrentConditionsDisplay(WeatherData dados) {
		this.dados = dados;
		dados.registerObserver(this);
	}
	
	public void update(float temperatura, float umidade, float pressao) {
		this.temperatura = temperatura;
		this.umidade = umidade;
        this.pressao = pressao;
		display();
	}
	
	public void display() {
		System.out.println("Temp:" + temperatura + "\numidade" + umidade + "\npressao: " + pressao);
    }
}