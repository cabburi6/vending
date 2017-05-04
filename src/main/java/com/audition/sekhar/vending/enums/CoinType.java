package com.audition.sekhar.vending.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sekhar.Abburi
 *
 */
public enum CoinType {
	
	 UNKNOWN(0.0,0.0,0.0),
	 PENNY(1.0,1.0,1.0),
     NICKEL(5.0,5.0,5.0),
     DIME(10.0,10.0,10.0),
     QUARTER(25.0,25.0,25.0);

     private Double coinValue;
     private Double coinSize;
     private Double coinWeight;

     public Double value() {
    	 return coinValue;
     }
     public Double weight() {
    	 return coinWeight;
     }
      public Double size() {
    	 return coinSize;
     }
      CoinType(final Double weight, final Double size, final Double value){
    	 coinWeight = weight;
    	 coinSize = size;
    	 coinValue = value;
     }
     
     private static List<CoinType> validCoinTypes = new ArrayList<CoinType>();
     
     static{
    	 validCoinTypes.add(NICKEL);
    	 validCoinTypes.add(DIME);
    	 validCoinTypes.add(QUARTER);
     }
     
     public static List<CoinType> getValidCoinTypes(){
    	 return validCoinTypes;
     }
     
}