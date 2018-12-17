/**
 *  Create a shopping cart and calculate the total price of buying 
 *  
 *  @version 2018/12/05
 *  @author Herng-Shyue Chen
 *  
 */
package shop;

import java.util.ArrayList;

public class MultiBuyProduct extends Product {
	public int minDiscountQuantity;
	public int discountPercent;
	
	/*
	 * Constructor 
	 */
	
	public MultiBuyProduct(String name, double price, int quantity, 
			int minDiscountQuantity, int discountPercent ) {
			super(name, price, quantity);
			this.minDiscountQuantity = minDiscountQuantity;
			this.discountPercent = discountPercent;	
	}
	
	/*
	 * Getter and Setter method 
	 */
	
	public int getMinDiscountQuantity() {
		return minDiscountQuantity;
	}

	public void setMinDiscountQuantity(int minDiscountQuantity) {
		this.minDiscountQuantity = minDiscountQuantity;
	}

	public int getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}
	
	/*
	 * Calculate the total price in each buying in single item
	 * and check whether given discount
	 * @return getTotalPriceMulti of single item
	 */
	
	public double getTotalPriceMulti() {
		double total = 0;
		if(getQuantity()>=getMinDiscountQuantity()) {
			total += getTotalPrice()-getTotalPrice()*getDiscountPercent()/100;
		}else {
			total += getTotalPrice();
		}
		return total;
	}
}
