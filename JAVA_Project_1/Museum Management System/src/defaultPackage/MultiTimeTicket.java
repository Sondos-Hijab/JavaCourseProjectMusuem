package defaultPackage;
public class MultiTimeTicket extends Ticket{
	public MultiTimeTicket() {
		super();
		if(type==TicketType.DAILY) this.setPrice(400);
		else if(type==TicketType.MONTHLY) this.setPrice(800);
		else if(type==TicketType.YEARLY) this.setPrice(1200);
	}
	public MultiTimeTicket(TicketType type) {
		super();
		this.type=type;
		if(type==TicketType.DAILY) this.setPrice(400);
		else if(type==TicketType.MONTHLY) this.setPrice(800);
		else if(type==TicketType.YEARLY) this.setPrice(1200);
	}
	TicketType type;
	public TicketType getType() {
		return type;
	}
	public void setType(TicketType type) {
		this.type = type;
	}
}
