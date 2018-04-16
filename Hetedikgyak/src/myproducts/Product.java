package myproducts;

public class Product {

	private String Name;
	private int NettoPrice, TaxKey;
	
	
	public Product(String name, int nettoPrice) {
		super();
		Name = name;
		NettoPrice = nettoPrice;
	}

	public int Brutto() {
		return (int) (Math.round(NettoPrice * (1 + TaxKey / 100.0)));
	}

	@Override
	public String toString() {
		return "Product [Name=" + Name + ", BruttoPrice=" + Brutto() + "]";
	}
	
	public void NettoPriceIncrease(int percent){
		
		NettoPrice = (int) (NettoPrice * (1+percent/100.0));
		
	}
	
	public int MoreExpensive (Product OtherProduct){
		
		if (Brutto() > OtherProduct.Brutto()){
			return 1;
		}
		
		else if (Brutto() < OtherProduct.Brutto()){
			return -1;
		}
		else{
			return 0;
		}
	}

	
}
