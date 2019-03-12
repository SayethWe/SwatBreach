package com.sinesection.swatBreach.tile;

import com.sinesection.swatBreach.entity.Entity;

public abstract class Tile {
	private final char render;
	private Entity occupant;
	
	public Tile(char c) {
		this.render=c;
	}
	
	public char getRender() {
		return render;
	}
	
	public boolean isOccupied() {
		return occupant!=null;
	}
	
	public Entity getOccupant() {
		return occupant;
	}
	
	public void setOccupant(Entity occupant) {
		this.occupant = occupant;
	}
}
