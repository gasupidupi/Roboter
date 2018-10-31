package ch.modul226.robotersimulation.model;

import java.util.ArrayList;

public class Spielfeld {
	private Integer breite;
	private Integer hoehe;
	private ArrayList<Item> itemListe;
	
	
	public Spielfeld(Integer b, Integer h) {
		breite = b;
		hoehe = h;
		itemListe = new ArrayList<Item>();
	}


	public Integer getBreite() {
		return breite;
	}


	public void setBreite(Integer breite) {
		this.breite = breite;
	}
	
	private void addItem(Item i) {
		itemListe.add(i);
	}
	
	public ArrayList<Item> getItemListe(){
		return itemListe;
	}
	
	private void update() {
		
	}
}
