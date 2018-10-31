package ch.modul226.robotersimulation.model;

import ch.modul226.position.Position;

public class Item {
	Position pos;
	String name;
	Integer punkte;
	
	public Item() {
		pos = new Position(0, 0);
		punkte = 0;
	}
	

	public Position getPosition() {
		return pos;
	}

	public void setPosition(Integer x, Integer y) {
		pos.setSize(x, y);
	}
	
	public Integer getPositionX() {
		return pos.getX();
		
	}
	
	public Integer getPositionY() {
		return pos.getY();
		
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPunkte(Integer p) {
		punkte = p;
	}
	
	public Integer getPunkte() {
		return punkte;
	}
}
