package animals;

public class Gorilla extends Mammal {
	
	public Gorilla() {}
	
	public void throwThings() {
		this.addEnergy(-5);
		System.out.println("The Gorilla is throwing things");
	}
	
	public void eatBananas() {
		this.addEnergy(10);
		System.out.println("The Gorilla eats some bananas");
	}
	
	public void climb() {
		this.addEnergy(-10);
		System.out.println("The Gorilla climbs all over the place");
	}
}