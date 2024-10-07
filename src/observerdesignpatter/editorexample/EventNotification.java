package observerdesignpatter.editorexample;

import java.util.*;


public class EventNotification {

    Map<String, List<Listeners>> eventListioner = new HashMap<>();

    EventNotification(String... operations){
      for(String operation: operations)
        eventListioner.put(operation,new ArrayList<>());

    }

    
    public void registerObserver(String operation ,Listeners o) {
        this.eventListioner.get(operation).add(o);
    }

   
    public void removeObserver(String operation,Listeners o) {
       this.eventListioner.get(operation).remove(o);
    }

    
    public void notifyObserver(String operation, String fileName) {
       this.eventListioner.get(operation)
            .forEach(Listener -> Listener.update(operation, fileName));
    }

}
