class Fruit
{
	String name,taste;
	int size;
	void eat()
	{
		System.out.println("name "+name+" taste "+taste+" size "+size);
	}
}
class Apple extends Fruit
{
	void eat()
	{
		System.out.println("apple tast soure size 10 cm");
	}
}
class Orange extends Fruit
{
	void eat()
	{
		System.out.println("Orange tast bitter size 10 cm");
	}
}
public class Problem1 {
	public static void main(String... args) {
	Apple apple =new Apple();
	Orange orange=new Orange();
	apple.eat();
	orange.eat();
	Fruit fruit= new Fruit();
	fruit.name="gova";
	fruit.size=10;
	fruit.taste="nice";
	fruit.eat();
}
}