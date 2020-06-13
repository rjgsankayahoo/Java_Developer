package fish;

import animal.Animal;

public class Fish implements Animal {
	
	@Override
	public boolean walk() {
		System.out.println("I am Fish. I cannot walk.");
		return false;
	}
	
	@Override
	public boolean swim() {
		System.out.println("I am Fish. I can swim.");
		return true;
	}
}
