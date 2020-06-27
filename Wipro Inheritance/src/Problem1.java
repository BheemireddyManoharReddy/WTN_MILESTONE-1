class Animal{
	void eat()
	{
		System.out.println("Animal eat flesh");
	}
	void sleep()
	{
		System.out.println("Animal sleep long time ");
	}
}
class Bird extends Animal
{
	void eat()
	{
		System.out.println("Birds eat Insects");
	}
	void sleep()
	{
		System.out.println("Birds sleep early");
	}
	void fly()
	{
		System.out.println("Birds flying high");
	}
}
public class Problem1 {
	public static void main(String... args) {
		Animal animal= new Animal();
		animal.eat();
		animal.sleep();
		Bird bird=new Bird();
		bird.eat();
		bird.fly();
		bird.sleep();
	}

}