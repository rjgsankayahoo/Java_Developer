package fish;

import fish.characteristics.FishCharacteristics;

public class ClownFish extends Fish implements FishCharacteristics {
	@Override
	public void size() {
		System.out.println("I am ClownFish. I am small.");
	}

	@Override
	public void color() {
		System.out.println("I am ClownFish. I am colorful.");
	}

	@Override
	public void makeJokes() {
		System.out.println("I am ClownFish. I make jokes.");
	}
}
