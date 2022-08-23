package defaultPackage;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class MuseumSystem {
	Scanner s= new Scanner(System.in);
	public ArrayList<MultiTimeTicket> allMultiTimeTickets=new ArrayList<MultiTimeTicket>();
	//states
	String name;
	ArrayList<Visitor> arrayListVisitor=new ArrayList<Visitor>();
	ArrayList<Guide> arrayListGuide=new ArrayList<Guide>();
	
	public ArrayList<SeniorVisitor> seniorVisitors=new ArrayList<SeniorVisitor> ();
	public ArrayList<RegularVisitor> regularVisitors=new ArrayList<RegularVisitor>();
	public ArrayList<SeniorVisitor> getSeniorVisitors() {
		return seniorVisitors;
	}
	public void setSeniorVisitors(ArrayList<SeniorVisitor> seniorVisitors) {
		this.seniorVisitors = seniorVisitors;
	}
	public ArrayList<RegularVisitor> getRegularVisitors() {
		return regularVisitors;
	}
	public void setRegularVisitors(ArrayList<RegularVisitor> regularVisitors) {
		this.regularVisitors = regularVisitors;
	}
	//constructor
	public MuseumSystem(String name) {
		this.name=name;
	}
	//getters setters array list visitors
	public ArrayList<Visitor> getArrayListVisitor() {
		return arrayListVisitor;
	}
	public void setArrayListVisitor(ArrayList<Visitor> arrayListVisitor) {
		this.arrayListVisitor = arrayListVisitor;
	}
	//getters setters array list guides
	public ArrayList<Guide> getArrayListGuide() {
		return arrayListGuide;
	}
	public void setArrayListGuide(ArrayList<Guide> arrayListGuide) {
		this.arrayListGuide = arrayListGuide;
	}
	//getters setters array list "available" guides
	public ArrayList<Guide> getAvailableGuides(MuseumWorkingDays day) {
		ArrayList<Guide> arrayListAvaGuide=new ArrayList<Guide>();
		for(Guide guide: arrayListGuide) {
			for(MuseumWorkingDays d: guide.getWorkingdays()) {
				if(d==day) arrayListAvaGuide.add(guide);
			}
		}
		return arrayListAvaGuide;
	}
	
	//setters getters name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//add visitor function
	public void addVisitor(Visitor S) {
		boolean b=false;
		int idCha;
		for(Visitor v: this.arrayListVisitor) {
			if(v.getId()==S.getId()) {b=true; break;}
			else b=false;
		}
		if(b==false) {this.arrayListVisitor.add(S);}
		else if(b==true){
			System.out.println("the id is repeated! enter another id :");
			idCha=s.nextInt();
			S.setId(idCha);
			this.addVisitor(S);;
		}
	}
	
	//add guide function
	public void addGuide(Guide S) {
		boolean b=false;
		int idCha;
		for(Guide g: this.arrayListGuide) {
			if(g.getId()==S.getId()) {b=true; break;}
			else b=false;
		}
		if(b==false) {this.arrayListGuide.add(S);}
		else if(b==true){
			System.out.println("the id is repeated! enter another id :");
			idCha=s.nextInt();
			S.setId(idCha);
			this.addGuide(S);
		}
	}
}
