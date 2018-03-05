
public class Alkhaszn {
	public static void main(String[] args){
		Alkalmazott alkalmazott = new Alkalmazott();
		
		alkalmazott.setNev("Jonas Janos Dzsonatan");
		alkalmazott.setFizetes(20);
		
		System.out.println(alkalmazott.getNev());
		System.out.println(alkalmazott.getFizetes());
		
		//System.out.println(alkalmazott.toString());
		
		alkalmazott.fizetnov(5);
		System.out.println(alkalmazott);
		
		System.out.println(alkalmazott.fizetesintervallkoztvane(10, 40));
		
		System.out.println(alkalmazott.fizetendoAdo());
		
		Alkalmazott alkalmazott2 = new Alkalmazott();
		alkalmazott2.setNev("Dumbo Dzsesszika");
		alkalmazott2.setFizetes(50);
		
		System.out.println(alkalmazott.nagyobbfizetesuMint(alkalmazott2));
		
		Alkalmazott[] alkalmazottak = new Alkalmazott[5];
		
		for (int i = 0; i < alkalmazottak.length; i++) {
			alkalmazottak[i] = new Alkalmazott();
			alkalmazottak[i].setNev("A");
			alkalmazottak[i].setFizetes((long) Math.random() * 50);
			System.out.println(alkalmazottak[i]);
		}
	}

}
