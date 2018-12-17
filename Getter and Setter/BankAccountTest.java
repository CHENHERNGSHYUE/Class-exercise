import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	
	private BankAccount saving;
	
	// give information for account
	@Before
	public void setup() {
		saving = new BankAccount(17, 1000, 500);
	}

	// check whether the balance is correct from getter
	@Test
	public void test1() {
		int checking = 500;
		int actual = saving.getBalance();
		assertEquals(checking, actual);
	}
	
	// check whether the setting fee is correct from getter
	@Test
	public void test2() {
		int checking = 500;
		int actual = saving.getSetupFee();
		assertEquals(checking, actual);
	}

	// check whether the balance is correct from setter
	@Test
	public void test3() {
		saving.setBalance(1000);
		int checking = 1000;
		int actual = saving.getBalance();
		assertEquals(checking, actual);
	}
	
	// Check the negative balance from getter
	@Test
	public void test4() {
		saving = new BankAccount(17, 0, 50);
		int checking = -50;
		int actual = saving.getBalance();
		assertEquals(checking, actual);
	}
}