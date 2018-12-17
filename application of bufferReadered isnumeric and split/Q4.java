import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * @author CHEN HERNGSHYUE
 * @version 2018/12/09
 *
 */

public class Q4 {
		
	/**
	 * The method to check whether the string is number
	 * @param strNum
	 * @return
	 */
		
	public static boolean isNumeric(String strNum) {
		try{
			Double.parseDouble(strNum); 
		   }catch (NumberFormatException | NullPointerException nfe) {
		    return false;
		   }
		    return true;
		}

	public static void main(String[] args) {
		try{
	        String readString;
	        ArrayList<String> variable = new ArrayList<String>();
	        ArrayList<Integer> numbers = new ArrayList<Integer>();

	        /**
	        * read the file
	        */
	        	
	        BufferedReader in = 
	        		new BufferedReader(new FileReader("Q4.txt"));//input your file here and you will get the final number

	        BufferedWriter out = 
	                new BufferedWriter(new FileWriter("test5.txt"));//get the number in this file
	            
	        while ((readString = in.readLine()) != null) {
	        	String[] a = readString.split(" ");
	            if(variable.isEmpty() && numbers.isEmpty() && 
	            		readString.split(" ").length==3) {
	            	variable.add(a[0]);
	            	numbers.add(Integer.parseInt(a[2]));
	            }else if(variable.isEmpty() && numbers.isEmpty() && 
	            		readString.split(" ").length==5) {
	            	variable.add(a[0]);
	        		numbers.add(Integer.parseInt(a[2])+Integer.parseInt(a[4]));
	            }else if(variable.size()>0 && numbers.size()>0 &&
	            		readString.split(" ").length==3) {
	                for(int i=0; i<variable.size(); i++) {
	                	if(a[0].equals(variable.get(i))) {
	                		variable.remove(variable.get(i));
	                		numbers.remove(numbers.get(i));
	                	}
	                }
	                if(isNumeric(a[2])) {
	                	variable.add(a[0]);
	                	numbers.add(Integer.parseInt(a[2]));
	                }else{
	                	for(int i=0; i<variable.size(); i++) {
	                		if(a[2].equals(variable.get(i))){
	                			variable.add(a[0]);
	                			numbers.add(numbers.get(i));
	                		}
	                	}
	                }
	            }else if(variable.size()>0 && numbers.size()>0 &&
	                	readString.split(" ").length==5){
	                for(int i=0; i<variable.size(); i++) {
	                	if(a[0].equals(variable.get(i))) {
	                		variable.remove(variable.get(i));
	                		numbers.remove(numbers.get(i));
	                	}
	                }
	                if(isNumeric(a[2]) && isNumeric(a[4])) {
	                	variable.add(a[0]);
	                	numbers.add(Integer.parseInt(a[2])+Integer.parseInt(a[4]));
	                }else if(!isNumeric(a[2]) && !isNumeric(a[4])) {
	                	for(int i=0; i<variable.size(); i++) {
	                		if(a[2].equals(variable.get(i))) {
	                			a[2]=""+numbers.get(i);
	                		}
	                	}
	                	for(int i=0; i<variable.size(); i++) {
	                		if(a[4].equals(variable.get(i))) {
	                			a[4]=""+numbers.get(i);
	                		}
	                	}
	                	variable.add(a[0]);
	                	numbers.add(Integer.parseInt(a[2])+Integer.parseInt(a[4]));
	                }else if(!isNumeric(a[2]) && isNumeric(a[4])) {
	                	for(int i=0; i<variable.size(); i++) {
	                		if(a[2].equals(variable.get(i))) {
	                			a[2]=""+numbers.get(i);
	                		}
	                	}
	                	variable.add(a[0]);
	                	numbers.add(Integer.parseInt(a[2])+Integer.parseInt(a[4]));
	                }else if(isNumeric(a[2]) && !isNumeric(a[4])) {
	                	for(int i=0; i<variable.size(); i++) {
	                		if(a[4].equals(variable.get(i))) {
	                			a[4]=""+numbers.get(i);
	                		}
	                	}
	                	variable.add(a[0]);
	                	numbers.add(Integer.parseInt(a[2])+Integer.parseInt(a[4]));
	                }
	            }else if(readString.split(" ").length==1) {
	                for(int i=0; i<variable.size(); i++) {
	                	if(isNumeric(a[0])) {
	                		a[0]=a[0];
	                		out.write(a[0]);
	                		break;
	                	}else if(a[0].equals(variable.get(i))) {
	            			a[0]=""+numbers.get(i);	
	            			out.write(a[0]);
	            		}	
	            	}
	            }
	        }
	        in.close();
	        out.close();
		} catch (IOException e) {
			System.out.println("File not found.");
	    }
	}
}

