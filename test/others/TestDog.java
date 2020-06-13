package others;

import org.junit.Assert;
import org.junit.Test;

public class TestDog {

	@Test
	public void dogCanTalk() {
		Dog dog = new Dog();
		Assert.assertTrue(dog.talk());
	}
}
