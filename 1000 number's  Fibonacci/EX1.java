import java.math.BigInteger;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author CHEN HERNGSHYUE
 *
 */
public class EX1 {

	public static void main(String[] args) {
		try {
			BufferedWriter out = new BufferedWriter
					(new FileWriter("D:\\FibonacciTest"));
			BigInteger total = new BigInteger("1000");
			BigInteger[] F = new BigInteger[total.intValue()];
			F[0] = BigInteger.valueOf(0L);
			F[1] = BigInteger.valueOf(1L);
			System.out.println(F[0]);
			System.out.println(F[1]);
			out.write(F[0]+"   ");
			out.write(F[1]+"   ");
			for(int i=2 ; i<1000 ; i++) {
				F[i] = F[i-1].add(F[i-2]);
				System.out.println(F[i]);
				out.write(F[i]+"   ");
			}
			out.write("   ");
			out.close();
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
