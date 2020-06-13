package fish;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import bird.Bird;

public class TestDolphin {

	Dolphin dolphin = new Dolphin();

	@Test
	public void dolphinCanSwim() {
		Assert.assertTrue(dolphin.swim());
	}

}
