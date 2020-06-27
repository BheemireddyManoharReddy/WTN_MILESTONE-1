class Shape
{
	void draw()
	{
		System.out.println("Drawing the Shape");
	}
	void erase()
	{
		System.out.println("Erasing the Shape");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing the Circle");
	}
	void erase()
	{
		System.out.println("Erasing the  Circle");
	}
	
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing the  Triangle");
	}
	void erase()
	{
		System.out.println("Erasing the Triangle");
	}
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("Drawing the  Square");
	}
	void erase()
	{
		System.out.println("Erasing the  Square");
	}
}
public class Problem2 {
	public static void main(String... args) {
		Shape cir=new Circle();
		cir.draw();
		cir.erase();
		Shape tri=new Triangle();
		tri.draw();
		tri.erase();
		Shape sq=new Square();
		sq.draw();
		sq.erase();
	}

}