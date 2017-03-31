import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Button;
import java.awt.Component;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;

public class GUI {

	private JFrame frame;
	private JTextField cusnrField;
	private JTextField lnameField;
	private JTextField fnameField;
	private JTextField streetnameField;
	private JLabel lblLastName;
	private JLabel lblFirstName;
	private JLabel lblStreetName;
	private JTextField streetnrField;
	private JLabel lblStreetNumber;
	private JTextField zipField;
	private JLabel lblZipCode;
	private JTextField cityField;
	private JLabel lblCity;
	private JLabel lblAllergies;
	private JLabel lblMedication;
	private JTextField medicationField;
	private JTextField descriptionField;
	private JTextField allergiesField;
	private JLabel lblAllergies_1;
	private JTextField ownerField;
	private JLabel lblOwner;
	private JLabel lblAge;
	private JTextField bdateField;
	private JTextField nameField;
	private JLabel lblName;
	private JLabel lblPetId;
	private JList customerList;
	private List<Customer> cuslist;
	private List<Pet> petlist;
	private List<Employee> emplist;
	private JLabel lblBreed;
	private JTextField breedField;
	private Vet vet;
	private JTextField petIDField;
	private JRadioButton catRBtn;
	private JRadioButton RabbitRBtn;
	private JRadioButton dogRBtn;
	private JTextArea InfoTextArea;
	private Button petInfoBtn;
	private JList petList;
	private Button getEmployeeInfoBtn;
	private JButton button;
	private JTextField employeeIDField;
	private JTextField emplnameField;
	private JTextField empfnameField;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JList employeeList;
	private JRadioButton NurseRBtn;
	private JRadioButton SecretaryRBtn;
	private JRadioButton SurgeonRBtn;
	private JRadioButton DoctorRBtn;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		cuslist = new LinkedList<Customer>();
		petlist = new LinkedList<Pet>();
		emplist = new LinkedList<Employee>();
		vet = new Vet("VetPet", "A nice Vet!");
		initialize();	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1197, 711);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Button addCustomerBtn = new Button("Add customer");
		addCustomerBtn.setActionCommand("Add Customer");
		addCustomerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int cusnr = Integer.parseInt((cusnrField).getText());
				String lname = lnameField.getText();
				String fname = fnameField.getText();
				String streetname = streetnameField.getText();
				int streetnr = Integer.parseInt(streetnrField.getText());
				String zip = zipField.getText();
				String city = cityField.getText();
				
				Customer cus = new Customer(cusnr, lname, fname, streetname, streetnr, zip, city);
				cuslist.add(cus);
				customerList.setListData(cuslist.toArray());
				
				//Cat cat = new Cat("Kitty", "Persian", 2015, "A good cat", "none", "none", cus, 001);
				//cus.getCustomerName();
				//cus.addPet(cat);
				//cat.getName();
				
			}
		});
		
		JButton addPetBtn = new JButton("Add pet");
		addPetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Customer select = (Customer) customerList.getSelectedValue();
				ownerField.setText(select.toString());
				int petID = Integer.parseInt(petIDField.getText());
				String name = nameField.getText();
				String breed = breedField.getText();
				int date = Integer.parseInt(bdateField.getText());
				String description = descriptionField.getText();
				String allergies = allergiesField.getText();
				String medication = medicationField.getText();
				
				if (catRBtn.isSelected())
				{
					Pet animal = new Cat(name, breed, date, description, allergies, medication, select, petID);
					petlist.add(animal);
				}
				if (dogRBtn.isSelected())
				{
					Pet animal = new Dog(name, breed, date, description, allergies, medication, select, petID);
					petlist.add(animal);
				}
				if (RabbitRBtn.isSelected())
				{
					Pet animal = new Rabbit(name, breed, date, description, allergies, medication, select, petID);
					petlist.add(animal);
				}
				
				
				petList.setListData(petlist.toArray());
				
			}
		});
		
		button = new JButton("Add employee");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int employeeID = Integer.parseInt(employeeIDField.getText());
				String lname = emplnameField.getText();
				String fname = empfnameField.getText();
				
				if (NurseRBtn.isSelected())
				{
					Employee emp = new Nurse(employeeID, lname, fname);
					emplist.add(emp);
				}
				if (SurgeonRBtn.isSelected())
				{
					Employee emp = new Surgeon(employeeID, lname, fname);
					emplist.add(emp);
				}
				if (DoctorRBtn.isSelected())
				{
					Employee emp = new Doctor(employeeID, lname, fname);
					emplist.add(emp);
				}
				if (SecretaryRBtn.isSelected())
				{
					Employee emp = new Secretary(employeeID, lname, fname);
					emplist.add(emp);
				}
				
				
				employeeList.setListData(emplist.toArray());
			}
		});
		
		Button cusInfoBtn = new Button("get customer info");
		cusInfoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Customer select = (Customer) customerList.getSelectedValue();
				InfoTextArea.setText(select.getAllInfo());
			}
		});
		
		petInfoBtn = new Button("get pet info");
		petInfoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Pet select = (Pet) petList.getSelectedValue();
				InfoTextArea.setText(select.getAllInfo());
			}
		});
		
		getEmployeeInfoBtn = new Button("get employee info");
		getEmployeeInfoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Employee select = (Employee) employeeList.getSelectedValue();
				InfoTextArea.setText(select.getAllInfo());
			}
		});
		
		
		addCustomerBtn.setBounds(9, 266, 87, 22);
		frame.getContentPane().add(addCustomerBtn);
		
		cusnrField = new JTextField();
		cusnrField.setBounds(10, 35, 42, 20);
		frame.getContentPane().add(cusnrField);
		cusnrField.setColumns(10);
		
		lnameField = new JTextField();
		lnameField.setColumns(10);
		lnameField.setBounds(10, 66, 86, 20);
		frame.getContentPane().add(lnameField);
		
		fnameField = new JTextField();
		fnameField.setColumns(10);
		fnameField.setBounds(10, 97, 86, 20);
		frame.getContentPane().add(fnameField);
		
		streetnameField = new JTextField();
		streetnameField.setColumns(10);
		streetnameField.setBounds(10, 128, 86, 20);
		frame.getContentPane().add(streetnameField);
		
		JLabel lblNewLabel = new JLabel("Customer number");
		lblNewLabel.setBounds(78, 38, 95, 14);
		frame.getContentPane().add(lblNewLabel);
		
		lblLastName = new JLabel("Last name");
		lblLastName.setBounds(106, 69, 87, 14);
		frame.getContentPane().add(lblLastName);
		
		lblFirstName = new JLabel("First name");
		lblFirstName.setBounds(104, 100, 69, 14);
		frame.getContentPane().add(lblFirstName);
		
		lblStreetName = new JLabel("Street name");
		lblStreetName.setBounds(106, 131, 87, 14);
		frame.getContentPane().add(lblStreetName);
		
		streetnrField = new JTextField();
		streetnrField.setColumns(10);
		streetnrField.setBounds(10, 159, 86, 20);
		frame.getContentPane().add(streetnrField);
		
		lblStreetNumber = new JLabel("Street number");
		lblStreetNumber.setBounds(106, 162, 87, 14);
		frame.getContentPane().add(lblStreetNumber);
		
		zipField = new JTextField();
		zipField.setColumns(10);
		zipField.setBounds(10, 190, 42, 20);
		frame.getContentPane().add(zipField);
		
		lblZipCode = new JLabel("Zip Code");
		lblZipCode.setBounds(106, 193, 87, 14);
		frame.getContentPane().add(lblZipCode);
		
		cityField = new JTextField();
		cityField.setColumns(10);
		cityField.setBounds(10, 221, 86, 20);
		frame.getContentPane().add(cityField);
		
		lblCity = new JLabel("City");
		lblCity.setBounds(106, 224, 87, 14);
		frame.getContentPane().add(lblCity);
		
		lblAllergies = new JLabel("Description");
		lblAllergies.setBounds(478, 223, 87, 14);
		frame.getContentPane().add(lblAllergies);
		
		lblMedication = new JLabel("Medication");
		lblMedication.setBounds(478, 254, 87, 14);
		frame.getContentPane().add(lblMedication);
		
		medicationField = new JTextField();
		medicationField.setColumns(10);
		medicationField.setBounds(382, 251, 86, 20);
		frame.getContentPane().add(medicationField);
		
		descriptionField = new JTextField();
		descriptionField.setColumns(10);
		descriptionField.setBounds(382, 220, 86, 20);
		frame.getContentPane().add(descriptionField);
		
		allergiesField = new JTextField();
		allergiesField.setColumns(10);
		allergiesField.setBounds(382, 282, 86, 20);
		frame.getContentPane().add(allergiesField);
		
		lblAllergies_1 = new JLabel("Allergies");
		lblAllergies_1.setBounds(478, 285, 87, 14);
		frame.getContentPane().add(lblAllergies_1);
		
		ownerField = new JTextField();
		ownerField.setColumns(10);
		ownerField.setBounds(382, 173, 86, 20);
		frame.getContentPane().add(ownerField);
		
		lblOwner = new JLabel("Owner");
		lblOwner.setBounds(478, 176, 87, 14);
		frame.getContentPane().add(lblOwner);
		
		lblAge = new JLabel("Birth date");
		lblAge.setBounds(476, 114, 69, 14);
		frame.getContentPane().add(lblAge);
		
		bdateField = new JTextField();
		bdateField.setColumns(10);
		bdateField.setBounds(382, 111, 86, 20);
		frame.getContentPane().add(bdateField);
		
		nameField = new JTextField();
		nameField.setColumns(10);
		nameField.setBounds(382, 80, 86, 20);
		frame.getContentPane().add(nameField);
		
		lblName = new JLabel("Name");
		lblName.setBounds(478, 83, 87, 14);
		frame.getContentPane().add(lblName);
		
		lblPetId = new JLabel("Pet ID");
		lblPetId.setBounds(478, 52, 87, 14);
		frame.getContentPane().add(lblPetId);
		
		petIDField = new JTextField();
		petIDField.setColumns(10);
		petIDField.setBounds(382, 49, 42, 20);
		frame.getContentPane().add(petIDField);
		
		customerList = new JList<String>();
		customerList.setAutoscrolls(false);
		customerList.setBounds(186, 14, 164, 187);
		frame.getContentPane().add(customerList);
		
		lblBreed = new JLabel("Breed");
		lblBreed.setBounds(476, 145, 69, 14);
		frame.getContentPane().add(lblBreed);
		
		breedField = new JTextField();
		breedField.setColumns(10);
		breedField.setBounds(382, 142, 86, 20);
		frame.getContentPane().add(breedField);
		
		
		addPetBtn.setBounds(382, 313, 89, 23);
		frame.getContentPane().add(addPetBtn);
		
		dogRBtn = new JRadioButton("Dog");
		dogRBtn.setBounds(383, 14, 51, 23);
		frame.getContentPane().add(dogRBtn);
		
		catRBtn = new JRadioButton("Cat");
		catRBtn.setBounds(436, 14, 51, 23);
		frame.getContentPane().add(catRBtn);
		
		RabbitRBtn = new JRadioButton("Rabbit");
		RabbitRBtn.setBounds(489, 14, 69, 22);
		frame.getContentPane().add(RabbitRBtn);
		
		InfoTextArea = new JTextArea();
		InfoTextArea.setBounds(871, 437, 164, 128);
		frame.getContentPane().add(InfoTextArea);
		
		cusInfoBtn.setActionCommand("Add Customer");
		cusInfoBtn.setBounds(871, 571, 164, 22);
		frame.getContentPane().add(cusInfoBtn);
		
		petInfoBtn.setActionCommand("Add Customer");
		petInfoBtn.setBounds(871, 599, 164, 22);
		frame.getContentPane().add(petInfoBtn);
		
		JLabel label = new JLabel("<<<");
		label.setBounds(381, 188, 30, 20);
		frame.getContentPane().add(label);
		
		petList = new JList<String>();
		petList.setBounds(591, 14, 164, 187);
		frame.getContentPane().add(petList);
		
		getEmployeeInfoBtn.setActionCommand("Add Customer");
		getEmployeeInfoBtn.setBounds(871, 627, 164, 22);
		frame.getContentPane().add(getEmployeeInfoBtn);
		
		button.setBounds(810, 181, 163, 23);
		frame.getContentPane().add(button);
		
		employeeIDField = new JTextField();
		employeeIDField.setColumns(10);
		employeeIDField.setBounds(810, 79, 42, 20);
		frame.getContentPane().add(employeeIDField);
		
		emplnameField = new JTextField();
		emplnameField.setColumns(10);
		emplnameField.setBounds(810, 110, 86, 20);
		frame.getContentPane().add(emplnameField);
		
		empfnameField = new JTextField();
		empfnameField.setColumns(10);
		empfnameField.setBounds(810, 141, 86, 20);
		frame.getContentPane().add(empfnameField);
		
		label_1 = new JLabel("Employee ID");
		label_1.setBounds(906, 82, 87, 14);
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("Last name");
		label_2.setBounds(906, 113, 87, 14);
		frame.getContentPane().add(label_2);
		
		label_3 = new JLabel("First name");
		label_3.setBounds(904, 144, 69, 14);
		frame.getContentPane().add(label_3);
		
		employeeList = new JList<String>();
		employeeList.setBounds(995, 17, 164, 187);
		frame.getContentPane().add(employeeList);
		
		NurseRBtn = new JRadioButton("Nurse");
		NurseRBtn.setBounds(808, 14, 69, 23);
		frame.getContentPane().add(NurseRBtn);
		
		SecretaryRBtn = new JRadioButton("Secretary");
		SecretaryRBtn.setBounds(807, 40, 87, 23);
		frame.getContentPane().add(SecretaryRBtn);
		
		SurgeonRBtn = new JRadioButton("Surgeon");
		SurgeonRBtn.setBounds(891, 14, 87, 23);
		frame.getContentPane().add(SurgeonRBtn);
		
		DoctorRBtn = new JRadioButton("Doctor");
		DoctorRBtn.setBounds(891, 40, 109, 23);
		frame.getContentPane().add(DoctorRBtn);
	}
}
