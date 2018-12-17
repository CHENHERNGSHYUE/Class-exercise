/**
 *  Create a shopping cart and calculate the total price of buying 
 *  
 *  @version 2018/12/05
 *  @author Herng-Shyue Chen
 *  
 */

package shop;

import java.util.ArrayList;

public class ShoppingCart {
	public ArrayList<Product> item;
	
	/*
	 * Constructor
	 */
	
	public ShoppingCart(ArrayList<Product> item){
		this.item = item;
	}
	
	/*
	 * Calculate the total price including normal items and discount items
	 * @return getTotalpayment of current shopping cart
	 */
	
	public double getTotalpayment() {
		double totalpayment=0;
		for(Product a:item) {
			if(a instanceof MultiBuyProduct) {
				totalpayment+=((MultiBuyProduct)a).getTotalPriceMulti(); 
			}else{
				totalpayment += a.getTotalPrice();
			}
		}
		totalpayment = Math.round(totalpayment*100);
		totalpayment/= 100;
		return totalpayment;
	}
	
	/*
	 * Judge whether the item has already been in shopping cart
	 * @return true or false 
	 */
	
	public boolean judgeEqual(Product p) {
		for(int i = 0; i < item.size(); i++) {
			if(p.getName().equals(item.get(i).getName()) &&
					item.get(i).getPrice() == p.getPrice()) {
				return false;
			}
		}
		return true;
	}
	
	/*
	 * The method to check whether should add new product 
	 * or renew the duplicate one's quantities
	 * @param add 
	 */
	
	public void add(Product p) {
		if(item.isEmpty() || judgeEqual(p)) {
			item.add(p);
		}else{
			for(int i=0; i<item.size(); i++) {
				if(p.getName().equals(item.get(i).getName()) && 
						p.getPrice() == item.get(i).getPrice()){
					item.get(i).setQuantity(item.get(i).getQuantity()+p.getQuantity());	
				}
			}
		}
	}
	
	@Override
	public String toString() {
		for(Product a:item) {
			if(a instanceof MultiBuyProduct) {
				System.out.printf("%2s * GBP %6s%11s      =     GBP     %6s\n",
						((MultiBuyProduct)a).getQuantity(),((MultiBuyProduct)a).getPrice(),
						((MultiBuyProduct)a).getName(), ((MultiBuyProduct)a).getTotalPriceMulti());
				System.out.println("   (Multibuy Discount: GBP "+(Math.round(100*(a.getTotalPrice()-
				((MultiBuyProduct)a).getTotalPriceMulti())))/100.0+")");
			}
			else {
				System.out.printf("%2s * GBP %6s%11s      =     GBP     %6s\n",
						a.getQuantity(),a.getPrice(),a.getName(),+a.getTotalPrice()); //good format
				//System.out.println(a.getQuantity()+" * GBP    " + a.getPrice()+" "+a.getName() +
				//"              = GBP        "+a.getTotalPrice()); //bad format
			}	
		}
		return "                                ---------------------\n"+
		"                                Total GBP      "+getTotalpayment();
	}
	
	/*
	 * main method to check
	 */

	public static void main(String[] args) {
		ArrayList<Product> a = new ArrayList<Product>();
		ShoppingCart mary = new ShoppingCart(a); 
		Product A = new Product("Bread", 0.78, 2);
		Product B = new Product("Milk", 1.12, 2);
		Product C = new Product("apples", 0.49, 4);
		Product D = new Product("Bread", 0.78, 2);
		Product E = new MultiBuyProduct("Tomato", 0.5, 20, 10, 3);
		Product F = new MultiBuyProduct("Tomato", 0.5, 20, 10, 3);
		Product G = new Product("Tomato", 0.78, 2);
		mary.add(A);
		mary.add(B);
		mary.add(C);
		mary.add(D);
		mary.add(E);
		mary.add(F);
		mary.add(G);
		System.out.println(mary);
	 }

}
