package Mo;

public class Employee 
{

public Employee(int Id,String name,double salary)
{
	this.Id=Id;
	this.name=name;
	this.salary=salary;
}
	private int Id;
	
	public int getId()
	{
		return Id;
	}
	public void setId(int Id)
	{
		this.Id= Id;
	}
	private String name;
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	private double salary;
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	
}

