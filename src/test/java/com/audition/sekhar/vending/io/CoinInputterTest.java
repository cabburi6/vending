package com.audition.sekhar.vending.io;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import com.audition.sekhar.vending.validator.CoinValidator;
import com.audition.sekhar.vending.exception.InvalidCoinException;
import com.audition.sekhar.vending.external.CoinDetector;
import com.audition.sekhar.vending.model.Coin;

public class CoinInputterTest {

	private CoinInputter coinInputter;
	
	private CoinValidator coinValidator;
	
	private CoinDetector coinDetector;
	
	@Before
	public void setUp(){
		coinValidator = new CoinValidator();
		coinDetector = new CoinDetector();
		coinInputter = new CoinInputter(coinValidator, coinDetector);
	}
	
	@Test
	public void shouldAcceptDime() throws InvalidCoinException{
		final Coin coin = new Coin(10.0,10.0);
		coinInputter.accept(coin);
	}
	
	@Test
	public void shouldAcceptNickel() throws InvalidCoinException{
		final Coin coin = new Coin(5.0,5.0);
		coinInputter.accept(coin);
	}
	
	@Test
	public void shouldAcceptQuarter() throws InvalidCoinException{
		final Coin coin = new Coin(25.0,25.0);
		coinInputter.accept(coin);
	}
	
	@Test(expected = InvalidCoinException.class)
	public void shouldNotAcceptPenny() throws InvalidCoinException{
		final Coin coin = new Coin(1.0,1.0);
		coinInputter.accept(coin);
	}
	
	@Test
	public void shouldIcreamentBalance() throws InvalidCoinException{
		coinInputter.accept(new Coin(5.0,5.0));
		coinInputter.accept(new Coin(10.0,10.0));
		coinInputter.accept(new Coin(25.0,25.0));
		assertEquals(new Double(40.0), coinInputter.getAmount());
	}
}
