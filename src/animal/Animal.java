package animal;


public interface Animal {
	
	default public boolean walk() {
		System.out.println("I am Animal. I cannot walk.");
		return false;
	}
	
	default public boolean fly() {
		System.out.println("I am Animal. I cannot fly.");
		return false;
	}
	
	default public boolean sing() {
		System.out.println("I am Animal. I cannot sing.");
		return false;
	}
}
