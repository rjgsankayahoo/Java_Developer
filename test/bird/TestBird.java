package bird;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import bird.Bird;

public class TestBird {

	Bird bird = new Bird();

	@Test
	public void birdCanWalk() {
		Assert.assertTrue(bird.walk());
	}

	@Test
	public void birdCanSing() {
		Assert.assertTrue(bird.sing());
	}

	@Test
	public void birdCanFly() {
		Assert.assertTrue(bird.fly());
	}

	@Test
	public void birdCannotSwim() {
		Assert.assertFalse(bird.swim());
	}

	@Test
	public void birdCannotTalk() {
		Assert.assertFalse(bird.talk());
	}
}
