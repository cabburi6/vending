package com.audition.sekhar.vending.external;

import com.audition.sekhar.vending.enums.CoinType;
import com.audition.sekhar.vending.model.Coin;


public class CoinDetector {
	
	
	public CoinType detect(final Coin coin){
		
		return coin.getCoinType();
		
	}
	
	public Double getCoinValue(final Coin coin){
		return detect(coin).value();
	}

}
