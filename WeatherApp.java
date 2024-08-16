public class WeatherApp {
    private WeatherService weatherService;

    public WeatherApp() {
        weatherService = new WeatherService();
    }

    public void checkWeather(String location) {
        String weatherData = weatherService.getWeatherData(location);
        System.out.println("Weather in " + location + ": " + weatherData);

        String forecast = "Sunny, 25°C"; // Example forecast
        if (weatherService.isForecastAccurate(forecast, weatherData)) {
            weatherService.notifyUser("Your forecast was accurate!");
        } else {
            weatherService.notifyUser("The forecast was inaccurate.");
        }
    }
}
