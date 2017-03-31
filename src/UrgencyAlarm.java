
public class UrgencyAlarm implements AlarmSubject {

	private Pet pet;
	private boolean emergency = false;
	private int heartbeat;
	private int bloodpressure;
	private int temperature;
	private int respiratoryrate;
	private String emergencyconsult;
	String description;
	
	
	
	public UrgencyAlarm(Pet pet)
	{
		this.pet = pet;
		heartbeat = 100;
		bloodpressure = 80;
		temperature = 38;
		respiratoryrate = 22;
	}
	
	public void simulateEmergency()
	{
		bloodpressure = 60;
	}
	
	public void checkHeartBeat()
	{
		if (heartbeat < 50 || heartbeat > 150)
		{
			emergency = true;
			description = "HEART BEAT!";
			notifyObservers();
		}
	}
	
	public void checkTemperature()
	{
		if (temperature < 37 || temperature > 40)
		{
			emergency = true;
			description = "TEMPERATURE!";
			notifyObservers();
		}
	}
	
	public void checkBloodPressure()
	{
		if (bloodpressure < 70 || bloodpressure > 90)
		{
			emergency = true;
			description = "BLOOD PRESSURE!";
			notifyObservers();
		}
	}
	
	public void checkRespiratoryRate()
	{
		if (respiratoryrate < 10 || respiratoryrate > 35)
		{
			emergency = true;
			description = "BREATHING!";
			notifyObservers();
		}
	}
	
	public void checkForEmergencies()
	{
		while (emergency == false)
		{
			checkRespiratoryRate();
			checkBloodPressure();
			checkTemperature();
			checkHeartBeat();
		}
	}
	
	public void emergencyConsult()
	{
		//
		notifyObservers();
	}

	@Override
	public void registerObserver(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObserver(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObservers() 
	{
		String des = description;
	}
		
		
	
	
	
}