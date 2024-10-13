package singletondesignpattern;

public class ExampleSingleton {

    private static ExampleSingleton instance;
    private String value;

    private ExampleSingleton(String value) {
        this.value = value;
    }

    public static ExampleSingleton getInstance(String value){
        if(instance == null){
           instance = new ExampleSingleton(value);
        }
        return instance;
    }

    public String getValue(){
        return  value;
    }
}
