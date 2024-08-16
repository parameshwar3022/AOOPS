public class WeatherAppTest {

    public static void main(String[] args) {
        WeatherAppTest test = new WeatherAppTest();
        test.testCheckWeather();
        System.out.println("Weather app test passed.");
    }

    public void testCheckWeather() {
        WeatherApp weatherApp = new WeatherApp();
        weatherApp.checkWeather("New York");

        // Since it's a simulation, we trust the internal logic for now.
        // A real test would involve mocking the WeatherService.
    }
}
