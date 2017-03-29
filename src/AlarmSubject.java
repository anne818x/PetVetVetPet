
public interface AlarmSubject {
	
	public void registerObserver(Employee employee);
	
	public void removeObserver(Employee employee);
	
	public void notifyObservers();

}
