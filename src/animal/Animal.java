package animal;


public interface Animal {
	
	default public boolean walk() {
		System.out.println("I am Animal. I can walk.");
		return true;
	}
	
	default public boolean fly() {
		System.out.println("I am Animal. I cannot fly.");
		return false;
	}
	
	default public boolean sing() {
		System.out.println("I am Animal. I cannot sing.");
		return false;
	}
	
	default public boolean talk() {
		System.out.println("I am Animal. I cannot talk.");
		return false;
	}
	
	default public boolean swim() {
		System.out.println("I am Animal. I cannot swim.");
		return false;
	}
}
