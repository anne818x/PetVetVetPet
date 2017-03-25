import java.util.ArrayList;

public class Vet {
	
	private String name;
	private String description;
	private boolean open;
	private ArrayList<Customer> customers;
	private ArrayList<Pet> pets;
	private ArrayList<Employee> employees;
	
	public Vet(String name, String description)
	{
		this.name = name;
		this.description = description;
	}
	
	public String getAllCustomers()
	{
		return null;
	}
	
	public String getAllPets()
	{
		return null;
	}
	
	public String getAllEmployees()
	{
		return null;
	}
	
	public String PrintAllCustomers()
	{
		for (Customer customer : customers)
		{
			String first = customer.getFirstName();
			String last = customer.getLastName();
			return(first + " " + last);
		}
		return null;
	}
	
	public String PrintAllPets()
	{
		for (Pet pet : pets)
		{
			return(pet.getName());
		}
		return null;
	}
	
	public String PrintAllEmployees()
	{
		for (Employee employee : employees)
		{
			String first = employee.getFirstName();
			String last = employee.getLastName();
			return(first + " " + last);
		}
		return null;
	}
	
	public String FindCustomerPets(Customer customer)
	{
		for (Pet pet : pets)
		{
			if (pet.getOwner() == customer)
			{
				return(pet.getName());
			}
		}
		return null;
	}
}
