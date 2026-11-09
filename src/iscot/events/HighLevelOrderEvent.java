package iscot.events;

import iscot.enums.Areas;
import iscot.enums.Type;

public abstract class HighLevelOrderEvent extends Event{

	public HighLevelOrderEvent(String eventId, Areas area) {
		// TODO Auto-generated constructor stub
		super(eventId, area, Type.DECIDER);
	}

}
