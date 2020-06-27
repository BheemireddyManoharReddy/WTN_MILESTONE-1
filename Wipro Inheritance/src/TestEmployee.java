class Person
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
class Employee extends Person
{
	public double getAnnual_salary() {
		return annual_salary;
	}
	public void setAnnual_salary(double annual_salary) {
		this.annual_salary = annual_salary;
	}
	public int getStartedYear() {
		return startedYear;
	}
	public void setStartedYear(int startedYear) {
		this.startedYear = startedYear;
	}
	public String getInsurance_number() {
		return insurance_number;
	}
	public void setInsurance_number(String insurance_number) {
		this.insurance_number = insurance_number;
	}
	private double annual_salary;
	private int startedYear;
	private String insurance_number;
	
	}
public class TestEmployee {
	public static void main(String... args) {
		Person person=new Person();
		person.setName("Manohar");
		Employee emp=new Employee();
		emp.setStartedYear(2020);
		emp.setInsurance_number("mr2022");
		emp.setAnnual_salary(700000);
		System.out.println("name : "+person.getName()+" salary : "+emp.getAnnual_salary()+" started year: "+emp.getStartedYear()+" insuranceid "+emp.getInsurance_number());
	}
}