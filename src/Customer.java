import java.util.ArrayList;

public class Customer {

	private int customernr;
	private String lastname;
	private String firstname;
	private String streetname;
	private int streetnumber;
	private String zipcode;
	private String city;
	
	public Customer(int customernr, String lastname, String firstname, String streetname, int streetnumber, String zipcode, String city)
	{
		this.customernr = customernr;
		this.lastname = lastname;
		this.firstname = firstname;
		this.streetname = streetname;
		this.streetnumber = streetnumber;
		this.zipcode = zipcode;
		this.city = city;
	}
	
	public String getLastName()
	{
		return lastname;
	}
	
	public String getFirstName()
	{
		return firstname;
	}
	
	public int getCustomerNumber()
	{
		return customernr;
	}
	
	public String getStreetName()
	{
		return streetname;
	}
	
	public int getStreetNumber()
	{
		return streetnumber;
	}
	
	public String getZip()
	{
		return zipcode;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public String getAllInfo()
	{
		String allinfo = 
				"customer number = " + getCustomerNumber() + "\n"
				+ "Last name = " + getLastName() + "\n"
				+ "First name = " + getFirstName() + "\n"
				+ "Street name = " + getStreetName() + "\n"
				+ "Street number = " + getStreetNumber() + "\n"
				+ "Zip code = " + getZip() + "\n"
				+ "City = " + getCity();
		return allinfo;
	}

}
