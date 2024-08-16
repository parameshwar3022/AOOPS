
class WeatherService {
    public String getWeatherData(String location) {
        // Simulate weather data retrieval
        return "Sunny, 25°C";
    }

    public boolean isForecastAccurate(String forecast, String actualWeather) {
        // Simulate checking the accuracy of the forecast
        return forecast.equals(actualWeather);
    }

    public void notifyUser(String message) {
        System.out.println("Notification: " + message);
    }
}
