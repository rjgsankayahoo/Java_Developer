package fish;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import bird.Bird;

public class TestFish {

	Fish fish = new Fish();

	@Test
	public void fishCannotWalk() {
		Assert.assertFalse(fish.walk());
	}

	@Test
	public void fishCanSwim() {
		Assert.assertTrue(fish.swim());
	}

}
