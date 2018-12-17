import java.util.Arrays;
import java.util.List;

/*
 * Implementation of insertion sort 
 * by using for loop to gain the new sequence
 * with only one variable.
 * 
 * @author HERNG-SHYUE CHEN
 * @version 2018-11-07 
 */
public class InsertionSort {
	//private int[]numbers;	
	/*
	 * Using loop method to get the sequence after insertion sort
	 * @return new sequence  
	 */
	public static Integer[] insertionSort(Integer[] arr1){
		int a;
        for (int i = 1; i < arr1.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(arr1[j] < arr1[j-1]){
                    a = arr1[j];
                    arr1[j] = arr1[j-1];
                    arr1[j-1] = a;
                }
            }
        }
        return arr1;
	}
	/*
	 * The getter methods which give the number after insertion sort 
	 * @return the new array 
	 */
	//public int[] getNumbers() {
	//	return this.numbers;
	//}
	/*
	 * Show how to print the new array after insertion sort 
	 * @param toString() is the method to print the new sequence 
	 */
	public static void toString(int[]numbers) {
		for (int i : numbers) {
		System.out.print(i+" ");
		}
	}
	/*
	 * Main method checking
	 */
	public static void main(String[] args) {
		Integer[] arr1 = new Integer[]{7,9,2,6,7,5};
		List test = Arrays.asList(insertionSort(arr1));
		//toString(insertionSort(arr1));
		System.out.println("a "+test);
	        
	}

}
