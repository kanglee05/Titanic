package lab3;

public class Passenger 
{
	boolean survived;
	String ticketClass;
	String name;
	String sex;
	int age;
	int siblingsSpouse;
	int parentsChildren;
	String fare;
	
	public Passenger(boolean survived, String ticketClass, String name, String sex, int age, 
			int siblingsSpouse, int parentsChildren, String fare)
	{
		this.survived = survived;
		this.ticketClass = ticketClass;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.siblingsSpouse = siblingsSpouse;
		this.parentsChildren = parentsChildren;
		this.fare = fare;
	}
	public Passenger()
	{
		
	}
	// Getter for survived
	public boolean hasSurvived()
	{
		return survived;
	}
	// Setter for survived
	public void setSurvived(boolean survived)
	{
		this.survived = survived;
	}
	// Getter for ticketClass
	public String getTicketClass() 
	{
		return this.ticketClass;
	}
	// Setter for ticketClass
	public void setTicketClass(String ticketClass)
	{
		this.ticketClass = ticketClass;
	}
	// Getter for name
	public String getName()
	{
		return name;
	}
	// Setter for name
	public void setName(String name) 
	{
		this.name = name;
	}
	// Getter for sex
	public String getSex()
	{
		return sex;
	}
	// Setter for sex
	public void setSex(String sex) 
	{
		this.sex = sex;
	}
	// Getter for age
	public int getAge()
	{
		return age;
	}
	// Setter for age 
	public void setAge(int age)
	{
		this.age = age;
	}
	// Getter for siblingsSpouse
	public int getSiblingsSpouse()
	{
		return siblingsSpouse;
	}
	// Setter for siblingsSpouse
	public void setSiblingsSpouse(int siblingsSpouse)
	{
		this.siblingsSpouse = siblingsSpouse;
	}
	// Getter for parentsChildren
	public int getParentsChildren()
	{
		return parentsChildren;
	}
	// Setter for parentsChildren
	public void setParentsChildren(int parentsChildren)
	{
		this.parentsChildren = parentsChildren;
	}
	// Getter for fare
	public String getFare() 
	{
		return fare;
	}
	// Setter for fare
	public void setFare(String fare)
	{
		this.fare = fare;
	}
}
