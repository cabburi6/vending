package com.audition.sekhar.vending.validator;

import com.audition.sekhar.vending.enums.CoinType;
import com.audition.sekhar.vending.model.Coin;

public class CoinValidator {
	
	
	public Boolean validate(final Coin coin){
		
		return CoinType.getValidCoinTypes().contains(coin.getCoinType());
	}

}
