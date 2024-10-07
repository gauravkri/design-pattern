package observerdesignpatter;

public class CurrentConditionDisplay implements Observer{

    @Override
    public void update(float temperature, float humidity, float pressure) {
        
        System.out.println("current condition of weather: " +temperature +"C and humidity "+ humidity + "%");
    }

}

class StaticDisplay implements Observer{

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Static condition of weather: " +temperature +"C , humidity "+ humidity + "% and pressure "+ pressure);
    }
    
}

class ForcastDisplay implements Observer{

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Forecast display: Forecast based on pressure: " + pressure);
    }
    
}