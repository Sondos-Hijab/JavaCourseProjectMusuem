package defaultPackage;

public enum MuseumWorkingDays {
	SATURDAY("SATURDAY"),SUNDAY("SUNDAY"),MONDAY("MONDAY"),TUESDAY("TUESDAY"),WEDNESDAY("WEDNESDAY"),THURSDAY("THURSDAY"),FRIDAY("FRIDAY");
	MuseumWorkingDays(String day){this.day=day;}
	public String getDay() {
		return day;
	}
	private final String day; 

}
