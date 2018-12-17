/**
 * 
 * @author CHEN HERNGSHYUE
 *
 */
public class EX2 {
	public static boolean rectangular(int[][]a) {
		for (int i = 0 ; i< a.length ; i++) {
			for(int j = 0 ; j<a[i].length ; j++) {
				int number = a[0].length;
				if (a[i].length != number) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[][]a = {{1},
					{4},
					{4,2}};
		System.out.println("Judge "+rectangular(a));

	}

}
