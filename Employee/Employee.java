


public abstract class Employee implements AlarmObserver{

	protected String lastname;
	protected String firstname;
	protected int employeeID;
	protected boolean currentavailability = true;
	
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
		currentavailability = false;
	}
	
	public int getEmployeeID()
	{
		return employeeID;
	}
	
	public String getLastName()
	{
		return lastname;
	}
	
	public boolean getAvailability()
	{
		return currentavailability;
	}
	
	public String getFirstName()
	{
		return firstname;
	}
	
	public void avTime()
	{
		
	}
	
	public String getAllInfo()
	{
		String allinfo = 
				"EmployeeID = " + getEmployeeID() + "\n"
				+ "Last name = " + getLastName() + "\n"
				+ "First name = " + getFirstName() + "\n"
				+ "Available? = " + getAvailability();
		return allinfo;
	}
	
	
	
}