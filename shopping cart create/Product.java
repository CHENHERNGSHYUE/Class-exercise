/**
 *  Create a shopping cart and calculate the total price of buying 
 *  
 *  @version 2018/12/05
 *  @author Herng-Shyue Chen
 *  
 */
package shop;

public class Product {
	 public String name;
	 public double price;
	 public int quantity;
	 
	/*
	 * Constructor
	 */
	 
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	/*
	 * Getter and Setter method
	 */
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/*
	 * Calculate the total price in each buying in single item
	 * @return getTotalPrice of single item 
	 */
	
	public double getTotalPrice() {
		return this.price * this.quantity;
	}
}
