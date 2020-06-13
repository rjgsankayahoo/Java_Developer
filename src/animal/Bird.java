package animal;


import animal.Animal;

public class Bird implements Animal{
	
	@Override
	public boolean fly() {
		System.out.println("I am Bird. I can fly.");
		return true;
	}
	
	@Override
	public boolean sing() {
		System.out.println("I am Bird. I can sing.");
		return true;
	}
}
