package main;

import animal.Animal;
import bird.Bird;
import bird.Chicken;
import bird.Duck;
import bird.Parrot;
import bird.characteristics.Gender;
import bird.characteristics.Neighbour;
import fish.ClownFish;
import fish.Dolphin;
import fish.Fish;
import fish.Shark;
import others.Butterfly;
import others.Cat;
import others.Dog;
import others.Frog;

public class Solution {
	public static void main(String[] args) {
		Integer numberOfAnimalsThatCanFly = 0, numberOfAnimalsThatCanSing = 0, numberOfAnimalsThatCanWalk = 0,
				numberOfAnimalsThatCanSwim = 0, numberOfAnimalsThatCanTalk = 0;

		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(Gender.FEMALE),
				new Chicken(Gender.MALE), new Parrot(), new Parrot(Neighbour.DOGS), new Fish(),
				new Shark(), new ClownFish(), new Dolphin(), new Frog(), new Dog(), new Butterfly(3), new Cat() };

		for (Animal animal : animals) {
			if (animal.fly()) {
				numberOfAnimalsThatCanFly++;
			}
			if (animal.walk()) {
				numberOfAnimalsThatCanWalk++;
			}
	 		if (animal.sing()) {
				numberOfAnimalsThatCanSing++;
			}
			if (animal.swim()) {
				numberOfAnimalsThatCanSwim++;
			}
			if (animal.talk()) {
				numberOfAnimalsThatCanTalk++;
			}
		}
 
		System.out.println("Animals that can fly: " + numberOfAnimalsThatCanFly);
		System.out.println("Animals that can walk: " + numberOfAnimalsThatCanWalk);
		System.out.println("Animals that can sing: " + numberOfAnimalsThatCanSing);
		System.out.println("Animals that can swim: " + numberOfAnimalsThatCanSwim);
		System.out.println("Animals that can talk: " + numberOfAnimalsThatCanTalk);
	}
}
