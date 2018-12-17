/*
 * This question needs three variables about the employee
 * (name, monthlyGrossSalary, and taxRate)
 * The type of these three variables are string, double, double respectively
 * Furthermore, give another two methods to calculate the net salary and the increasing rate
 * 
 * @author HERNG-SHYUE CHEN
 * @version 2018-10-16 
 */
public class Employee {
	public String name;
	public double monthlyGrossSalary;
	public double taxRate;
	public double monthlyNetSalary;
	public float increaseSalary;
	/*
	 * The constructor of the employee with three variables
	 * @para name stands for the employee's name 
	 * @para monthlyGrossSalary stands for the employee's gross salary per month
	 * @para taxRate stands for the gross salary's tax rate
	 * @para monthlyNetSalary stands for the salary after minus the tax/100
	 */
	public Employee(String name,double monthlyGrossSalary,double taxRate){
		this.name = name;
		this.monthlyGrossSalary = monthlyGrossSalary;
		this.taxRate = taxRate;
		monthlyNetSalary=monthlyGrossSalary*(1-taxRate/100);
	}
	/*
	 * The getter methods which give the information of employee
	 * @return the employee's name, monthly gross salary, tax rate and monthly net salary
	 */
	public String getName() {
		return name;
	}
	public double getMonthlyGrossSalary() {
		return monthlyGrossSalary;
	}
	public double getTaxRate() {
		return taxRate;
	}
	public double getMonthlyNetSalary() {
		return monthlyNetSalary;
	}
	/*
	 * The employee's information about name, monthly gross salary and tax rate which are set by us
	 * @param newName is the new title of book which is set by us
	 * @param newMonthlyGrossSalary is the new monthly gross salary of employee which is set by us
	 * @param newTaxRate is the new tax rate of employee which is set by us
	 */
	public void setName(String newName) {
		name = newName;
	}
	public void setMonthlyGrossSalary(double newMonthlyGrossSalary) {
		monthlyGrossSalary = newMonthlyGrossSalary;
	}
	public void setTaxRate(double newTaxRate) {
		taxRate = newTaxRate;
		monthlyNetSalary=monthlyGrossSalary*(1-taxRate/100);
	}
	/*
	 * Add another two methods to calculate the employee's monthly net salary and increasing salary
	 */
	public double monthlyNetSalary() {
		return monthlyNetSalary;
	}
	public void increaseSalary(double rate) {
		monthlyGrossSalary = monthlyGrossSalary*(1+rate*0.01);
		monthlyNetSalary = monthlyGrossSalary*(1-taxRate/100);
	}
	/*
	 * show how to print the employee's information
	 * @param toString() is the method to print the emplyee's information
	 */
	public String toString() {
		return name +" has a monthly gross salary of "+Math.round(monthlyGrossSalary)+", a taxrate of "+ taxRate
				+" and a monthly net salary of \u00A3"+Math.round(monthlyNetSalary)+".";
	}
	/*
	 * main method test
	 */
	public static void main(String[]args) {
		Employee Kenny = new Employee("KENNY",2400,20);
		System.out.println(Kenny);
	}
}
