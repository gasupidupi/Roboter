package ch.modul226.robotersimulation.model;

import ch.modul226.robotersimulation.model.strategy.Strategie;

public class Roboter extends Item{
	private String richtung;
	private Strategie strategie;
	
	
	public Roboter() {
		super();
		richtung = "n";
	}
	
	public void moveUp() {
		pos.setY(pos.getY()+1);
		richtung = "n";
	}
	
	public void moveDown() {
		pos.setY(pos.getY()-1);
		richtung = "s";
	}
	
	public void moveLeft() {
		pos.setY(pos.getX()-1);
		richtung = "w";
	}
	
	public void moveRight() {
		pos.setY(pos.getX()+1);
		richtung = "e";
	}
	
	public void setDirection(String d) {
		richtung = d;
	}
	
	public String getDirection() {
		return richtung;
	}
	
	public void nextMove(Spielfeld s) {
		
	}
	
	public void setStrategie(Strategie s) {
		this.strategie = s;
	}
	
}
