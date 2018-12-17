/**
 * 
 * @author CHEN HERNG-SHYUE
 *
 */
public class Ex1 {
	public static double areaCircle(double radius) { 
		return Math.PI * radius * radius;//Define the argument
	}
	public static void main(String[]args) { 
		System.out.println("The area is "+areaCircle(0)); //Calculate the value 0
		System.out.println("The area is "+areaCircle(5)); //Calculate the value 5
		System.out.println("The area is "+areaCircle(10));	//Calculate the value 10
	}
	
}