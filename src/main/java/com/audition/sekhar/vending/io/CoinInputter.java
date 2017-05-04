package com.audition.sekhar.vending.io;

import java.util.ArrayList;
import java.util.List;

import com.audition.sekhar.vending.exception.InvalidCoinException;
import com.audition.sekhar.vending.external.CoinDetector;
import com.audition.sekhar.vending.model.Coin;
import com.audition.sekhar.vending.validator.CoinValidator;

/**
 * @author Sekhar.Abburi
 *
 */
public class CoinInputter {
	
	private Double currentAmount = new Double(0.0);
	private List<Coin> coins = new ArrayList<Coin>();
	private CoinValidator coinValidator;
	private CoinDetector coinDetector;
	
	public CoinInputter(final CoinValidator coinValidator, final CoinDetector coinDetector){
		this.coinValidator = coinValidator;
		this.coinDetector = coinDetector;
	}
	
	public void accept(final Coin coin) throws InvalidCoinException{
		if(coinValidator.validate(coin)){
			coins.add(coin);
			currentAmount += coinDetector.getCoinValue(coin);
		}else{
			throw new InvalidCoinException();
		}
	}
	
	public Double getAmount(){
		return currentAmount;
	}
	
	public void eject(){
		
	}
	
	public void eject(final Double amout){
		
	}

}
