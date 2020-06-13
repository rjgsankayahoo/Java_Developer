package bird;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import bird.Bird;
public class TestChicken {

	Chicken chicken= new Chicken();
	
	@Test
	public void chickenCanTalk() {
		Assert.assertTrue(chicken.talk());
	}
	
	@Test
	public void chickenCannotFly() {
		Assert.assertFalse(chicken.fly());
	}
	
	@Test
	public void chickenCannotWalk() {
		Assert.assertTrue(chicken.walk());
	}
	
}
