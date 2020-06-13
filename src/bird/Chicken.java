package bird;

import bird.characteristics.Gender;

public class Chicken extends Bird {

	private Gender gender;

	public Chicken(Gender gender) {
		this.gender = gender;
	}

	public Chicken() {
		this.gender = Gender.FEMALE;
	}

	@Override
	public boolean talk() {
		if (this.getGender() == Gender.MALE) {
			System.out.println("I am Rooster. I say Cock-a-doodle-doo.");
		} else {
			System.out.println("I am Chicken. I say Cluck, cluck.");
		}
		return true;
	}

	@Override
	public boolean fly() {
		if (this.getGender() == Gender.MALE) {
			System.out.println("I am Rooster. I can fly.");
			return true;
		} else {
			System.out.println("I am Chicken. I cannot fly.");
			return false;
		}
	}

	public Gender getGender() {
		return gender;
	}

}
