package observerdesignpatter.editorexample;

public class Editor {
   
    EventNotification eventNotification;

    Editor(){
        this.eventNotification= new EventNotification("save", "edit", "open");
    }

    public void save(){
        eventNotification.notifyObserver("save", "file1");
    }

    public void edit(){
        eventNotification.notifyObserver("edit", "file1");
    }

    public void open(){
        eventNotification.notifyObserver("open", "file1");
    }
}
