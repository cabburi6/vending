package com.audition.sekhar.vending.model;

import com.audition.sekhar.vending.enums.CoinType;


/**
 * @author Sekhar.Abburi
 *
 */
public class Coin {

	double weight;
	double size;

	public Coin(double weight, double size) {
		this.weight = weight;
		this.size = size;

	}

	public double getWeight() {
		return weight;
	}

	public double getSize() {

		return size;
	}

	public CoinType getCoinType() {
		if(CoinType.DIME.weight() == getWeight() && CoinType.DIME.size() == getSize())
			return CoinType.DIME;
			
		if(CoinType.NICKEL.weight() == getWeight() && CoinType.NICKEL.size() == getSize())
				return CoinType.NICKEL;
			
		if(CoinType.PENNY.weight() == getWeight() && CoinType.PENNY.size() == getSize())
				return CoinType.PENNY;
			
		if(CoinType.QUARTER.weight() == getWeight() && CoinType.QUARTER.size() == getSize())
				return CoinType.QUARTER;
			
			return CoinType.UNKNOWN;
	}

}
