import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public abstract class Pet 
{
	protected String breed;
	protected int birthdate;
	protected String name;
	protected String description;
	protected String allergies;
	protected String medication;
	protected Customer owner;
	protected int petID;
	
	
	public Pet(String name, String breed, int birthdate, String description, String allergies, String medication, Customer owner, int petID)
	{
		this.name = name;
		this.birthdate = birthdate;
		this.breed = breed;
		this.description = description;
		this.allergies = allergies;
		this.medication = medication;
		this.owner = owner;
		this.petID = petID;
	}
	
	protected Pet()
	{
		
	}
	
	public String getBreed()
	{
		return breed;
	}
	
	public String currentTime()
	{
	    Calendar cal = Calendar.getInstance();
	    SimpleDateFormat sdf = new SimpleDateFormat("MM:YYYY");
	    String current = ( sdf.format(cal.getTime()).toString());
	    return current;
	}
	
	public double getAge()
	{
		double current = Double.parseDouble(currentTime());
		double age = current - birthdate;
		// i didnt test this
		return age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public String getAllergies()
	{
		return null;
	}
	
	public String getMedication()
	{
		return medication;
	}
	
	public Customer getOwner()
	{
		return owner;
	}
	
	public int getPetID()
	{
		return petID;
	}
	
	public void changeDescription(String description)
	{
		this.description = description;
	}
	
	public void changeAllergies(String allergies)
	{
		this.allergies = allergies;
	}
	
	public void changeMedication(String medication)
	{
		this.medication = medication;
	}
	
	public String getAllInfo()
	{
		String allinfo = 
				"pet ID = " + getPetID() + "\n"
				+ "Age = " + getAge() + "\n"
				+ "Name = " + getName() + "\n"
				+ "Description = " + getDescription() + "\n"
				+ "Street number = " + getAllergies() + "\n"
				+ "Zip code = " + getMedication() + "\n"
				+ "Owner = "
				+ getOwner().getFirstName() + " " + getOwner().getLastName();
		return allinfo;
	}
}
