/*
 *  @version 2018/12/05
 *  @author Herng-Shyue Chen
 */
package shop;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ProductTest {

	public ArrayList<Product> item = new ArrayList<>();
	
	public static final double TOLERANCE = 0.00001;

	private Product Buy1, Buy2, Buy3, Buy4, Buy5, Buy6, Buy7;
	private MultiBuyProduct BuyM1, BuyM2;
	

	@Before
	public void setUp() {
		Buy1 = new Product("Milk (1l)", 1.12, 2);
		Buy2 = new Product("Bread", 0.78, 2);
		Buy3 = new Product("Apples", 0.49, 4);
		Buy4 = new Product("Milk (1pt)", 0.79, 9);
		BuyM1 = new MultiBuyProduct("Tomato", 0.5, 20, 10, 3);
		BuyM2 = new MultiBuyProduct("Tomato", 0.5, 5, 10, 3);
		Buy5 = new Product("Tomato", 0.53, 5);
		Buy6 = new Product("Milk (1pt)", 0.79, 4);
		Buy7 = new Product("Milk (1l)", 1.12, 8);
	}
	
	/*
	 * Check buying normal item can be work
	 */
	
	@Test
	public void testa() {
		ShoppingCart Kenny = new ShoppingCart(item);
		Kenny.add(Buy1);
		Kenny.add(Buy2);
		Kenny.add(Buy3);
		
		double expectedCost = 5.76;
		double actualCost = Kenny.getTotalpayment();
		assertEquals(expectedCost, actualCost, TOLERANCE);
	}
	
	/*
	 * Check buying same item can be work and renew the item's quantity 
	 */
	
	@Test
	public void testa1() {
		ShoppingCart Kenny = new ShoppingCart(item);
		Kenny.add(Buy1);
		Kenny.add(Buy7);
		
		double expectedCost = 11.2;
		double actualCost = Kenny.getTotalpayment();
		assertEquals(expectedCost, actualCost, TOLERANCE);
		
		int expectedQuantity = 10; 
		int actualQuantity = item.get(0).getQuantity();
		assertEquals(expectedQuantity, actualQuantity, TOLERANCE);
		
		/*
		 * Check after buying same item and buy new different item can be work
		 */
		
		Kenny.add(Buy3);
		int expectedQuantity2 = 4; 
		int actualQuantity2 = item.get(1).getQuantity();
		assertEquals(expectedQuantity2, actualQuantity2, TOLERANCE);
	}
	
	/*
	 * Check buying normal items and discount item can be work
	 */
	
	@Test
	public void testb() {
		ShoppingCart Kenny = new ShoppingCart(item);
		Kenny.add(Buy4);
		Kenny.add(BuyM1);
		Kenny.add(Buy5);
		Kenny.add(Buy6);
		
		double expectedCost = 22.62;
		double actualCost = Kenny.getTotalpayment();
		assertEquals(expectedCost, actualCost, TOLERANCE);
	}
	
	/*
	 * check no discount due to no buy enough quantities when buying discount item
	 */
	
	@Test
	public void testb1() {
		ShoppingCart Kenny = new ShoppingCart(item);
		Kenny.add(BuyM2);
		
		double expectedCost = 2.5;
		double actualCost = Kenny.getTotalpayment();
		assertEquals(expectedCost, actualCost, TOLERANCE);
		
		//assertThat(0, is(not(1)));
	}

}
