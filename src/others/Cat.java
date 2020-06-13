package others;

import animal.Animal;

public class Cat implements Animal {

	@Override
	public boolean talk() {
		System.out.println("I am Cat. I say Meow.");
		return true;
	}

}