
public class Teglalaptomb {

	public static void main(String[] args) {
		Rektangle teglalaptomb[] = new Rektangle[10];
		
		for (int i = 0; i < teglalaptomb.length; i++) {
			teglalaptomb[i] = new Rektangle((int) (Math.random() * 9) + 2, (int) (Math.random() * 9) + 2);
			System.out.println(teglalaptomb[i]);
		}
		int min_teruletu_teglalap_indexe = 0;
		
		for (int i = 0; i < teglalaptomb.length; i++) {
			if (teglalaptomb[min_teruletu_teglalap_indexe].teruletNagyobbMint(teglalaptomb[i])) {
				min_teruletu_teglalap_indexe = i;
			}
		}
	}

}
