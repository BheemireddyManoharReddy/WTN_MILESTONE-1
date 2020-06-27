class Author
{
	String name,email;
	char gender;
	Author(String name,String email,char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
}
class Book
{
	private String name;
	private Author author = new Author("stephen hawking","sh@gmail.com",'M');
	 private double price;
	 private int qtyInStock;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return ("\n Author name: "+author.name+"\n email "+author.email+"\n Gender "+author.gender);
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	} 
}
public class Problem1 {
	public static void main(String... args) {
	Book b=new Book();
	b.setName("A Brief History of Time");
	b.setPrice(1200);
	b.setQtyInStock(1);
	System.out.println("Book name "+b.getName()+"\n"+"Book price "+b.getPrice()+" \n"+"Author details: "+b.getAuthor()+"\n"+"In Stock "+b.getQtyInStock());
}
	
	
	

}