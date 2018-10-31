package ch.modul226.position;

import java.util.ArrayList;

public class Position {

	private Integer x;
	private Integer y;
	private String steinIcon = "o";
	private String roboterIconUp = "^";
	private String roboterIconDown = "V";
	private String roboterIconLeft = "<";
	private String roboterIconRight = ">";
	private String leerIcon = "_";
	private String randIcon = "#";
	private String feld[][];
	
	public Position(Integer breite, Integer hoehe) {
		this.x = breite;
		this.y = hoehe;
		feld = new String[hoehe][breite];
	}
	


	public Integer getX() {
		return x;
	}



	public void setX(Integer x) {
		this.x = x;
	}



	public Integer getY() {
		return y;
	}



	public void setY(Integer y) {
		this.y = y;
	}



	public void display() {
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

	public void setSize(Integer hoehe, Integer breite) {
		feld = new String[hoehe][breite];
	}

	public void addObject(Integer posX, Integer posY, String richtung) {
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

	public void addObject(Integer posX, Integer posY) {
		feld[posY][posX] = steinIcon;
	}
}