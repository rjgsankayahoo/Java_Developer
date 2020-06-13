package fish.characteristics;

public interface FishCharacteristics {
	public void size();

	public void color();

	default public void makeJokes() {
		System.out.println("I am Fish. I do not make jokes");
	}

	default public void diet() {
		System.out.println("I am fish. I eat.");
	}
} 
