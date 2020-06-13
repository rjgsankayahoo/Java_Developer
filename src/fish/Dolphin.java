package fish;

import animal.Animal;

public class Dolphin implements Animal {
	
	@Override
	public boolean swim() {
		System.out.println("I am Dolphin. I can swim.");
		return true;
	}
}
