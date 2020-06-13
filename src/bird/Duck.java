package bird;

public class Duck extends Bird {
	
	@Override
	public boolean talk() {
		System.out.println("I am Duck. I say Quack, quack");
		return true;
	}

	@Override
	public boolean swim() {
		System.out.println("I am Duck. I can swim");
		return true;
	}

}
