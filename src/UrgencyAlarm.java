
public class UrgencyAlarm implements AlarmSubject {

	private boolean emergency = false;
	private int heartbeat;
	private int bloodpressure;
	private int temperature;
	private int respiratoryrate;
	private String emergencyconsult;
	String description;
	
	public UrgencyAlarm()
	{
		
	}
	
	public void heartBeatEmergency()
	{
		if (heartbeat < 50 || heartbeat > 150)
		{
			emergency = true;
			description = "HEART BEAT!";
		}
	}
	
	public void temperatureEmergency()
	{
		if (temperature < 37 || temperature > 40)
		{
			emergency = true;
			description = "TEMPERATURE!";
		}
	}
	
	public void bloodPressureEmergency()
	{
		if (bloodpressure < 70 || bloodpressure > 90)
		{
			emergency = true;
			description = "BLOOD PRESSURE!";
		}
	}
	
	public void respiratoryRateEmergency()
	{
		if (respiratoryrate < 10 || respiratoryrate > 35)
		{
			emergency = true;
			description = "BREATHING!";
		}
	}
	
	public void emergencyConsult()
	{
		//
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
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}
	
	
}