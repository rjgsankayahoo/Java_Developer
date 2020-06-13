package others;

import org.junit.Assert;
import org.junit.Test;

public class TestCat {

	@Test
	public void catCanTalk() {
		Cat cat = new Cat();
		Assert.assertTrue(cat.talk());
	}

}
