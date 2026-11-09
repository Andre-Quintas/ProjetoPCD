package iscot.events;

import iscot.enums.Areas;

public class HumiditySensorEvent extends SensorEvent {

	private final double humidity;
	
	public HumiditySensorEvent(String eventId, Areas area, double humidity) {
		super(eventId, area);
		// TODO Auto-generated constructor stub
		this.humidity = humidity;
	}

	
	public double getHumidity() {
		return humidity;
	}
	
	@Override
    public String toString() {
        return "HumiditySensorEvent [area=" + getArea() + ", humidity=" + humidity + "%]";
    }
}
