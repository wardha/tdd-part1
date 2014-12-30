package TDDPart1Classes;

public class Franc extends Money {
		 Franc(int amount) {
		 this.amount= amount;
		 }
		 Franc times(int multiplier) {
		 return new Franc(amount * multiplier);
		 }
		 /*public boolean equals(Object object) {
		 Franc franc= (Franc) object;
		 return amount == franc.amount;
		 }*/
		 public boolean equals(Object object) {
			 Money money= (Money) object;
			 return amount == money.amount;
			}

}
