package com.audition.sekhar.vending.io;

import com.audition.sekhar.vending.enums.CoinType;
import com.audition.sekhar.vending.model.Coin;

/**
 * @author Sekhar.Abburi
 *
 */
public class ChangeMaker {
	  private int numberOfQuarters;
	  private int numberOfDimes;
	  private int numberOfNickels;
	  private double purchase;
	  private double payment;
	  private double value1;
	  private double value2;
	  private double value3;
	  private CoinType coinType;
	 
	  public ChangeMaker() {
	        purchase = 0;
	        payment = 0;
	     }
	  public ChangeMaker(int quarters, int dimes, int nickels)
	     {
	           numberOfQuarters = quarters;
	           numberOfDimes = dimes;
	           numberOfNickels = nickels;
	      }

	  public double recordPurchase(double amount) 
	     {
	        double newTotal = purchase + amount;
	        purchase = newTotal; 
	        return purchase;
	     }
	 
	  public double enterPayment(int coinCount, Coin coin)
	    {
	
	         if(coin.getCoinType() == coinType.QUARTER)
	        {
	              numberOfQuarters = numberOfQuarters * coinCount;
	              payment = payment + (coinCount * coinType.QUARTER.value());
	              value1 = payment;//
	         }
	        if(coin.getCoinType() == CoinType.DIME)
	        {
	               numberOfDimes = numberOfDimes * coinCount;
	               payment = payment + (coinCount * coinType.DIME.value());
	               value2 = payment;
	          }
	          if(coin.getCoinType() == CoinType.NICKEL)
	        {
	             numberOfNickels = numberOfNickels * coinCount;
	             payment = payment + (coinCount * coinType.NICKEL.value());
	              value3 = payment;
	           }
	 
	         payment = value1 + value2 + value3;
	         return payment;
	    }
	
	     public double giveChange()
	    {
	         double change = payment - purchase;
	         purchase = 0;
	         payment = 0;
	         return change;
	     }
	
	 }
