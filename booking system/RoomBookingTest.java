/*
 *  @version 2018/12/05
 *  @author Herng-Shyue Chen
 */
package EX3;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RoomBookingTest {
	ArrayList<booking> a = new ArrayList<booking>();
	RoomBooking bookings2018 = new RoomBooking(2018, a);
	Date nov22 = new Date(22, "November", 2018);
	
	/*
	 * Check the reservation can be work and no overlap reserve
	 */
	
	@Test
	public void testa() {
		assertTrue(bookings2018.book("R222", nov22, 12, "Tutor meeting"));
		assertFalse(bookings2018.book("R222", nov22, 12, "Java meeting"));
		assertTrue(bookings2018.book("R222", nov22, 13, "Interviews"));
	}
	
	/*
	 * Check cancel function can be work
	 */
	
	@Test
	public void testb() {
		assertTrue(bookings2018.book("R222", nov22, 12, "Java meeting"));
		bookings2018.cancel("R222", nov22, 12);
		assertTrue(bookings2018.book("R222", nov22, 12, "Java meeting"));
	}
	
	/*
	 * Check incorrect room and times can not be reserved
	 */
	
	@Test
	public void testc() {
		assertFalse(bookings2018.book("R000", nov22, 12, "meeting"));
		assertFalse(bookings2018.book("R222", nov22, 24, "meeting"));
	}
}
	
