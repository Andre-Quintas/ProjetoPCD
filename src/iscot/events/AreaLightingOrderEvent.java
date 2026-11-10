package iscot.events;

import iscot.enums.Areas;

public class AreaLightingOrderEvent extends HighLevelOrderEvent {

	private final boolean turnOn;

	public AreaLightingOrderEvent(String eventId, Areas area, boolean turnOn) {
		super(eventId, area);
		this.turnOn = turnOn;
	}
	
	public boolean isTurnOn() {
		return turnOn;
	}
	
	@Override
    public String toString() {
        return "AreaLightingOrderEvent [eventId=" + getEventId() + ", area=" + getArea() + ", turnOn=" + turnOn + "]";
    }

}
