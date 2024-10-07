package observerdesignpatter.editorexample;



public class LogEvents implements Listeners {
    @Override
    public void update(String event, String fileNameString) {
        System.out.println("Log: Operation "+event+" perform on File "+fileNameString); 
    }
}
