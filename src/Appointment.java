import java.util.Date;

public class Appointment {
	
	private simpleDate startTime;
	private simpleDate endTime;
	private String appName;
	private int appType;
	private boolean useReserve;
	private boolean reminded;
	
	public Appointment() {
		startTime = new simpleDate(0, 0, 0);
		endTime = new simpleDate(0, 0, 0);
		appName = "";
		appType = 0;
		useReserve = false;
		reminded = false;
	}
	public Appointment(simpleDate theStart, simpleDate theEnd, String theName, int theType, boolean reserve) {
		startTime = theStart;
		endTime = theEnd;
		appName = theName;
		appType = theType;
		useReserve = reserve;
		reminded = false;
	}
	
	public String getName() {
		return appName;
	}
	
	public boolean usesReserve() {
		return useReserve;
	}
	
	public boolean getReminded() {
		return reminded;
	}
	
	public void setReminded(boolean b) {
		reminded = b;
	}
	
	public simpleDate getStartTime() {
		return startTime;
	}
	
	public simpleDate getEndTime() {
		return endTime;
	}
	
	public String toDisplayString() {
		return "";
	}
	
	public String toString() {
		String strType = "" + appType;
		return startTime.toString() + " " + endTime.toString() + " " + appName + " " + strType;
	}

}
