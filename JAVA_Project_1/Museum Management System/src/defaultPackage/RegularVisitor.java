package defaultPackage;

import java.sql.Date;

public class RegularVisitor extends Visitor{
	//constructors
	public RegularVisitor () { 	
		super();
		}
	//toString function
	public String toString() {
		return super.toString()+"\nRegular Visitor\nvId: "+this.getvId()+", recordId: "+this.getRecord_id()+
				", visits count: "+this.getVisits_count()+"\nvisits: "+this.visitorRecord.toString()+
				"\nLanguage: "+this.getVisitor_Language();
	}
	//make the discount
		Ticket t1;
		Date issueDate;
		public Date getIssueDate() {
			return issueDate;
		}
		public void setIssueDate(Date issueDate) {
			this.issueDate = issueDate;
		}
		Boolean WithOrWithoutGuide;
		@Override
		public void BookTour(){
			int tickgType;
			int tickptype;
			System.out.println(this.getName()+" ,do you want a multi time ticket or a one time ticket\n1)multi time ticket\n2)one time ticket");
			tickgType=s.nextInt();
			if(tickgType==1) {
				System.out.println("what's the ticket type that you want\n1)daily  2)monthly  3)yearly");
				tickptype=s.nextInt();
				if(tickptype==1) {
					t1= new MultiTimeTicket(TicketType.DAILY);
					t1.setVisitor(this);
					t1.setIssueDate(this.getIssueDate());
				}
				else if(tickptype==2) {
					t1=new MultiTimeTicket(TicketType.MONTHLY);
					t1.setVisitor(this);
					t1.setIssueDate(this.getIssueDate());
				}
				else if(tickptype==3) {
					t1=new MultiTimeTicket(TicketType.YEARLY);
					t1.setVisitor(this);
					t1.setIssueDate(this.getIssueDate());
				}

			}
			else if(tickgType==2) {
				t1=new OneTimeTicket();
				t1.setVisitor(this);
				t1.setIssueDate(this.getIssueDate());
			}
			System.out.print("\n"+this.getName()+", id= "+this.getId()+" booked tour--->ticket\n"+t1);
			int x;
			//guides
			System.out.println("\ndo you want to register with or without a guide?  1)with  2)without");
			x=s.nextInt();
			if(x==2) WithOrWithoutGuide=false;
			else if(x==1) {WithOrWithoutGuide=true;
			t1.setPrice(t1.getPrice()+100);
			System.out.println("ther will be an addition to the price + 100, it will change to "+t1.getPrice());
			}
		}
	
}
