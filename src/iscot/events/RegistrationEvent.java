package iscot.events;

import iscot.enums.Areas;
import iscot.enums.Type;

public class RegistrationEvent extends Event {

	public RegistrationEvent(String eventId, Areas area, Type type) {
		super(eventId, area, type);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public String toString() {
        return "RegistrationEvent [eventId=" + getEventId() + ", area=" + getArea() + ", type=" + getType() + ", timestamp=" + getTimestamp() + "]";
    }

}
