package defaultPackage;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;
public class Receptionist extends Employee{
	//toString
	public String toString() {
		return "Receptionist's name: "+this.getName()+"\nid:"+this.getId()+"\nDate of Birth: "+this.getDob()+"\nHire Date: "+this.getHireDate();
	}
	//states
	ArrayList<Guide> allGuides=new ArrayList <Guide>();
	public void addGuide(Guide G) {
		this.allGuides.add(G);
	}
	Scanner s=new Scanner(System.in);
	//constructor
	public Receptionist() {
		super();
	}
	//issueMultiTimeTicket
	public MultiTimeTicket issueMultiTimeTicket(Visitor v, Date issuedate) {
		MultiTimeTicket t=null;
		int tickptype;
		System.out.println("issue MultiTime Ticket: what's the ticket type that you want\n1)daily  2)monthly  3)yearly");
		tickptype=s.nextInt();
		if(tickptype==1) {
			t=new MultiTimeTicket(TicketType.DAILY);
			t.setIssueDate(issuedate);
			t.setVisitor(v);
			}
			else if(tickptype==2) {
			t=new MultiTimeTicket(TicketType.MONTHLY);
			t.setIssueDate(issuedate);
			}
			else if(tickptype==3) {
			t=new MultiTimeTicket(TicketType.YEARLY);
			t.setIssueDate(issuedate);
			t.setVisitor(v);
			}
		return t;
		
	}
	//issueOneTimeTicket
	public OneTimeTicket issueOneTimeTicket(Visitor v, Date issuedate) {
		System.out.println("issue OneTime Ticket");
		OneTimeTicket t=new OneTimeTicket();
		t.setIssueDate(issuedate);
		t.setVisitor(v);
		return t;
	}
	//available guide
	public ArrayList<Guide> getAvailableGuides(Visitor v) {
		ArrayList <Guide> AvaiGuides=new ArrayList <Guide>();
		MuseumWorkingDays tourDay=v.getTourDay();
		for(Guide guide: allGuides) {
			for(MuseumWorkingDays workingDay: guide.getWorkingdays()) {
				if(workingDay.equals(tourDay)){
					for(Languages lang:guide.getLanguage())
						if(v.getVisitor_Language()==lang)
							AvaiGuides.add(guide);
				}
			}
		}
	//	System.out.println("Here are the available guides:");
	//	for(Guide guide: AvaiGuides) {
	//		System.out.print(guide);
	//		System.out.println();
	//	}
		
		return AvaiGuides;		
	}
	//choose the guide for the visitor
	public Guide chooseGuide(Visitor v, ArrayList<Guide> availableGuides) {
		int x=1;
		int number;
		int y = 0;
		System.out.println("\nChoose from those available guides:\n");
		for(Guide guide: availableGuides) {
			System.out.print(x+") ");
			System.out.print(guide);
			System.out.println();
			x++;
		}
		System.out.println("choose a number\n");
		number=s.nextInt();
		for(int i=0;i<availableGuides.size();i++) {
			if(number-1==i)  {y=i; break;}
		}
		v.setVisitor_guide(availableGuides.get(y));
		System.out.println("choosen guide: "+v.getVisitor_guide()+"\n");
		return availableGuides.get(y);
	}
	//register sub
	public Subscription registerSubs(Visitor v,Ticket t) {
		ArrayList <Guide> avaiGuides=new ArrayList<Guide>();
		Guide choosenGuide=new Guide();
		int x;
		Subscription sub = null;
		System.out.println("do you want to register with or without a guide?  1)with  2)without");
		x=s.nextInt();
		if(x==2)
			{sub = new Subscription(v,t,null);
			}
		else if(x==1)
		{
			avaiGuides=this.getAvailableGuides(v);
			choosenGuide=this.chooseGuide(v, avaiGuides);
			sub=new Subscription(v,t,choosenGuide);
		}
		return sub;
	}
	//edit sub
	public Subscription ediSubs (Subscription sub,Visitor v, Ticket t, Guide g) {
		sub.setV(v);
		sub.setT(t);
		sub.setG(g);
		return sub;
	}
	//delete sub
	public Subscription deleteSub(Subscription sub) {
		sub=null;
		System.gc();
		return sub;
	}
	


}
