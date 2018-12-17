import java.util.ArrayList;

/*
 * Make calculation through method from ArrayList class    
 * to catch the number from patient and invoice class
 * 
 * @author HERNG-SHYUE CHEN
 * @version 2018-11-21 
 */
public class Statistics{
	
	/*
	 *Calculate the max number 
	 */
	
	public static double maximum(ArrayList<Measurable> elements) {
		double max = elements.get(0).getValue();
		for(int i = 1; i<elements.size(); i++) {
			if(elements.get(i).getValue()>max) {
				max=elements.get(i).getValue();
			}
		}
		return max;
	}
	
	/*
	 *Calculate the average number 
	 */
	
	public static double average(ArrayList<Measurable> elements) {
		double average = 0;
		for(int i=0 ; i<elements.size() ; i++) {
				average+=elements.get(i).getValue();
		}
		average = average/elements.size();
		return average;
	}
	
	/*
	 *Calculate the standard variation number 
	 */
	
	public static double standardDeviation(ArrayList<Measurable> elements) {
		double stD = 0;
		for(int i=0 ; i<elements.size() ; i++) {
			stD += (elements.get(i).getValue()-average(elements))*(elements.get(i).getValue()-average(elements));
		}
		stD = Math.sqrt(stD / (elements.size()-1));
		return stD;
	}
	
}
