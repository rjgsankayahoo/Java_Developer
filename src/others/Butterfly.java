package others;

import animal.Animal;

public class Butterfly implements Animal {

	private Integer age;

	private final Integer METAMORPHOSIS_AGE = 10;

	public Butterfly(int age) {
		this.age = age;
	}
 
	@Override
	public boolean fly() {
		if (this.getAge() > METAMORPHOSIS_AGE) {
			return Animal.super.fly();
		} else {
			System.out.println("I am Butterfly. I can fly.");
			return true;
		}
	}

	@Override
	public boolean walk() {
		if (this.getAge() > METAMORPHOSIS_AGE) {
			System.out.println("I am Caterpillar. I can walk");
			return true;
		} else {
			System.out.println("I am Butterfly. I cannot walk");
			return false;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
