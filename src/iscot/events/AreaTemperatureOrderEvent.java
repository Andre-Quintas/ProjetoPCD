package iscot.events;

import iscot.enums.Areas;

public class AreaTemperatureOrderEvent extends HighLevelOrderEvent {

	private final double temperature;
	
	public AreaTemperatureOrderEvent(String eventId, Areas area, double temperature) {
		super(eventId, area);
		// TODO Auto-generated constructor stub
		this.temperature = temperature;
	}
	
	public double getTemperature() {
		return temperature;
	}
	
	@Override
    public String toString() {
        return "AreaTemperatureOrderEvent [eventId=" + getEventId() + ", area=" + getArea() + ", temperature=" + temperature + "Cº]";
    }

}
