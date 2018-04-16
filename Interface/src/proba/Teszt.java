package proba;

import java.awt.Color;

import masik.Szinespont;

import szinezheto.ISzinezheto;

public class Teszt {

	
	public static void main(String[] args) {
		ISzinezheto szinespont = new Szinespont(Color.BLUE);
		
		Szinespont szinespont2 = new Szinespont(Color.BLUE);
		
		szinespont.setSzin(Color.GREEN);
	}

}
