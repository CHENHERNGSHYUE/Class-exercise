import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BookTest {
	
	private Book textbook;
	
	// give information about book
	@Before
	public void setup() {
		textbook = new Book("Computer Science", 1800, "7777777");
	}
	
	// check whether the book's name is correct from getter
	@Test
	public void test1() {
		String expected = "Computer Science";
		String actual = textbook.getTitle();
		assertEquals(expected, actual);
	}
	
	// check whether the book's publishing date is correct from getter
	@Test
	public void test2() {
		int expected = 1800;
		int actual = textbook.getYear();
		assertEquals(expected, actual);
	}
	
	// check whether the book's Isbn is correct from getter
	@Test
	public void test3() {
		String expected = "7777777";
		String actual = textbook.getIsbn();
		assertEquals(expected, actual);
	}
	
	// check whether the book's name is correct after resetting
	@Test
	public void test4() {
		textbook.setTitle("Machine learning");
		String expected = "Machine learning";
		String actual = textbook.getTitle();
		assertEquals(expected, actual);
	}

	// check whether the book's publishing year is correct after resetting
	@Test
	public void test5() {
		textbook.setYear(1900);
		int expected = 1900;
		int actual = textbook.getYear();
		assertEquals(expected, actual);
	}

}
