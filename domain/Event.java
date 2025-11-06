import java.util.List;

public class Event {
    private int eventId;
    private String eventName;
    private String eventDate;
    private int eventTime;
    private List<String> eventLocations;
    private List<Integer> eventCapacityByLocations;
    private String eventType;
    private Venue venue;
    private List<Ticket> tickets;

    public Event(int eventId, String eventName, String eventDate, int eventTime, String eventType){
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.eventType = eventType;
    }

    public void setEventName(String newEventName){
        if(!newEventName.equals("")){
            eventName = newEventName;
        }
    }
    
    public void setEventDate(String newEventDate){
        if(!newEventDate.equals("")){
            eventDate = newEventDate;
        }
    }

    public void setEventTime(int newEventTime){
        if(newEventTime > 0 && newEventTime < 2400){
            eventTime = newEventTime;
        }
    }

    public void setEventType(String newEventType){
        if(!newEventType.equals("")){
            eventType = newEventType;
        }
    }

    public void createEventLocations(String nameLocation){
        eventLocations.add(nameLocation);
    }

    public void createEventCapacityByLocations(int CapacityByLocations){
        
    }


    public String getEventName(){return eventName;}
    public String getEventDate(){return eventDate;}
    public int getEventTime(){return eventTime;}
    public String getEventType(){return eventType;}
}
