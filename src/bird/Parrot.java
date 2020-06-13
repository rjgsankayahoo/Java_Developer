package bird;

import bird.characteristics.Neighbour;

public class Parrot extends Bird {
	Neighbour neighbour;

	public Parrot(Neighbour neighbour) {
		this.neighbour = neighbour;
	}

	public Parrot() {
		this.neighbour = Neighbour.ALONE;
	}

	@Override
	public boolean talk() {
		System.out.println(this.getNeighbour().getSay());
		return true;
	}

	public Neighbour getNeighbour() {
		return neighbour;
	}

	public void setNeighbour(Neighbour neighbour) {
		this.neighbour = neighbour;
	}
}
