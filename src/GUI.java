import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Button;
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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblAllergies_1;
	private JTextField textField_3;
	private JLabel lblOwner;
	private JLabel lblAge;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblName;
	private JLabel lblPetId;
	private JTextField textField_6;
	private JList customerList;
	private List<String> cuslist;
	private JLabel lblBreed;
	private JTextField textField_7;
	private Vet vet;

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
		cuslist = new LinkedList<String>();
		vet = new Vet("VetPet", "A nice Vet!");
		initialize();	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 663, 370);
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
				cuslist.add(cusnr + ", " + fname + " " + lname);
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
				
			}
		});
		
		addCustomerBtn.setBounds(10, 300, 87, 22);
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
		lblNewLabel.setBounds(106, 38, 87, 14);
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
		lblAllergies.setBounds(498, 193, 87, 14);
		frame.getContentPane().add(lblAllergies);
		
		lblMedication = new JLabel("Medication");
		lblMedication.setBounds(498, 224, 87, 14);
		frame.getContentPane().add(lblMedication);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(402, 221, 86, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(402, 190, 86, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(402, 252, 86, 20);
		frame.getContentPane().add(textField_2);
		
		lblAllergies_1 = new JLabel("Allergies");
		lblAllergies_1.setBounds(498, 255, 87, 14);
		frame.getContentPane().add(lblAllergies_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(402, 159, 86, 20);
		frame.getContentPane().add(textField_3);
		
		lblOwner = new JLabel("Owner");
		lblOwner.setBounds(498, 162, 87, 14);
		frame.getContentPane().add(lblOwner);
		
		lblAge = new JLabel("Birth date");
		lblAge.setBounds(496, 100, 69, 14);
		frame.getContentPane().add(lblAge);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(402, 97, 86, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(402, 66, 86, 20);
		frame.getContentPane().add(textField_5);
		
		lblName = new JLabel("Name");
		lblName.setBounds(498, 69, 87, 14);
		frame.getContentPane().add(lblName);
		
		lblPetId = new JLabel("Pet ID");
		lblPetId.setBounds(498, 38, 87, 14);
		frame.getContentPane().add(lblPetId);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(402, 35, 42, 20);
		frame.getContentPane().add(textField_6);
		
		customerList = new JList<String>();
		customerList.setBounds(228, 11, 164, 187);
		frame.getContentPane().add(customerList);
		
		lblBreed = new JLabel("Breed");
		lblBreed.setBounds(496, 131, 69, 14);
		frame.getContentPane().add(lblBreed);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(402, 128, 86, 20);
		frame.getContentPane().add(textField_7);
		
		
		addPetBtn.setBounds(402, 299, 89, 23);
		frame.getContentPane().add(addPetBtn);
		
		JTextPane cusDetailsPanel = new JTextPane();
		cusDetailsPanel.setBounds(228, 209, 164, 113);
		frame.getContentPane().add(cusDetailsPanel);
	}
	
	
}
