
public class Alkalmazott {
	private String nev;
	private long fizetes;
	

	public String getNev() {
		return nev;
	}

	public void setNev(String nevparameter) {
		nev = nevparameter;
	}

	public long getFizetes() {
		return fizetes;
	}

	public void setFizetes(long fizetesparameter) {
		fizetes = fizetesparameter;
	}

	public void fizetnov(long ertek) {
		fizetes += ertek;
	}
	
	public String toString() {
		return "Alkalmazott neve: " + nev + ", fizetese: " + fizetes + "Ft";
	}

	public boolean fizetesintervallkoztvane(long alsohat, long felsohat) {
		return fizetes >= alsohat &&
				fizetes <= felsohat;
	}
	
	public long fizetendoAdo() {
		return (long) (fizetes * 0.16);
	}
	
	public boolean nagyobbfizetesuMint(Alkalmazott masik) {
		return fizetes > masik.fizetes;
	}
	
	
}
