package ch.modul226.robotersimulation.view;

import java.util.ArrayList;

import ch.modul226.robotersimulation.model.Spielfeld;
import ch.modul226.utils.ConsoleReader;

public class Ausgabe {

	private Integer sizeX;
	private Integer sizeY;
	private String steinIcon = "o";
	private String roboterIconUp = "^";
	private String roboterIconDown = "V";
	private String roboterIconLeft = "<";
	private String roboterIconRight = ">";
	private String leerIcon = "_";
	private String randIcon = "#";
	private String[][] feld;
	private Spielfeld spielfeld;

	public Ausgabe(Integer breite, Integer hoehe) {
		this.sizeX = breite;
		this.sizeY = hoehe;
		feld = new String[hoehe][breite];
	}
	
	public Integer getSizeX() {
		return sizeX;
	}
	
	public Integer getSizeY() {
		return sizeY;
	}

	public void displayMap() {
		for (int i = 0; i < feld.length; i++) {
			for (int j = 0; j < feld[i].length; j++) {
				if (feld[i][j] == null) {
					System.out.print(leerIcon);
				} else {
					System.out.print(feld[i][j]);
				}
				
			}
			System.out.print("\n");
		}
	}

	public void displayWelcome() {
		System.out.println("Willkommen zur Robotersimulation!");
	}
	
	public void displayPlayerQuestion() {
		System.out.println("Bitte wählen Sie die Anzahl Gegner!");
	}
	
	public Integer askPlayer() {
		Integer anzahlGegner;

		anzahlGegner = ConsoleReader.readInteger("Anzahl Gegner");
		return anzahlGegner;
	/*	anzahlRoboterTotal = anzahlGegner + anzahlRoboterFreundlich;
		System.out.println("Anzahl Gegner: " + anzahlGegner);*/
	}
	
	public String askDirection() {
		String richtung;
		richtung = ConsoleReader.readString("Richtung? (n,s,w,e)");
		System.out.println("Richtung: " + richtung);
		return richtung;
	}
	
	public void displayScore() {
		System.out.println("Hier wäre die Punkteliste");
	}
	
	public void setSize(Integer hoehe, Integer breite) {
		feld = new String[hoehe][breite];
	}

	private void addObject(Integer posX, Integer posY, String richtung) {
		if (richtung == "N") {
			feld[posY][posX] = roboterIconUp;
		} else if (richtung == "E") {
			feld[posY][posX] = roboterIconRight;
		} else if (richtung == "S") {
			feld[posY][posX] = roboterIconDown;
		} else if (richtung == "W") {
			feld[posY][posX] = roboterIconLeft;
		}
	}

	private void addObject(Integer posX, Integer posY) {
		feld[posY][posX] = steinIcon;
	}
	
	public void setSpielfeld(Spielfeld s) {
		this.spielfeld = s;
	}
}