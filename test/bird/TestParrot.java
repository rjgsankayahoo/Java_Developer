package bird;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import bird.Bird;
import bird.characteristics.Gender;
import bird.characteristics.Neighbour;

public class TestParrot {

	Parrot parrot_cats = new Parrot(Neighbour.CATS);
	Parrot parrot_dogs = new Parrot(Neighbour.DOGS);
	Parrot parrot_rooster = new Parrot(Neighbour.ROOSTER);
	Parrot parrot = new Parrot();

	@Test
	public void parrotCanTalk() {
		Assert.assertTrue(parrot_cats.talk());
		Assert.assertTrue(parrot_dogs.talk());
		Assert.assertTrue(parrot_rooster.talk());
		Assert.assertTrue(parrot.talk());
	}

	@Test
	public void parrotTalk() {
		Assert.assertEquals("I am Parrot staying near cats. I say Meow.", parrot_cats.getNeighbour().getSay());
		Assert.assertEquals("I am Parrot staying near dogs. I say Woof, woof.", parrot_dogs.getNeighbour().getSay());
		Assert.assertEquals("I am Parrot staying near Rooster. I say Cock-a-doodle-doo.",
				parrot_rooster.getNeighbour().getSay());
		Assert.assertEquals("I am Parrot. I live alone.", parrot.getNeighbour().getSay());
	}
}
