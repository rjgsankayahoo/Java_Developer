package bird;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import bird.Bird;
import bird.characteristics.Gender;
public class TestChicken {

	Chicken chicken= new Chicken();
	Chicken rooster= new Chicken(Gender.MALE);
	
	@Test
	public void chickenCanTalk() {
		Assert.assertTrue(chicken.talk());
	}
	
	@Test
	public void chickenCannotFly() {
		Assert.assertFalse(chicken.fly());
	}
	
	@Test
	public void chickenCanWalk() {
		Assert.assertTrue(chicken.walk());
	}
	
	@Test
	public void roosterCanTalk() {
		Assert.assertTrue(rooster.talk());
	}
	
	@Test
	public void roosterCanFly() {
		Assert.assertTrue(rooster.fly());
	}
	
	@Test
	public void roosterCanWalk() {
		Assert.assertTrue(rooster.walk());
	}
	
}
