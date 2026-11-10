package iscot.events;

import iscot.enums.Areas;

public class TemperatureSensorEvent extends SensorEvent {

	private final double temperature;
	
	public TemperatureSensorEvent(String eventId, Areas area, double temperature) {
		super(eventId, area);
		this.temperature = temperature;
	}

	public double getTemperature() {
		return temperature;
	}
	
	@Override
    public String toString() {
        return "TemperatureSensorEvent [eventId=" + getEventId() + ", area=" + getArea() + ", temperature=" + temperature + "Cº]";
    }
	
}
