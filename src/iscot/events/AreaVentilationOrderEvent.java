package iscot.events;

import iscot.enums.Areas;

public class AreaVentilationOrderEvent extends HighLevelOrderEvent {

	private final boolean turnOn;
	
	public AreaVentilationOrderEvent(String eventId, Areas area, boolean turnOn) {
		super(eventId, area);
		// TODO Auto-generated constructor stub
		this.turnOn = turnOn;
	}
	
	public boolean isTurnOn() {
		return turnOn;
	}
	
	@Override
    public String toString() {
        return "AreaVentilationOrderEvent [eventId=" + getEventId() + ", area=" + getArea() + ", turnOn=" + turnOn + "]";
    }
}
