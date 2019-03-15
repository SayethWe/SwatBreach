package com.sinesection.swatBreach.eventStream.event;

public abstract class Event{
	private final Class<? extends EventType> type;
	
	public Event(EventType type) {
		this.type=type.getClass();
	}
	
	public Class<? extends EventType> getType() {
		return type;
	}
	
	@Override
	public abstract String toString();
}
