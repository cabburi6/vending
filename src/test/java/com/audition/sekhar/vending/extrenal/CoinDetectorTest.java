package com.audition.sekhar.vending.extrenal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.audition.sekhar.vending.enums.CoinType;
import com.audition.sekhar.vending.external.CoinDetector;
import com.audition.sekhar.vending.model.Coin;


/**
 * @author Sekhar.Abburi
 *
 */
public class CoinDetectorTest {
	
	private CoinDetector coinDetector;
	
	@Before
	public void setUp(){
		coinDetector = new CoinDetector();
	}
	
	@Test
	public void shouldDetectNickel(){
		final Coin coin = new Coin(5.0,5.0);
		assertEquals(CoinType.NICKEL, coinDetector.detect(coin));
	}
	
	@Test
	public void shouldDetectDime(){
		final Coin coin = new Coin(10.0,10.0);
		assertEquals(CoinType.DIME, coinDetector.detect(coin));
	}
	
	@Test
	public void shouldDetectQuarter(){
		final Coin coin = new Coin(25.0,25.0);
		assertEquals(CoinType.QUARTER, coinDetector.detect(coin));
	}
	
	@Test
	public void shouldDetectPenny(){
		final Coin coin = new Coin(1.0,1.0);
		assertEquals(CoinType.PENNY, coinDetector.detect(coin));
	}
	
}
