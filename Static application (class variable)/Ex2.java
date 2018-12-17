/**
 * 
 * @author CHEN HERNG-SHYUE
 *
 */
public class Ex2 {
	public static double imperialToKg(double ton, double hundredweight,
		double quarter, double stone, double pound, double ounce, double drachm,
		double grain) {
		return (2240 * ton + 112 * hundredweight + 28 * quarter
				+ 14 * stone + 1 / 16 * ounce + 1 / 256 * drachm + 1 / 7000 *grain
				+pound) * 0.45359237; /**Change to pounds and 
				1 pound = 0.45359237 kilograms*/
		}
	public static void main(String[]args) {
		double x = imperialToKg(0,0,0,11,0,0,0,0); //11 stones
		double y = imperialToKg(0,0,0,0,6,0,0,0); //6 pounds
		System.out.println("The total weight is "+(x+y)+" Kg"); // Calculate 11 stones + 6 pounds
	}
}
