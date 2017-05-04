package com.audition.sekhar.vending.code;

import com.audition.sekhar.vending.extrenal.CoinDetectorTest;
import com.audition.sekhar.vending.inventory.ProductInventoryManagerTest;
import com.audition.sekhar.vending.io.ChangeMakerTest;
import com.audition.sekhar.vending.io.CoinInputterTest;
import com.audition.sekhar.vending.io.CoinOutputterTest;
import com.audition.sekhar.vending.io.DispalyUnitTest;
import com.audition.sekhar.vending.validator.CoinValidatorTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	CoinDetectorTest.class,
	ProductInventoryManagerTest.class,
    CoinInputterTest.class,
    ChangeMakerTest.class,
    CoinOutputterTest.class,
    DispalyUnitTest.class,
    CoinValidatorTest.class,
})
public class AllTests {

}
