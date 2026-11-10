package iscot.events;

import iscot.enums.Areas;

public class AreaIrrigationOrderEvent extends HighLevelOrderEvent {

	private final boolean turnOn;
	
	public AreaIrrigationOrderEvent(String eventId, Areas area, boolean turnOn) {
		super(eventId, area);
		// TODO Auto-generated constructor stub
		this.turnOn = turnOn;
	}
	
	public boolean isTurnOn() {
		return turnOn;
	}
	
	@Override
    public String toString() {
        return "AreaIrrigationOrderEvent [eventId=" + getEventId() + ", area=" + getArea() + ", turnOn=" + turnOn + "]";
    }

}
