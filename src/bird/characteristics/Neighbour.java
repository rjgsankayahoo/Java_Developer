package bird.characteristics;

public enum Neighbour {

	DOGS("I am Parrot staying near dogs. I say Woof, woof."), 
	CATS("I am Parrot staying near cats. I say Meow."),
	ROOSTER("I am Parrot staying near Rooster. I say Cock-a-doodle-doo."), 
	ALONE("I am Parrot. I live alone.");

	String say;

	Neighbour(String say) {
		this.say = say;
	}

	public String getSay() {
		return say;
	}

}
