package animals;

public class Bat extends Mammal{
	
	public Bat() {}

	public void fly() {
		this.addEnergy(-50);
		System.out.println("The Bat extends its wings and takes off into the sky.");
	}
	
	public void eatHumans() {
		this.addEnergy(25);
	}
	
	public void attackTown() {
		this.addEnergy(-100);
		System.out.println("Sounds of fire and screams come from a town!");
	}
	
	public void getInfo() {
		System.out.println(String.format("The Bat's energy level is %s", this.displayEnergy()));
	}
}
