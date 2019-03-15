package com.sinesection.swatBreach.eventStream;

import com.sinesection.swatBreach.eventStream.event.Event;

public interface EventStreamSubscriber {
	public void handleEventFired(Event e);
}
