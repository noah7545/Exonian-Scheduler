//import java.time.DayOfWeek;
import java.util.Date;

public class Driver {

	public static void main(String[] args) {
		Schedule schedule = new Schedule();
		schedule.getSchedule();
		
		//main loop
		while(true) {
			schedule.checkAppointments();
		}
		
		//Emailer test = new Emailer();
		//Emailer test = new Emailer();
		//test.sendEmail("noah@jeff.org", "Hopefully this works", "Check 123");
		//System.out.println(DayOfWeek.values());
		//Schedule schedule = new Schedule();
		//schedule.getSchedule();
		
		
	}

}
