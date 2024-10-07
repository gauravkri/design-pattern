package observerdesignpatter.editorexample;

public class Test {

    public static void main(String[] args) {
        Editor editor = new Editor();
        EmailNotification emailNotification = new EmailNotification();
        LogEvents logEvents = new LogEvents();
        editor.eventNotification.registerObserver("save", emailNotification);
        editor.eventNotification.registerObserver("save", logEvents);
        
        editor.eventNotification.registerObserver("open", logEvents);
        editor.eventNotification.registerObserver("edit", emailNotification);
        editor.eventNotification.registerObserver("edit", logEvents);

        editor.open();
        editor.edit();
        editor.save();

    }
}
