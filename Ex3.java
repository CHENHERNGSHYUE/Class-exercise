/**
 * 
 * @author CHEN HERNG-SHYUE
 *
 */
public class Ex3 {
	public static int timeToAngle(int hours, int minutes) {
		int hours1 = hours%12; 
			//Change the expression of 24-hour way to 12-hour way
		hours = (int) (Math.round(hours1*30 + minutes*0.5));
			//Degree of hours hand
		minutes = minutes*6; 
			//Degree of minutes hand
			return ((360+hours-minutes)%360); 
			//Degree of hours hand >= Degree of minutes hand
	}
	public static int timeToAngle(int hours, int minutes, int seconds) {
		int hours1 = hours%12; 
			//Change the expression of 24-hour way to 12-hour way
		hours = (int) (hours1*30+minutes*0.5+seconds*1/120);
		minutes = (int) (6*minutes+0.1*seconds); 
			/*when moving 1 second, hour hand moves 30/3600 degree 
			and minute hand moves 6/60 degree*/
			return ((360+hours-minutes)%360); 
			//Degree of hours hand >= Degree of minutes hand
	} 
	public static void main(String[]args) {
		System.out.println("Answer(a) is"); 
		System.out.println(timeToAngle(9,00)+" degree"); //9:00 Degree
		System.out.println(timeToAngle(3,00)+" degree"); //3:00 Degree
		System.out.println(timeToAngle(18,00)+" degree"); //18:00 Degree
		System.out.println(timeToAngle(1,00)+" degree"); //1:00 Degree
		System.out.println(timeToAngle(2,30)+" degree"); //2:30 Degree
		System.out.println(timeToAngle(4,41)+" degree"); //4:41 Degree
		System.out.println("-------------------------------------");
		System.out.println("Answer(b) is"); 
		System.out.println(timeToAngle(0,00,20)+" degree"); 
		//0:00:20 Degree
		System.out.println(timeToAngle(13,05,(int)27.272727272727)+" degree");
		//13:05:27.2727272727 Degree
	}
}