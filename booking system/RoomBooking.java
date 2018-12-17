/**
 *  Create a booking table
 *  
 *  @version 2018/12/05
 *  @author Herng-Shyue Chen
 *  
 */
package EX3;

import java.util.ArrayList;

import shop.Product;

public class RoomBooking {
	
	public int year;
	public ArrayList<booking> rooms;
	
	/*
	 * Define the time and the room can be reserved 
	 * if have not been reserved before
	 */
	
    public static String[] roomlist = {"R217", "R222", "R225", "R245"};  
    public static final int[] hours = {9, 10, 11, 12, 13, 14, 15, 16, 17};
    
    /*
     * Constructor
     */
    
    public RoomBooking(int year, ArrayList<booking> rooms) {
    	this.year =year ;
    	this.rooms = rooms;
    }
    
    /*
     * Getter method
     * @return getYear
     * @return getRooms
     */
    
    public int getYear() {
		return year;
	}
    
	public ArrayList<booking> getRooms() {
		return rooms;
	}
	
	/*
	 * Check whether the room have been booked and it is acceptable
	 * @return true or false
	 */
	
	public boolean book(String room, Date date, int hour, String purpose) {
		booking a = new booking(room, date, hour, purpose);
		if(admissibleRoom(room) && admissibleHour(hour) && 
				book2(room, date, hour)) {
			rooms.add(a);
			//System.out.println(purpose);
			return true;
		}else if(rooms.isEmpty() && admissibleRoom(room) && admissibleHour(hour)) {
			//System.out.println(purpose);
			return true;
		}
		//System.out.println("no booking since room booked already");	
		return false;
	}
	
	/*
	 * Check whether the room have been booked before
	 * @return true or false
	 */
	
	public boolean book2(String room, Date date, int hour) {
		for(booking R:rooms) {
			if(room.equals(R.getRoom()) && date.equals(R.getDate())
				&& hour == R.getHour()) {
				return false;
			}	
		}
		return true;
	}
	
	/*
	 * Judge the room is acceptable or not
	 * @return true or false
	 */
	
    public static boolean admissibleRoom(String r) {
        for (String pr : roomlist) {
            if (r.equals(pr)) {
                return true;
            }
        }
        return false;
    }
    
	/*
	 * Judge the time is acceptable or not
	 * @return true or false
	 */
    
    public static boolean admissibleHour(int h) {
        for (int ph : hours) {
            if (h == ph) {
                return true;
            }
        }
        return false;
    }
    
    /*
     * Cancel the booking which has been booked before
     * @param
     */

    public void cancel(String room, Date date, int hour) {
    	for(int i =0; i<rooms.size(); i++) {
    		if(room.equals(rooms.get(i).getRoom()) && date.equals(rooms.get(i).getDate()) && 
    				hour == rooms.get(i).getHour()) {
    			rooms.remove(rooms.get(i));
    		}
    	}
    }
    
    public String displayDay(Date date) {
    	String out = "";
    	out += "                                       " + date + "                  \n\n";
    	out += "       |        "+roomlist[0]+"        |        "+roomlist[1]+"        |        "+roomlist[2]+"        |        "+roomlist[3]+"        |";
    	out += "\n-------+--------------------+--------------------+--------------------+--------------------+";
    	
    	for (int i=0; i<hours.length; i++) {
    		out += String.format("%n%3s:00 |", hours[i]);
    		for (int j=0; j<roomlist.length; j++) {
    			boolean check = true;
    			for (booking a : rooms) {
    				if(hours[i] == a.getHour() && roomlist[j].equals(a.getRoom()) &&
    						date.equals(a.getDate())) {
    					out+= String.format(" %17s  |",a.purpose);	
    					check = false;
    				}
    			}
    			if(check) {
    				out+="                    |";
    			}
    		}
    		out += "\n-------+--------------------+--------------------+--------------------+--------------------+";
    	}
    	return out;
    }	
    
    /*
     * Main method
     */
    
    public static void main(String[] args) {
    	ArrayList<booking> a = new ArrayList<booking>();
    	RoomBooking bookings2018 = new RoomBooking(2018, a);
    	Date nov22 = new Date(22, "November", 2018);
    	bookings2018.book("R217", nov22, 9, "Tutor meeting");
    	bookings2018.book("R222", nov22, 12, "Java meeting");
    	bookings2018.book("R222", nov22, 13, "Interviews");
    	bookings2018.book("R245", nov22, 16, "Project meeting");
    	System.out.println(bookings2018.displayDay(nov22));
    }  
}
