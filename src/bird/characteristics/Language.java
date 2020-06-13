package bird.characteristics;

public enum Language {
	ENGLISH("Cock-a-doodle-doo"),
	DANISH("kykyliky");
	 
	String sound;
	
	Language(String sound) {
		this.sound=sound;
	}

	public String getSound() {
		return sound;
	}
}
