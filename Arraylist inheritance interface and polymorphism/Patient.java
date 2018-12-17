/*
 * The patient must add the method from measurable class which is implemented 
 * The patient has three variables name, age and weight
 * 
 * @author HERNG-SHYUE CHEN
 * @version 2018-11-21 
 */

public class Patient implements Measurable {
	private String name;
	private int age;
	private double weight;
	public Patient(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	/*
	 * From interface Measurable
	 * @see Measurable#getValue()
	 */
	
	@Override
	public double getValue() {
		return weight;
	}




}
