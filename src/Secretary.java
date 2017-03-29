
public class Secretary extends Employee 
{
	public Secretary(int employeeID, String lastname, String firstname)
	{
		this.lastname = lastname;
		this.firstname = firstname;
		this.employeeID = employeeID;
	}
	
	public void registerCustomer(int customernr, String cuslastname, String cusfirstname, String streetname, int streetnumber, String zipcode, String city)
	{
		//Customer cus = 
		new Customer(customernr, cuslastname, cusfirstname, streetname, streetnumber, zipcode, city);
	}
	
	public void removeCustomer(Customer customer)
	{
		customer = null;
	}
	
	public void avTime()
	{
		// put their available times
		//Maybe should return date idk
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
}