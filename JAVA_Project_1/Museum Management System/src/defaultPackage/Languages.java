package defaultPackage;

public enum Languages {
	ARABIC("ARABIC"),ENGLISH("ENGLISH"),FRENCH("FRENCH");
	Languages(String language){this.language=language;}
	private final String language;
	public String getLanguage() {
		return language;
	} 
	
}