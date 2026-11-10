package iscot.events;

import java.sql.Time;

import iscot.enums.Type;
import iscot.enums.Areas;

public abstract class SensorEvent extends Event{

	public SensorEvent(String eventId, Areas area) {
		super(eventId, area, Type.SENSOR);
	}

}
