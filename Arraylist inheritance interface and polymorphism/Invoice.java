/*
 * The invoice must add the method from measurable class which is implemented 
 * The invoice has three variables accountNumber, sort code and amount
 * 
 * @author HERNG-SHYUE CHEN
 * @version 2018-11-21 
 */

public class Invoice implements Measurable {
	private String accountNumber;
	private String sortcode;
	private double amount;
	public Invoice(String accountNumber, String sortcode, double amount) {
		this.accountNumber = accountNumber;
		this.sortcode = sortcode;
		this.amount = amount;
	}

	/*
	 * From interface Measurable
	 * @see Measurable#getValue()
	 */
	
	@Override
	public double getValue() {
		return amount;
	}

}
