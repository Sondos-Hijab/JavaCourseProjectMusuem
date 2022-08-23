package defaultPackage;

public class Subscription {
	public Subscription() {}
	public Subscription(Visitor v,Ticket t,Guide g) {
		this.v=v;
		this.t=t;
		this.g=g;
	}
	Visitor v;
	Ticket t;
	Guide g;
	public Visitor getV() {
		return v;
	}
	public void setV(Visitor v) {
		this.v = v;
	}
	public Ticket getT() {
		return t;
	}
	public void setT(Ticket t) {
		this.t = t;
	}
	public Guide getG() {
		return g;
	}
	public void setG(Guide g) {
		this.g = g;
	}
	public String toString() {
		return "\nSubscription for visitor:"+this.getV().getName()+" ticket:"+this.getT().getIssueDate()+" guide: "+this.getG().getName();
	}

}
