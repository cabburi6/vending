package com.audition.sekhar.vending.inventory;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.audition.sekhar.vending.inventory.ProductInventoryManager;
import com.audition.sekhar.vending.exception.ProductOutOfStockException;
import com.audition.sekhar.vending.model.Product;
public class ProductInventoryManagerTest {
	
	private ProductInventoryManager productInventoryManager;
	
	@Before
	public void setUp(){
		productInventoryManager = new ProductInventoryManager();
	}
	
	@Test
	public void shouldLoadProduct() throws ProductOutOfStockException{
		final List<Product> products = new ArrayList<Product>();
		final Product product = new Product();
		product.setCode(1);
		product.setName("Cola");
		product.setPrice(1.0);
		for(int i=0; i<5; i++){
			products.add(product);
		}
		productInventoryManager.load(products);
		assertEquals(5, productInventoryManager.getStockCount(1).intValue());
	}
	

}
