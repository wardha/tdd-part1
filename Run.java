package TDDPart1Classes;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import TDDPart1Classes.Dollar;

public class Run {
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		Dollar five = new Dollar(5);
		five.times(2);
		//System.out.println("amount :" + five.amount);
		
	}
	
	/*public void testMultiplication() {
		 Dollar five= new Dollar(5);
		 Dollar product= five.times(2);
		 assertEquals(10, product.amount);
		 product= five.times(3);
		 assertEquals(15, product.amount);
		}*/

	
	 public void testEquality() {
		 assertTrue(new Dollar(5).equals(new Dollar(5)));
		 assertFalse(new Dollar(5).equals(new Dollar(6)));
		}
	
	public void testMultiplicationChapter4() {
		 Dollar five= new Dollar(5);
		 assertEquals(new Dollar(10), five.times(2));
		 assertEquals(new Dollar(15), five.times(3));
		}

	
	@Test public void testFrancMultiplication() {
		 Franc five= new Franc(5);
		 assertEquals(new Franc(10), five.times(2));
		 assertEquals(new Franc(15), five.times(3));
		}


}
