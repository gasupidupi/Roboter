package ch.modul226.robotersimulation;

import ch.modul226.robotersimulation.model.Spielfeld;
import ch.modul226.robotersimulation.view.Ausgabe;
import ch.modul226.utils.ConsoleReader;

public class RoboterSimulation {

	static Integer feldBreite = 16;
	static Integer feldHoehe = 8;
	static Integer anzahlRoboterTotal = 2;
	static Integer anzahlRoboterFreundlich = 1;
	static Integer anzahlSteine = 5; 
	static Spielfeld spielfeld; 
	static Ausgabe ausgabe;
	static Integer anzahlGegner;
	static String richtung;
	

	private Boolean spielBeendet() {
		return true;
	}

	public static void main(String[] args) {
		
		

		spielfeld = new Spielfeld(feldBreite, feldHoehe);
		ausgabe = new Ausgabe(feldBreite, feldHoehe);
		ausgabe.setSpielfeld(spielfeld);
		ausgabe.displayWelcome();
		ausgabe.displayPlayerQuestion();

		{
			// Zeichne Feld
			
			// Frage Spieler nach Bewegungsrichtung

			ausgabe.askPlayer();
			ausgabe.askDirection();
			ausgabe.displayScore();
			// Bewege Roboter des Spielers entsprechend
			// Bewege andere Roboter
		}
	}

}
