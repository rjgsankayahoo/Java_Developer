package bird;

import bird.characteristics.Gender;
import bird.characteristics.Language;

public class Chicken extends Bird {

	private Gender gender;

	private Language language = Language.ENGLISH;

	public Chicken(Gender gender, Language language) {
		this.gender = gender;
		if (this.gender == Gender.MALE) {
			this.language = language;
		}
	}

	public Chicken() {
		this.gender = Gender.FEMALE;
	}

	@Override
	public boolean talk() {
		if (this.getGender() == Gender.MALE) {
			System.out.println("I am Rooster. I say "+language.getSound());
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
