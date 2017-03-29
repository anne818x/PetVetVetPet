
public class Payment {

	private int invoiceID;
	private int amount;
	private String description;
	
	public Payment(int invoiceID, int amount, String description)
	{
		this.invoiceID = invoiceID;
		this.amount = amount;
		this.description = description;
	}
	
	public int getInvoiceID()
	{
		return invoiceID;
	}
	
	public int getAmount()
	{
		return amount;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public String getFullInvoice()
	{
		String fullinvoice = "ID= " + getInvoiceID() + " \n Amount = " + getAmount() + "\n Description = " + getDescription();
		return fullinvoice;
	}
}
