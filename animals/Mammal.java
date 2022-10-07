package animals;

public abstract class Mammal {
	
	public int energy = 300;
	
	public int displayEnergy() {
		System.out.println("Energy Level: " + this.energy);
		return this.energy;
	}
	
	public void addEnergy(int change) {
		this.energy += change;
	}
}