package com.audition.sekhar.vending.validator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.audition.sekhar.vending.model.Coin;

public class CoinValidatorTest {
	
	private CoinValidator coinValidator;
	
	@Before
	public void setUp(){
		coinValidator = new CoinValidator();
	}
	
	@Test
	public void shouldValidateNickel(){
		final Coin coin = new Coin(5.0,5.0);
		assertTrue(coinValidator.validate(coin));
	}
	
	@Test
	public void shouldValidateDime(){
		final Coin coin = new Coin(10.0,10.0);
		assertTrue(coinValidator.validate(coin));
	}
	
	@Test
	public void shouldValidateQuarter(){
		final Coin coin = new Coin(25.0,25.0);
		assertTrue(coinValidator.validate(coin));
	}
	
	@Test
	public void shouldNotValidatePenny(){
		final Coin coin = new Coin(1.0,1.0);
		assertFalse(coinValidator.validate(coin));
	}

}
