package TDDPart1Classes;


public class Dollar extends Money{
	public Dollar() {
		// TODO Auto-generated constructor stub
	}
	
	public Dollar(int amount) {
		 this.amount= amount;
	}

	Money times(int multiplier) {
		 return new Dollar(amount * multiplier);
		}

	/*public boolean equals(Object object) {
		 Dollar dollar= (Dollar) object;
		 return amount == dollar.amount;
		}*/
	

}
