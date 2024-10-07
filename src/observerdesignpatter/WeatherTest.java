package observerdesignpatter;

public class WeatherTest {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay();
        StaticDisplay staticDisplay = new StaticDisplay();
        ForcastDisplay forcastDisplay = new ForcastDisplay();

        weatherStation.registerObserver(conditionDisplay);
        weatherStation.registerObserver(staticDisplay);
        weatherStation.registerObserver(forcastDisplay);

        weatherStation.setWeatherMatrix(25.3f, 65f, 1013.1f);
        weatherStation.setWeatherMatrix(27.6f, 70f, 1010.4f);

    }
}
