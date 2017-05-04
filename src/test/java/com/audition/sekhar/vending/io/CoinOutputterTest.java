package com.audition.sekhar.vending.io;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.audition.sekhar.vending.io.CoinOutputter;
import com.audition.sekhar.vending.enums.CoinType;
import com.audition.sekhar.vending.model.Coin;

public class CoinOutputterTest {
	
	private CoinOutputter coinOutputter;
	
	@Before
	public void setUp(){
		coinOutputter = new CoinOutputter();
	}
	
	@Test
	public void shouldEjectCoins(){
		final List<Coin> coins = new ArrayList<Coin>();
		coins.add(new Coin(5.0,5.0));
		coins.add(new Coin(10.0,10.0));
		coins.add(new Coin(25.0,25.0));
		assertEquals(new Double(40.0), coinOutputter.eject(coins));
	}
	
	@Test
	public void shouldEjectCoin(){
		assertEquals(new Double(5.0), coinOutputter.eject(new Coin(5.0,5.0)));
	}

}
