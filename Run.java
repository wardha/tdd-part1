package TDDPart1Classes;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import TDDPart1Classes.Dollar;

public class Run {
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		Dollar five = new Dollar(5);
		five.times(2);
		System.out.println("amount :" + five.amount);
		
	}
	
	@Test public void testMultiplication() {
		Dollar five = new Dollar(5);
		five.times(2);
		assertEquals(10, five.amount);
		}

}
