import java.util.Scanner;


public class harmadik {
	public static void main(String[] args) {
		
		System.out.println("Kerem az elso konstanst: ");
		Scanner first = new Scanner(System.in);
		int a = first.nextInt();
		
		System.out.println("A masodikat: ");
		Scanner sec = new Scanner(System.in);
		int b = sec.nextInt();
		
		System.out.println("A harmadikat: ");
		Scanner third = new Scanner(System.in);
		int c = third.nextInt();
		
				
		double Diszk = Math.sqrt(b * b - 4 * a * c);
		
		if (Diszk>0)
			{
				double x1 = (-b + Diszk) / 2 * a;
				double x2 = (-b - Diszk) / 2 * a;
				System.out.println("A/az " + a + "x^2 + " + b + "x " + c + " = 0 gyokei: " + x1 + " es " + x2);
			}
		else if (Diszk == 0)
			{
				double x1 = (-b + Diszk) / 2 * a;
				System.out.println("A/az " + a + "x^2 + " + b + "x " + c + " = 0 gyoke: " + x1);
			}
		else
		{
			System.out.println("Az egyenletnek nincs valos gyoke!");
		}
		
		//input.close();
	}

}
