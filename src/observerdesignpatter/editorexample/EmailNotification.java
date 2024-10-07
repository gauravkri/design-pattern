package observerdesignpatter.editorexample;

public class EmailNotification implements Listeners {

    @Override
    public void update(String event, String fileNameString) {
        System.out.println("Email: Operation "+event+" perform on File "+fileNameString); 
    }

}
