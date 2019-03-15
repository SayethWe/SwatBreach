package com.sinesection.swatBreach.eventStream;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.sinesection.swatBreach.eventStream.event.Event;
import com.sinesection.swatBreach.eventStream.event.EventType;

public class EventStreamHandler {
	private final Map<Class<? extends EventType>,Set<EventStreamSubscriber>> subs;
	
	public EventStreamHandler() {
		subs = new HashMap<>();
	}
	
	/**
	 * 
	 * @param sub
	 * @param type
	 * @return <code>true</code> if subscribe was successful, <code>false</code> if that subscriber was already
	 * subscribed to that type
	 */
	public boolean subscribeListener(EventStreamSubscriber sub, Class<? extends EventType> type) {
		subs.putIfAbsent(type, new HashSet<>());
		return subs.get(type).add(sub);
	}
	
	public boolean eventFired(Event e) {
		return false;
	}
	
}
