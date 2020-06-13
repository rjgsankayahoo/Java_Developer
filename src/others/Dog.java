package others;

import animal.Animal;

public class Dog implements Animal {

	@Override
	public boolean talk() {
		System.out.println("I am Dog. I say Woof woof.");
		return true;
	}
}
