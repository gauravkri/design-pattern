package facededesignpattern;

public class Amplifier {

    public void on(){
        System.out.println("Amplifier is turning on!");
    }

    public void setVolume(int volume){
        System.out.println("Setting volume to "+volume);
    }

    public void off(){
        System.out.println("Amplifier is turning off!");
    }
}
