package sajat;

import java.util.*;

public class Probal {

	
	public static void main(String[] args) {
		int elemekSzama = 5;
		int[] egeszTomb = new int[elemekSzama];
		Scanner beolvasas = new Scanner(System.in);
		
		for (int i = 0; i < egeszTomb.length; i++) {
			boolean rosszAdat = true;
			do {
				System.out.println("Kerem adja meg a(z)" + (i + 1)
						+ ". egesz szamot!");
				System.out.println("szam: ");
				try {
					egeszTomb[i] = beolvasas.nextInt();
				rosszAdat = false;
				} catch (InputMismatchException e) {
					System.out.println("Rossz input");
				}
				finally {
					beolvasas.nextLine();
				}
			}while (rosszAdat);

			
			
			
		}
		
		System.out.println("A tomb elemei: ");
		for (int i : egeszTomb){
			System.out.println(i);
		}
		
		beolvasas.close();
	}

}
