/*
 * @author HERNG-SHYUE CHEN
 * @version 2018-11-07 
 * 
 * There is a big problem in measurementSeries method when you compiling and 
 * it cannot be show the result directly because the else...if loop 
 * cannot be used to judge the exception problem. Additionally, throw new is
 * a way to give the exception condition instead of dealing with the exception.
 * 
 * So, if we want to directly show the result after compiling, we should use the
 * try and catch rather than else...if. Then, give the result in catch{} when
 * measurement() encountering the exception issue.
 */
public class Measurement {

    public static int measurement() {
        int res = (int) (Math.random() * 3);
        if (res == 0) {
            throw new IllegalArgumentException();
        } else {
            return res;
        }
    }

    public static int[] measurementSeries(int n) {
       	int[] result = new int[n];
       	for (int i = 0; i < n; i++) {
       		try{
        		result[i] = measurement(); 
       			}
       		catch(IllegalArgumentException e) {
       			result[i] = -1;
       		}
        }
        return result;
    }

    public static void printArray(int[] result) {
        for (int el : result) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(measurementSeries(10));
    }
}