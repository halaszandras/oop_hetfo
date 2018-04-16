
public class Rektangle {

		private int a_oldal;
		private int b_oldal;
		
		public Rektangle (int a_oldal, int b_oldal) {
			this.a_oldal = a_oldal;
			this.b_oldal = b_oldal;
		}
		
		public Rektangle (int oldalhossz) {
			this.a_oldal = oldalhossz;
			this.b_oldal = oldalhossz;
		}
		
		public int terulet(){
			return a_oldal * b_oldal;
		}
		
		public String toString() {
			return "Rektangle [a_oldal=" + a_oldal + ", b_oldal=" + b_oldal
					+ ", terulet=" + terulet() + "]";
		}
		
		public void setProp(int a_oldal, int b_oldal){
			this.a_oldal = a_oldal;
			this.b_oldal = b_oldal;
		}
		
		public void setOldalak(int a_oldal, int b_oldal){
			this.a_oldal = a_oldal;
			this.b_oldal = b_oldal;
		}
		
		public void setOldalak(int oldalhossz){
			this.a_oldal = oldalhossz;
			this.b_oldal = oldalhossz;
		}
		
		public boolean teruletNagyobbMint (Rektangle masikRektangle){
			return terulet () > masikRektangle.terulet();
		}
		
		public boolean egyezikE(Rektangle masikRektangle){
			return a_oldal == masikRektangle.a_oldal
					&& b_oldal == masikRektangle.b_oldal;
		}
}
