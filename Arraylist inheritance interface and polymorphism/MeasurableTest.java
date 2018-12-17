import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class MeasurableTest {

	public static final double TOLERANCE = 0.00001;

	private Measurable invoice1, invoice2, invoice3, invoice4, invoice5;
	private Measurable patient1, patient2, patient3, patient4, patient5;

	@Before
	public void setUp() {
		invoice1 = new Invoice("a", "abc", 100);
		invoice2 = new Invoice("b", "bcd", 200);
		invoice3 = new Invoice("c", "def", 300);
		invoice4 = new Invoice("d", "fgh", 400);
		invoice5 = new Invoice("e", "hij", 500);

		patient1 = new Patient("aa", 1, 1000);
		patient2 = new Patient("bb", 2, 2000);
		patient3 = new Patient("cc", 3, 3000);
		patient4 = new Patient("dd", 4, 4000);
		patient5 = new Patient("ee", 5, 5000);
	}

	//checking calculate max, average and standard deviation of invoice class is correct
	@Test
	public void test1() {
		ArrayList<Measurable> invoiceList = new ArrayList<>();
		invoiceList.add(invoice1);
		invoiceList.add(invoice2);
		invoiceList.add(invoice3);
		invoiceList.add(invoice4);
		invoiceList.add(invoice5);

		double expectedMax = 500;
		double actualMax = Statistics.maximum(invoiceList);

		assertEquals(expectedMax, actualMax, TOLERANCE);
		
		double expectedAvg = 300;
		double actualAvg = Statistics.average(invoiceList);

		assertEquals(expectedAvg, actualAvg, TOLERANCE);
		
		double expectedStd = 158.11388300841;
		double actualStd = Statistics.standardDeviation(invoiceList);

		assertEquals(expectedStd, actualStd, TOLERANCE);

	}

	//checking calculate max, average and standard deviation of patient class is correct
	@Test
	public void test2() {
		ArrayList<Measurable> patientList = new ArrayList<>();
		patientList.add(patient1);
		patientList.add(patient2);
		patientList.add(patient3);
		patientList.add(patient4);
		patientList.add(patient5);

		double expectedMax = 5000;
		double actualMax = Statistics.maximum(patientList);

		assertEquals(expectedMax, actualMax, TOLERANCE);
		
		double expectedAvg = 3000;
		double actualAvg = Statistics.average(patientList);

		assertEquals(expectedAvg, actualAvg, TOLERANCE);
		
		double expectedStd = 1581.1388300841;
		double actualStd = Statistics.standardDeviation(patientList);

		assertEquals(expectedStd, actualStd, TOLERANCE);
	}

	/*
	 * Checking one number still can test the max, average 
	 * and give standard deviation for NaN in invoice class
	 * 
	 * Checking create new list of invoice still can work
	 */
	
	@Test
	public void test3() {
		Measurable invoice6 = new Invoice("56421541", "25-56-54", 0);
		ArrayList<Measurable> invoiceList = new ArrayList<>();
		invoiceList.add(invoice6);
		double expectedMax = 0;
		double actualMax = Statistics.maximum(invoiceList);
		
		assertEquals(expectedMax, actualMax, TOLERANCE);
		
		double expectedAvg = 0;
		double actualAvg = Statistics.average(invoiceList);
		assertEquals(expectedAvg, actualAvg, TOLERANCE);

		double expectedStd = Double.NaN;
		double actualStd = Statistics.standardDeviation(invoiceList);
		assertEquals(expectedStd, actualStd, TOLERANCE);
	}

	/*
	 * Checking one number still can test the max, average 
	 * and give standard deviation for NaN in patient class
	 * 
	 * Checking create new list of patient still can work
	 */
	
	@Test
	public void test4() {
		Measurable patient6 = new Patient("Kevin", 24, 68);
		ArrayList<Measurable> patientList = new ArrayList<>();
		patientList.add(patient6);

		double expectedMax = 68;
		double actualMax = Statistics.maximum(patientList);

		assertEquals(expectedMax, actualMax, TOLERANCE);
		
		double expectedAvg = 68;
		double actualAvg = Statistics.average(patientList);
		assertEquals(expectedAvg, actualAvg, TOLERANCE);

		double expectedStd = Double.NaN;
		double actualStd = Statistics.standardDeviation(patientList);
		assertEquals(expectedStd, actualStd, TOLERANCE);	
	}
	
}
