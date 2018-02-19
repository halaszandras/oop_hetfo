
public class pirtek {
	public static void main(String[] args) {
	//wallis-formula
		
		double nevezo = 1, szaml = 2;
		double szam = 1;
		
		for (int i=1; i<=10000000; i++)
		{
			szam*= szaml/nevezo;
			nevezo+=2;
			
			szam*= szaml/nevezo;
			szaml+=2;
			
		}
		
		szam*=2;
		
		System.out.println("pi = " +szam);
		
	//Leibniz-sor
		
		szam = 0;
		int darab = 100000*4;
		int elojel = 1;
		
		for (int i = 1; i <= darab; i+= 2)
		{
			szam += elojel * 1.0 / i;
			elojel *= -1;
		}
		
		szam*=4;
		
		System.out.println("pi = " +szam);	
	
	//Fuckt
		
		int szam2 = 10;
		int Fucktor = 1;
		
		for (int i = 1; i <= szam2; i++) {
			Fucktor *= i;
			System.out.println(i + "!" + Fucktor);
		}
	}
	
}
