package bird;
import org.junit.Assert;
import org.junit.Test;
public class TestDuck {

	Bird duck= new Duck();
	
	@Test
	public void duckCannotTalk() {
		Assert.assertTrue(duck.talk());
	}
	
	@Test
	public void duckCanSwim() {
		Assert.assertTrue(duck.swim());
	}

}
