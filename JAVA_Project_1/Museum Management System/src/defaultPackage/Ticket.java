package defaultPackage;

import java.sql.Date;

public class Ticket {
	//constructor
	public Ticket() {}
	public Ticket (Date issueDate,double price, Visitor visitor) {
		this.issueDate=issueDate;
		this.price=price;
		this.visitor=visitor;
		}
	//states
	private Date issueDate;
	private double price;
	private Visitor visitor;
	//getters and setters
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setVisitor(Visitor v) {
		this.visitor=v;
	}
	public Visitor getVisitor() {
		return visitor;
	}
	//toString function
	public String toString() {
		return "Ticket, issue date: "+this.getIssueDate()+" price:"+this.getPrice();
	}
	
}
