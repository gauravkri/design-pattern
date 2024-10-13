package facededesignpattern;

public class FacadeHomeTheater {

    public void watchMovie(){
        System.out.println("Getting ready to watch movie.......");
         Amplifier amp = new Amplifier();
         TheaterLights lights = new TheaterLights();
         DVDplayer player = new DVDplayer();
         Projector projector = new Projector();

         lights.on();
         lights.dimLights(10);
         projector.on();
         projector.screenMode("widescreen");
         amp.on();
         amp.setVolume(8);
         player.on();
         player.play("Iron Man");
    }

}