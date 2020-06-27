import java.util.*;
public class Box {
	int length,width,depth;// Parameters
	Box(int length,int width,int depth)//Box is an constructor 
	{
		this.length=length;
		this.width=width;
		this.depth=depth;
	}
	double volume;
	double volume()
	{
		volume=length*width*depth;
		return volume;
	}
	public static void main(String... args)  {
		//creating an object for the box class
		Box box=new Box(10,20,30);
		//calling the method through object  to print the volume 
		System.out.println(box.volume());
	}
}