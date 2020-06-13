package fish;

import fish.characteristics.FishCharacteristics;

public class Shark extends Fish implements FishCharacteristics {
	
	@Override
	public void size() {
		System.out.println("I am Shark. I am large.");
	}

	@Override
	public void color() {
		System.out.println("I am Shark. I am grey in color.");
	}

	@Override
	public void diet() {
		System.out.println("I am Shark. I eat other fishes.");
	}
}
