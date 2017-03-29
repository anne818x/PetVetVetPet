
public class Dog extends Pet {
	
	public Dog(String name, String breed, int birthdate, String description, String allergies, String medication, Customer owner, int petID)
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
	
	public String getBreed()
	{
		return breed;
	}
	
	public double getAge()
	{
		//calculation here
		return 0.1;
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
		return allergies;
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
}
