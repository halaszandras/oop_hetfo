package sajat;

public class Henger extends Hasab {

	private double sugar;
	
	
	@Override
	public double getAlapterulet() {
		// TODO Auto-generated method stub
		return sugar * sugar * Math.PI;
	}


	public Henger(double magassag, double sugar) {
		super(magassag);
		this.sugar = sugar;
	}


	@Override
	public String toString() {
		return "Henger [sugar=" + sugar + ", getAlapterulet()="
				+ getAlapterulet() + ", getMagassag()=" + getMagassag()
				+ ", getTerfogat()=" + getTerfogat() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}



}
