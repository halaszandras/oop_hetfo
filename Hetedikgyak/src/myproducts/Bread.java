package myproducts;

public class Bread extends Product{

	private double Amount;
	
	public Bread(String Name, int Price, int TaxKey, double Amount){
		
		super(Name, Price, TaxKey);
		this.Amount = Amount;
	}

	
	
}
