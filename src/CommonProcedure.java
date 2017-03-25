import sun.util.calendar.BaseCalendar.Date;

public class CommonProcedure implements Appointment {

	private Date starttime;
	private Date endttime;
	private Employee employee;
	private Customer customer;
	private Pet pet;
	private enum commonprocedures 
	{
	    Castration, Vaccination, Nails, Grooming,
	    Euthanize
	}
	
	
	public CommonProcedure(Customer customer, Pet pet)
	{
		this.customer = customer;
		this.pet = pet;
		
		// calculate which employee and which times????
	}
	
	@Override
	public void getOpeningTimes() {
		// TODO Auto-generated method stub
		// common procedure so regular opening times
		// emergency will have like 24/7
		
	}

	@Override
	public void getClosingTimes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAppointmentDate(Date date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkIfOpen() {
		// TODO Auto-generated method stub
		
	}

}
