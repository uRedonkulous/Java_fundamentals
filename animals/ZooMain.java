package animals;

public class ZooMain {
	
	public static void main(String[] args) {
		Gorilla nate = new Gorilla();
		nate.throwThings();
		nate.throwThings();
		nate.throwThings();
		nate.eatBananas();
		nate.eatBananas();
		nate.climb();
		nate.displayEnergy();
		Iguana charles = new Iguana(5, 51);
		charles.getInfo();
	}
}