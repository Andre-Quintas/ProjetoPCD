package iscot.events;

import iscot.enums.Areas;

public class GroundMoistureSensorEvent extends SensorEvent {
	
	private final double groundMoisture;

	public GroundMoistureSensorEvent(String eventId, Areas area, double groundMoisture) {
		super(eventId, area);
		this.groundMoisture = groundMoisture;
	}
	
	public double getGroundMoisture() {
		return groundMoisture;
	}
	
	@Override
    public String toString() {
        return "GroundMoistureSensorEvent [eventId=" + getEventId() + ", area=" + getArea() + ", groundMoisture=" + groundMoisture + "%]";
    }

}
