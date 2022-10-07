package animals;

public class Iguana extends Reptile{
	private int age;
	private int tailLength;
	
	public Iguana() {}
	public Iguana(int age, int tail) {
		this.age = age;
		this.tailLength = tail;
	}
	
	public void bite(String name) {
		System.out.println(String.format("The Iguana bites %s REALLY HARD! OUCH!", name));
	}
	
	public void hiss() {
		System.out.println(String.format("The Iguana hisses loudly"));
	}
	
	public void getInfo() {
		System.out.println(String.format("The Iguana is %s years old", age));
		System.out.println(String.format("The Iguana's tail is %s cm long", tailLength));
		System.out.println(String.format("The Iguana's energy level is %s", this.getEnergy()));
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getTailLength() {
		return tailLength;
	}
	
	public void setTailLength(int tailLength) {
		this.tailLength = tailLength;
	}
}
