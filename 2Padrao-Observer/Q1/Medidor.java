public class Medidor {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
	
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.measurementsChanged(25, 70, 1013.25f);
        weatherData.measurementsChanged(28, 65, 1012.50f);
        weatherData.measurementsChanged(22, 80, 1015.75f); 

		
		weatherData.removeObserver(forecastDisplay);
		weatherData.measurementsChanged(62, 90, 28.1f);
        weatherData.registerObserver(statisticsDisplay);
        weatherData.measurementsChanged(25, 70, 1013.25f);
        weatherData.registerObserver(currentDisplay);
        weatherData.measurementsChanged(250000, 70, 1013.25f);
	}
}