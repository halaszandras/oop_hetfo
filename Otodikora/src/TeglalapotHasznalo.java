
public class TeglalapotHasznalo {
		public static void main(String[] args){
			Rektangle a_objektum = new Rektangle(2);
			Rektangle b_objektum = new Rektangle(3, 4);
			
			Rektangle c_objektum;
			c_objektum = a_objektum;
			
			System.out.println(a_objektum);
			System.out.println(b_objektum);
			System.out.println(c_objektum);
			
			a_objektum.setOldalak(5);
			
			System.out.println(a_objektum);
			System.out.println(b_objektum);
			System.out.println(c_objektum);
			
			a_objektum.setOldalak(3, 4);
			
			System.out.println(a_objektum);
			System.out.println(b_objektum);
			System.out.println(c_objektum);
			
			System.out.println(a_objektum == b_objektum);
			System.out.println(a_objektum == c_objektum);
			System.out.println(a_objektum.egyezikE(b_objektum));
		}

}
