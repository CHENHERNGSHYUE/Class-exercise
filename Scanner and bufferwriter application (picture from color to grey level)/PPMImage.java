import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
 * Read .PGM file and change the image from color(R/G/B) to grey level
 * and create new .PPM file by using for Scanner and BufferedWriter.
 * There are  five variables defined in this method.
 * 
 * @author HERNG-SHYUE CHEN
 * @version 2018-11-07 
 */
public class PPMImage {
	private int width;
	private int height;
	private int maxShade;
	private String typeOfFile; 
	private short[][][] pixels;	
	/*
	 * Read the file and give content in each variable
	 * If the file is not found, it will show result explaining why exception
	 * and give a file with original number
	 */	
	public PPMImage(String filename) {
		try {
			Scanner a1 = new Scanner(new File(filename));
			typeOfFile = a1.next();
			height = a1.nextInt();
			width = a1.nextInt();
			maxShade = a1.nextInt();
			pixels = new short [width][height][3]; 
			for(int i=0 ; i<width ; i++) {
				for(int j=0; j<height ; j++) {
					for(int k=0; k<3; k++) {
						pixels[i][j][k] = a1.nextShort();
					}
				}
			}
		} 
		catch (IOException e) {
			System.out.println("File not found.");
			
			 typeOfFile = "P2";
	         width = 0;
	         height = 0;
	         maxShade = 0;
	         pixels = new short[width][height][3];
		}
	}	
	/*
	 * Getter method
	 * @return width, height, maxshade, typeogfile and pixels
	 */	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getMaxShade() {
		int max = 0;
		int maxsum = 0;
		for(int i=0; i<width; i++) {
        	for(int j=0; j<height; j++) {
        		for(int k=0; k<3; k++) {
        			maxsum += pixels[i][j][k];
        		}
        		maxsum = (int) Math.round(maxsum/3.0);
        		if(maxsum>max) {
    				max = maxsum;	
    			}
        		maxsum = 0;
        	}
		}
		return max;
	}
	public String getTypeOfFile() {
		return "P2";
	}
	public short[][][] getPixels() {
		return pixels;
	}	
	/*
	 * Output the new .PPM file
	 */	
	public short[][] makeGrey(String filename){
		short[][]makeGrey = new short [width][height];
		try {
			int counter = 0;
			short sum = 0;
		    BufferedWriter out = 
			new BufferedWriter(new FileWriter(filename));
		    out.write(getTypeOfFile() + "\n");
		    out.write(getHeight() + " " + getWidth() +"\n");
		    out.write(getMaxShade() + "\n");
		    
            for(short i=0; i<width; i++) {
            	for(short j=0; j<height; j++) {
            		for(short k=0; k<3; k++) {
            			sum+=pixels[i][j][k];
            		}
            		makeGrey[i][j] = (short) Math.round(sum/3.0);
            		sum=0;
            		out.write(makeGrey[i][j]+" ");
            		counter++;
            		if(counter==15) {
            			out.write("\n");
            			counter=0;
            		}
            	}
            } 
            out.write("\n");
            out.close();
		}
		catch (IOException e){
            System.out.println("File not found.");
        }
		return makeGrey;
	}

}
