package iscot.events;

import iscot.enums.Areas;

public class LightSensorEvent extends SensorEvent {

	private final double light;
	
	public LightSensorEvent(String eventId, Areas area, double light) {
		super(eventId, area);
		// TODO Auto-generated constructor stub
		this.light = light;
	}
	
	public double getLight() {
		return light;
	}
	
	@Override
    public String toString() {
        return "LightSensorEvent [area=" + getArea() + ", light=" + light + "%]";
    }

}
