package animal;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import animal.Bird;
public class TestBird {

	@Test
	public void birdCannotWalk() {
		Bird bird= new Bird();
		Assert.assertFalse(bird.walk());
	}
	
	@Test
	public void birdCanSing() {
		Bird bird= new Bird();
		Assert.assertTrue(bird.sing());
	}
	
	@Test
	public void birdCanFly() {
		Bird bird= new Bird();
		Assert.assertTrue(bird.fly());
	}

}
