package defaultPackage;
import defaultPackage.Languages;
import java.util.ArrayList;
import java.util.Scanner;
public class Guide extends Employee{
	Scanner s=new Scanner(System.in);
	// constructor
	public Guide() { super();}
	//states
	private int toursPerWeek;
	
	public int getToursPerWeek() {
		return toursPerWeek;
	}
	public void setToursPerWeek(int toursPerWeek) {
		this.toursPerWeek = toursPerWeek;
	}
	private int toursPerDay;
	private ArrayList<MuseumWorkingDays> workingdays=new ArrayList<MuseumWorkingDays>();
	public ArrayList<Languages> guides_languages=new ArrayList<Languages>();
	//setters and getters
	public ArrayList<MuseumWorkingDays> getWorkingdays() {
		return workingdays;
	}
	public void setWorkingdays(ArrayList<MuseumWorkingDays> workingdays) {
		this.workingdays = workingdays;
	}
	public int getToursPerDay() {
		return toursPerDay;
	}
	public void setToursPerDay(int toursPerDay) {
		while(toursPerDay>3 || toursPerDay<=0) {System.out.println("it should be between 1 and 3, enter another value");
		toursPerDay=s.nextInt();
		}
		this.toursPerDay = toursPerDay;
	}

	public void setLanguage(ArrayList<Languages> lang1){
		this.guides_languages=lang1;
	}
	public ArrayList<Languages>getLanguage() {
		return guides_languages;
	}
	//toString function
	public String toString() {
		return "Guide's name: "+this.getName()+", Guide's id:"+this.getId()+", Guide's date of birth:"+this.getDob()+", Hire date:"+this.getHireDate()
		+", employement id: "+this.getEmployment_id()+", tours per day: "+this.getToursPerDay()+"\nGuide's languages are:"+this.getLanguage()+"\nworking days: "+this.getWorkingdays();
	}
}
