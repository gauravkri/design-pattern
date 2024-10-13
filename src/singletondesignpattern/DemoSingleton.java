package singletondesignpattern;

public class DemoSingleton {

    public static void main(String[] args) {
        ExampleSingleton singleton = ExampleSingleton.getInstance("FOO");
        ExampleSingleton singleton1 = ExampleSingleton.getInstance("BOB");

        //if value is different then two object singleton class has been created.
        System.out.println(singleton.getValue());
        System.out.println(singleton1.getValue());

    }
}
