package defaultPackage;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Visitor extends Person{
	Scanner s=new Scanner(System.in);
	private int record_id;
	private int visits_count;
	private Guide visitor_guide;
	Languages visitor_Language;
	private int vId;
	public Languages getVisitor_Language() {
		return visitor_Language;
	}
	public void setVisitor_Language(Languages visitor_Language) {
		this.visitor_Language = visitor_Language;
	}
	public Guide getVisitor_guide() {
		return visitor_guide;
	}
	public void setVisitor_guide(Guide visitor_guide) {
		this.visitor_guide = visitor_guide;
	}
	ArrayList<VisitorRecord> visitorRecord=new ArrayList <VisitorRecord>();
	private MuseumWorkingDays tourDay;
	public MuseumWorkingDays getTourDay() {
		return tourDay;
	}
	public void setTourDay(MuseumWorkingDays tourDay) {
		this.tourDay = tourDay;
	}
	public Visitor() {
		super();
		//System.out.println("Visitor Constructor");
		visits_count=0;
	}
	public int getRecord_id() {
		return record_id;
	}
	public void setRecord_id(int record_id) {
		while(record_id<=0) {System.out.println("enter a positive value >0:"); record_id=s.nextInt();}
		this.record_id = record_id;
	}
	public int getvId() {
		return this.vId;
	}
	public void setvId(int id) {
		while(id<=0) {System.out.println("enter a positive value >0:"); id=s.nextInt();}
		this.vId=id;
	}
	public int getVisits_count() {
		return visits_count;
	}
	public void setVisits_count(int visits_count) {
		while(visits_count<=0) {System.out.println("enter a positive value >0:"); visits_count=s.nextInt();}
		this.visits_count=visits_count;
	}
	public abstract void BookTour();
	public void setVisits(ArrayList<VisitorRecord> visitorRecord){
		this.visitorRecord=visitorRecord;
	}
	public ArrayList<VisitorRecord> getVisits(){
		return visitorRecord;
	}
}
