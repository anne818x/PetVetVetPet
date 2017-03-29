
public abstract class Employee implements AlarmObserver{

	protected String lastname;
	protected String firstname;
	protected int employeeID;
	protected boolean availability = true;
	
	public Employee(int employeeID, String lastname, String firstname)
	{
		this.lastname = lastname;
		this.firstname = firstname;
		this.employeeID = employeeID;
	}
	
	public Employee()
	{
		
	}
	
	public void work()
	{
		availability = false;
	}
	
	public String getLastName()
	{
		return lastname;
	}
	
	public String getFirstName()
	{
		return firstname;
	}
	
	public void avTime()
	{
		
	}
	
	
	
}