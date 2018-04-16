package sajat.elso;


public class Szam {
	
	private final static double tures  = 0.001;
	private double valosSzam;
	
	public Szam(double valosSzam) {
		super();
		this.valosSzam = valosSzam;
	}
	
	public boolean valosSzamturesenBelulVanE(
			double valosSzam) {
		return Math.abs(this.valosSzam - valosSzam)
				< tures;
	}

	public double getValosSzam() {
		return valosSzam;
	}

	public void setValosSzam(double valosSzam) {
		this.valosSzam = valosSzam;
	}

	
}
