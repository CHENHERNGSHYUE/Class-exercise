/*
 * This question needs four variables about the bank account
 * (number, balance, setup fee and initial deposit)
 * The type of these four variables are all int
 * 
 * @author HERNG-SHYUE CHEN
 * @version 2018-10-16 
 */
public class BankAccount {
	private int accountNumber;
	private int balance;
	private int setupFee;
	public int initialDeposit;
	/*
	 * The constructor of the bank with four variables
	 * @para accountNumber stands for the account's number 
	 * @para setupFee stands for the account's setup fee 
	 * @para initialDeposit stands for the account's initial deposit
	 * @para balance stands for the account's balance which is calculated by 
	 * initial deposit minus setup fee
	 */
	public BankAccount(int accountNumber, int initialDeposit, int setupFee) {
		this.accountNumber=accountNumber;
		this.setupFee=setupFee;
		this.initialDeposit=initialDeposit;
		this.balance=initialDeposit-setupFee;
	}
	/*
	 * The getter methods which give the information of the account
	 * @return the account's number, initial deposit, setup Fee and balance
	 */
	public int getAccountNumber() {
		return accountNumber;
	} 
	public int getInitialDeposit() {
		return initialDeposit;
	} 
	public int getSetupFee() {
		return setupFee;
	}
	public int getBalance() {
		return balance;
	} 
	/*
	 * The account's new balance 
	 * @param newBalance we set
	 */
	public void setBalance(int Balance) {
		 balance = Balance;
	} 
	/*
	 * show how to print the account's information
	 * @param toString() is the method to print the account's information
	 */
	public String toString() {
		return "Account number is " + accountNumber+ "\nDeposit money " + initialDeposit + 
				" pound(s) and be charged for fee " + setupFee+ " pound(s)"+"\nThe current balance is "
				+balance+" pound(s)";
	}
}
