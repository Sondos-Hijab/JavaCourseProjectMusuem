package defaultPackage;

import java.sql.Date;
import java.sql.Time;

public class VisitorRecord {
	//states
	public Date enteringDate;
	public Time enteringTime;
	public Date getEnteringDate() {
		return enteringDate;
	}
	public void setEnteringDate(Date enteringDate) {
		this.enteringDate = enteringDate;
	}
	public Time getEnteringTime() {
		return enteringTime;
	}
	public void setEnteringTime(Time enteringTime) {
		this.enteringTime = enteringTime;
	}
	//constructors
	public VisitorRecord() {}
	public VisitorRecord(Date d, Time t) {enteringDate=d; enteringTime=t;}
	//toString 
	public String toString() {
		return "entering Date: "+this.enteringDate+" entering Time: "+this.enteringTime;
	}
}
