package TDDPart1Classes;

public class Franc extends Money {
	//private String currency;
	

	/*String currency() {
		 return currency;
	}*/

	Franc(int amount, String currency) {
		 super(amount, currency);
	}
	Money times(int multiplier) {
		return Money.franc(amount * multiplier);
	}

	/*public boolean equals(Object object) {
		 Franc franc= (Franc) object;
		 return amount == franc.amount;
		 }*/


}
