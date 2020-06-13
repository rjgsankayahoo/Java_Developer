package others;

import org.junit.Assert;
import org.junit.Test;

public class TestButterfly {

	Butterfly butterfly = new Butterfly(3);
	Butterfly caterpillar = new Butterfly(12);

	@Test
	public void butterflyCannotWalk() {
		Assert.assertFalse(butterfly.walk());
	}
	
	@Test
	public void butterflyCannotTalk() {
		Assert.assertFalse(butterfly.talk());
	}
	
	@Test
	public void caterpillarCanWalk() {
		Assert.assertTrue(caterpillar.walk());
	}
	
	@Test
	public void butterflyCanFly() {
		Assert.assertTrue(butterfly.fly());
	}
	
	@Test
	public void caterpillarCannotFLy() {
		Assert.assertFalse(caterpillar.fly());
	}
	
	@Test
	public void caterpillarCannotTalk() {
		Assert.assertFalse(caterpillar.talk());
	}
}
