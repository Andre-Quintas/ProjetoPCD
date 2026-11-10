package iscot.events;
import iscot.enums.Areas;
import iscot.enums.Type;

public abstract class Event {
	
	private final String eventId;
	private final Areas area;
	private final long timestamp;
	private final Type type;
	
	public Event(String eventId, Areas area, Type type) {
		this.eventId = eventId;
		this.area = area;
		this.type = type;
		this.timestamp = System.currentTimeMillis();
	}
	
	
	public String getEventId() {
		return eventId;
	}
	public Areas getArea() {
		return area;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public Type getType() {
		return type;
	}

	
	@Override
    public String toString() {
        return "Event [eventId=" + eventId + ", area=" + area + ", type=" + type + ", timestamp=" + timestamp + "]";
    }
}
