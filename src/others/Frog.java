package others;

import animal.Animal;

public class Frog implements Animal {

	@Override
	public boolean talk() {
		System.out.println("I am Frog. I say Croak Croak.");
		return true;
	}
}