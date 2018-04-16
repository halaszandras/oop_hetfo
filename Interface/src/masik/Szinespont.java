package masik;

import java.awt.Color;

import szinezheto.ISzinezheto;

public class Szinespont extends Pont implements ISzinezheto {

	private Color szin;
	
	
	
	public Szinespont(int x, int y, Color szin) {
		super(x, y);
		this.szin = szin;
	}
	
	public Szinespont(Color szin){
		super(0, 0);
		this.szin = szin;
	}

	@Override
	public Color getSzin() {
		return szin;
	}

	@Override
	public void setSzin(Color szin) {
		this.szin = szin;
	}

	
	public static void main(String[] args) {

	}

	@Override
	public String toString() {
		return "Szinespont [szin=" + szin + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
