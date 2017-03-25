import sun.util.calendar.BaseCalendar.Date;

public interface Appointment {
	
	public void getOpeningTimes();
	
	public void getClosingTimes();
	
	public void getAppointmentDate(Date date);
	
	public void checkIfOpen();

}
