/**
 *  Creating booking class for ArrayList to use ArrayList<booking> ...  
 *  
 *  @version 2018/12/05
 *  @author Herng-Shyue Chen
 *  
 */

package EX3;

public class booking {
	public String room;
	public Date date;
	public int hour;
	public String purpose;
	
	/*
	 * Constructor
	 */

	public booking(String room, Date date, int hour, String purpose) {
		this.room = room;
		this.date = date;
		this.hour = hour;
		this.purpose = purpose;
	}
	
	/*
	 * Getter and Setter method 
	 */
	
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getHour() {
		assert hour>0 && hour<=24;
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public String getPurpose() {
		return purpose;
	}
	
}
