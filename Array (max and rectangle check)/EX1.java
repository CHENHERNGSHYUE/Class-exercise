/**
 * 
 * @author CHEN HERNGSHYUE
 *
 */
public class EX1 {
	public static int max(int[]a) {
		int maxnumber = a[0];
		for (int i : a) {
			if (i > maxnumber) {
				maxnumber = i;
			}
		}
		return maxnumber;
	}

	public static void main(String[] args) {
		int[]a = {1,2,3};
		System.out.println("Maximal value is "+max(a));
		int[]b = {1,5,3};
		System.out.println("Maximal value is "+max(b));
		int[]c = {7,4,3};
		System.out.println("Maximal value is "+max(c));
		int[]d = {-1,-2,-3};
		System.out.println("Maximal value is "+max(d));
		int[]e = {-5};
		System.out.println("Maximal value is "+max(e));
	}

}
