package facededesignpattern;

public class Projector {

    public void on(){
        System.out.println("Projector Turning on!");
    }

    public void screenMode(String mode){
        System.out.println("Setting projector to "+mode+" mode");
    }

    public void off(){
        System.out.println("Projector Turning off!");
    }
}
