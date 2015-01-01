package TDDPart1Classes;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import TDDPart1Classes.Dollar;

public class Run {

	public static void main(String[] args) {
		System.out.println("Hello World");
		//Dollar five = new Dollar(5);
		//five.times(2);
		//System.out.println("amount :" + five.amount);
		System.out.println(Money.franc(1).currency());

	}

	/*public void testMultiplication() {
		 Dollar five= new Dollar(5);
		 Dollar product= five.times(2);
		 assertEquals(10, product.amount);
		 product= five.times(3);
		 assertEquals(15, product.amount);
		}*/


	/* public void testEquality() {
		 assertTrue(new Dollar(5).equals(new Dollar(5)));
		 assertFalse(new Dollar(5).equals(new Dollar(6)));
		}*/

	/*public void testMultiplicationChapter4() {
		 Dollar five= new Dollar(5);
		 assertEquals(new Dollar(10), five.times(2));
		 assertEquals(new Dollar(15), five.times(3));
		}*/

	/*
	  public void testFrancMultiplication() {
		 Franc five= new Franc(5);
		 assertEquals(new Franc(10), five.times(2));
		 assertEquals(new Franc(15), five.times(3));
		}

	   public void testEqualityChapter6() {
		 assertTrue(new Dollar(5).equals(new Dollar(5)));
		 assertFalse(new Dollar(5).equals(new Dollar(6)));
		 assertTrue(new Franc(5).equals(new Franc(5)));
		 assertFalse(new Franc(5).equals(new Franc(6)));
		}*/
	/*
	   @Test public void testEquality() {
		  assertTrue(new Dollar(5).equals(new Dollar(5)));
		  assertFalse(new Dollar(5).equals(new Dollar(6)));
		  assertTrue(new Franc(5).equals(new Franc(5)));
		  assertFalse(new Franc(5).equals(new Franc(6)));
		  assertFalse(new Franc(5).equals(new Dollar(5)));
		 }*/
	/*@Test public void testMultiplication() {
		 Money five = Money.dollar(5);
		 assertEquals(Money.dollar(10), five.times(2));
		 assertEquals(Money.dollar(15), five.times(3));
		}

	@Test public void testEquality() {
		 assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		 assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		 assertTrue(Money.franc(5).equals(Money.franc(5)));
		 assertFalse(Money.franc(5).equals(Money.franc(6)));
		 assertFalse(Money.franc(5).equals(Money.dollar(5)));
		}

	@Test public void testFrancMultiplication() {
		 Money five = Money.franc(5);
		 assertEquals(Money.franc(10), five.times(2));
		 assertEquals(Money.franc(15), five.times(3));
		}*/
	/* public void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}*/

	/*@Test public void testDifferentClassEquality() {
		 assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
		}
	
	@Test public void testEquality() {
		 assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		 assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		 //assertTrue(Money.franc(5).equals(Money.franc(5)));
		 //assertFalse(Money.franc(5).equals(Money.franc(6)));
		 assertFalse(Money.franc(5).equals(Money.dollar(5)));
		}*/
	
	@Test public void testSimpleAddition() {
		Money five= Money.dollar(5);
		Expression sum= five.plus(five);
		Bank bank= new Bank();
		Money reduced= bank.reduce(sum, "USD");
		assertEquals(Money.dollar(10), reduced);
		}

	

}
