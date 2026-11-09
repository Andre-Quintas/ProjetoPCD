package iscot.events;

import iscot.enums.Areas;

public class HumiditySensorEvent extends SensorEvent {

	private final double light;
	
	public HumiditySensorEvent(String eventId, Areas area) {
		super(eventId, area);
		// TODO Auto-generated constructor stub
	}

	
	public double getLight() {
		return light;
	}
	
	@Override
    public String toString() {
        return "HumiditySensorEvent [area=" + getArea() + ", light=" + temperature + "ºC]";
    }
}
