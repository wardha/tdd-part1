package TDDPart1Classes;


public class Dollar {
	public int amount ;
	public Dollar() {
		// TODO Auto-generated constructor stub
	}
	
	public Dollar(int amount) {
		 this.amount= amount;
	}

	void times(int multiplier) {
		 amount *= multiplier;
		}
	
}
