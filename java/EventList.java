import java.util.ArrayList;
public class EventList {
    public ArrayList<Event> events = new ArrayList<>();
    public void addEvent(Event event){
        events.add(event);
    }
    public void removeEvent(Event event){
        events.remove(event);
    }
}



