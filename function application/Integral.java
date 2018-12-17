package EX2;

import java.util.function.Function;

/**
 * 
 * @author CHEN HERNG-SHYUE
 *
 */
public class Integral {
	
	public static Function<Double,Double> f0 =
			x -> {return x*x;};
	        
	public static Function<Double,Double> f1 =
	    	x -> {return Math.sin(x);};
	    	
	public static Function<Double,Double> f2 =
			x -> {return Math.exp(x);};
			
	public static Function<Double,Double> f3 =
			x-> {return x*x*x+x*x+x+1;};
				
	public static double integral(Function<Double,Double> f, double a, double b, int n) {
		double area = 0;
		for(int i=0; i<n; i++) {
			double width = (b-a)/n;
			double height = f.apply(a+i*width);
			area+= width*height;
		}
		return area;
	}

	public static void main(String[] args) {
		Integral test1 = new Integral();
		System.out.println(test1.integral(f0, 0, 1, 1000));
		System.out.println(test1.integral(f1, 0, 1, 1000));
		System.out.println(test1.integral(f2, 0, 1, 1000));
		System.out.println(test1.integral(f3, 0, 1, 1000));
	}

}
