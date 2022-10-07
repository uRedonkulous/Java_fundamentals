package animals;

public class Reptile {
	private int energy = 50;
	
	public int getEnergy() {
		return this.energy;
	}
	
	public void addEnergy(int change) {
		this.energy += change;
	}
}
