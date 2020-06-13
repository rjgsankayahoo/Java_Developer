package bird;


public class Chicken extends Bird{
	
	@Override
	public boolean talk() {
		System.out.println("I am Chicken. I say Cluck, cluck.");
		return true;
	}

	@Override
	public boolean fly() {
		System.out.println("I am Chicken. I cannot fly");
		return false;
	}
}
