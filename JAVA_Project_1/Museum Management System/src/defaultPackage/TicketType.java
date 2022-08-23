package defaultPackage;

public enum TicketType {
	DAILY("DAILY"),MONTHLY("MONTHLY"),YEARLY("YEARLY");
	TicketType(String type){this.type=type;}
	private final String type;
	public String getType() {
		return type;
	} 
	
}
