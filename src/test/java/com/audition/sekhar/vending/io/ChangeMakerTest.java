package com.audition.sekhar.vending.io;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.audition.sekhar.vending.enums.CoinType;
import com.audition.sekhar.vending.model.Coin;

public class ChangeMakerTest {

	private ChangeMaker changeMaker;
	private Coin coin;
	private double purchase;
    private double payment;
	
	@Before
	public void setup(){
		changeMaker = new ChangeMaker(1,1,1);
		coin = new Coin(25.0, 25.0);
	    purchase = 0;
	    payment = 0;
	}
	@Test
	public void shouldRecordPurchase(){
		
		double record = changeMaker.recordPurchase(100.0);
		double newTotal = purchase + record;
		Assert.assertTrue("Not equals", newTotal -  100.0 == 0);
	}
	@Test
	public void shouldNotRecordPurchase(){
		double record = changeMaker.recordPurchase(200.0);
		double newTotal = purchase + record;
		Assert.assertFalse("Not equals", newTotal -  150.0 == 0);
	}
	@Test
	public void shouldEnterPaymentGivenValidCoins(){
	    payment = changeMaker.enterPayment(4, coin);
		double value = payment + (4 * CoinType.QUARTER.value());
		Assert.assertTrue("Not equals",payment - 100.0 == 0);
	}
	@Test
	public void shouldGiveChangeGivenPaymentExceedsPurchase(){
		purchase = changeMaker.recordPurchase(75.0);
		payment = changeMaker.enterPayment(4, coin);
		double change = changeMaker.giveChange();
		assertEquals(change,25.0,0.0d);
		
	
	}
	
		
	
	
	


}

