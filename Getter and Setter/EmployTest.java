import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class EmployTest {

	private Employee Mary;
	private final static double TOLERANCE = 0.0001;
	
	// give information about employee
	@Before
	public void setup() {
		Mary = new Employee("Mary Lin", 30000, 50);
	}

	// Check all getter method
	@Test
	public void test1() {
		String checkingName = "Mary Lin";
		double checkingTaxRate = 50;
		double checkingGrossSalary = 30000;
		double checkingNetSalary = 15000;

		String actualName = Mary.getName();
		double actualTaxRate = Mary.getTaxRate();
		double actualGrossSalary = Mary.getMonthlyGrossSalary();
		double actualNetSalary = Mary.getMonthlyNetSalary();

		assertEquals(checkingName, actualName);
		assertEquals(checkingTaxRate, actualTaxRate, TOLERANCE);
		assertEquals(checkingGrossSalary, actualGrossSalary, TOLERANCE);
		assertEquals(checkingNetSalary, actualNetSalary, TOLERANCE);
	}

	// Check the setter can work according to testing tax rate
	@Test
	public void test2() {

		Mary.setTaxRate(0);

		double checkingGrossSalary = 30000;
		double checkingNetSalary = 30000;

		double actualGrossSalary = Mary.getMonthlyGrossSalary();
		double actualNetSalary = Mary.getMonthlyNetSalary();

		assertEquals(checkingGrossSalary, actualGrossSalary, TOLERANCE);

		assertEquals(checkingNetSalary, actualNetSalary, TOLERANCE);
	}

	// Calculate the salary
	@Test
	public void test3() {

		Mary.setTaxRate(20.0);

		Mary.setMonthlyGrossSalary(50000);
		
		Mary.increaseSalary(1.0);
		
		double checkingGrossSalary = 50500.0;
		double checkingNetSalary = 40400.0;

		double actualGrossSalary = Mary.getMonthlyGrossSalary();
		double actualNetSalary = Mary.getMonthlyNetSalary();

		assertEquals(checkingGrossSalary, actualGrossSalary, 0.001);

		assertEquals(checkingNetSalary, actualNetSalary, 0.001);
	}
}
