package TDDPart1Classes;


public class Dollar {
	public int amount ;
	public Dollar() {
		// TODO Auto-generated constructor stub
	}
	
	public Dollar(int amount) {
		 this.amount= amount;
	}

	Dollar times(int multiplier) {
		 return new Dollar(amount * multiplier);
		}

	
}
