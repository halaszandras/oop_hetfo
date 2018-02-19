
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
		
	}
	
}
