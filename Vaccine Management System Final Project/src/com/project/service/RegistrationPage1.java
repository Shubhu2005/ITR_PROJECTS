package com.project.service;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;


public class RegistrationPage1 extends JFrame {
	public RegistrationPage1() {
	}
	Connection con=null;
	PreparedStatement ps=null;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ftextField;
	private JTextField ltextField;
	private JTextField ptextField;
	private JTextField etextField;
	private JTextField pwdtextField;
	private JTextField cpwdtextField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationPage frame = new RegistrationPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistrationPage1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 40, 800, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 800, 74);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration Page");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 38));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(87, 10, 583, 54);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 73, 800, 677);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel flabel = new JLabel("First Name : ");
		flabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		flabel.setBounds(66, 38, 196, 39);
		panel_1.add(flabel);
		
		JLabel llabel = new JLabel("Last Name : ");
		llabel.setBounds(66, 95, 196, 39);
		panel_1.add(llabel);
		
		JLabel plabel = new JLabel("Phone No : ");
		plabel.setBounds(66, 144, 199, 39);
		panel_1.add(plabel);
		
		JLabel elabel = new JLabel("Email Id : ");
		elabel.setBounds(66, 204, 199, 45);
		panel_1.add(elabel);
		
		JLabel doblabel = new JLabel("DOB");
		doblabel.setBounds(66, 289, 199, 39);
		panel_1.add(doblabel);
		
		JLabel glabel = new JLabel("Gender :");
		glabel.setBounds(66, 338, 213, 45);
		panel_1.add(glabel);
		
		JLabel alabel = new JLabel("Address  :");
		alabel.setBounds(66, 393, 214, 45);
		panel_1.add(alabel);
		
		JLabel pwdlabel = new JLabel("Password : ");
		pwdlabel.setBounds(68, 484, 177, 39);
		panel_1.add(pwdlabel);
		
		JLabel cpwdlabel = new JLabel("Confirm Password  :");
		cpwdlabel.setBounds(66, 533, 184, 52);
		panel_1.add(cpwdlabel);
		
		ftextField = new JTextField();
		ftextField.setBounds(264, 38, 189, 45);
		panel_1.add(ftextField);
		ftextField.setColumns(10);
		
		ltextField = new JTextField();
		ltextField.setBounds(264, 95, 196, 39);
		panel_1.add(ltextField);
		ltextField.setColumns(10);
		
		ptextField = new JTextField();
		ptextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				//if(e.getKey)
			}
		});
		ptextField.setBounds(264, 154, 200, 39);
		panel_1.add(ptextField);
		ptextField.setColumns(10);
		
		etextField = new JTextField();
		etextField.setBounds(264, 211, 205, 53);
		panel_1.add(etextField);
		etextField.setColumns(10);
		
		JDateChooser dtextField = new JDateChooser();
		dtextField.setBounds(251, 289, 231, 39);
		panel_1.add(dtextField);
		
		JTextArea atextArea = new JTextArea();
		atextArea.setBounds(245, 393, 250, 81);
		panel_1.add(atextArea);
		
		pwdtextField = new JTextField();
		pwdtextField.setBounds(255, 484, 269, 45);
		panel_1.add(pwdtextField);
		pwdtextField.setColumns(10);
		
		cpwdtextField = new JTextField();
		cpwdtextField.setBounds(260, 539, 232, 52);
		panel_1.add(cpwdtextField);
		cpwdtextField.setColumns(10);
		
		JLabel val = new JLabel("");
		val.setBounds(464, 53, 315, 24);
		panel_1.add(val);
		
		JLabel val1 = new JLabel("");
		val1.setBounds(480, 108, 310, 24);
		panel_1.add(val1);
		
		JLabel val2 = new JLabel("");
		val2.setBounds(474, 157, 316, 24);
		panel_1.add(val2);
		
		JLabel val3 = new JLabel("");
		val3.setBounds(479, 220, 311, 29);
		panel_1.add(val3);
		
		JLabel val4 = new JLabel("");
		val4.setBounds(492, 302, 287, 26);
		panel_1.add(val4);
		
		JLabel val5 = new JLabel("");
		val5.setBounds(479, 338, 300, 29);
		panel_1.add(val5);
		
		JLabel val6 = new JLabel("");
		val6.setBounds(503, 409, 276, 29);
		panel_1.add(val6);
		
		JLabel val7 = new JLabel("");
		val7.setBounds(545, 497, 245, 26);
		panel_1.add(val7);
		
		JLabel val8 = new JLabel("");
		val8.setBounds(502, 553, 269, 24);
		panel_1.add(val8);
		
		JRadioButton maleRButton = new JRadioButton("Male");
		buttonGroup.add(maleRButton);
		maleRButton.setBounds(239, 350, 103, 21);
		panel_1.add(maleRButton);
		
		JRadioButton femaleRButton = new JRadioButton("Female");
		buttonGroup.add(femaleRButton);
		femaleRButton.setBounds(350, 350, 103, 21);
		panel_1.add(femaleRButton);
		
		JButton submitbtn = new JButton("SUBMIT");
		submitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ftextField.getText().trim().isEmpty()) {
					val.setText("First Name is empty");
					} 
				if(ltextField.getText().trim().isEmpty()) {
					val1.setText("Last Name is empty");
				}
				//Validation for phone No
				String regex="^[6-9]{1}[0-9]{9}$";
				Pattern pattern1=Pattern.compile(regex);
				Matcher match1=pattern1.matcher(ptextField.getText());
				if(!match1.matches() && ptextField.getText().trim().isEmpty() ) {
					val2.setVisible(true);
					val2.setText("Invalid Number!!");
				}
				else {
					val2.setVisible(false);
				}
				
			//	if() {
				//	val2.setText("Phone No Field is empty");
				//}
				
				//Validation for Email Id
				String expression="^[a-zA-Z0-9+_.-]+@(.+)$";
				Pattern pattern2=Pattern.compile(expression);
				Matcher match2=pattern2.matcher(ptextField.getText());
				if(!match2.matches()) {
					val3.setVisible(true);
					val3.setText("Phone No Field is empty");
				}
				else {
					val2.setVisible(false);
				}
				
				if(etextField.getText().trim().isEmpty()) {
					val3.setText("Email Id Field is empty");
				}
				if(((JTextField)dtextField.getDateEditor().getUiComponent()).getText().trim().isEmpty()) {
					val4.setText("DOB Field is empty");
				}
				
				if(maleRButton.getText().trim().isEmpty() && femaleRButton.getText().trim().isEmpty() ) {
					val5.setText("Gender Field is Empty");
				}
				if(atextArea.getText().trim().isEmpty() ) {
					val6.setText("Address Field is Empty");
				}
				if(pwdtextField.getText().trim().isEmpty() ) {
					val7.setText("Password Field is Empty");
				}
				if(cpwdtextField.getText().trim().isEmpty() ) {
					val8.setText("Confirm Password Field is Empty");
				} 
				else {
				try{
					String query = "INSERT INTO `details`(`username`, `lastName`, `phoneNo`, `emailId`, `dob`, `gender`, `address`, `password`, `confirmPassword`) VALUES (?,?,?,?,?,?,?,?,?)";
					con=DriverManager.getConnection("jdbc:mysql:///registration_data","root", null);
					ps=con.prepareStatement(query);					
					ps.setString(1,ftextField.getText());      
					ps.setString(2,ltextField.getText());
					ps.setString(3,ptextField.getText());
					ps.setString(4,etextField.getText());
					ps.setString(5,((JTextField)dtextField.getDateEditor ().getUiComponent()).getText());
					if(maleRButton.isSelected())
						ps.setString(6,maleRButton.getText());
					else
					    ps.setString(6,femaleRButton.getText() ); 
					ps.setString(7,atextArea.getText());
					ps.setString(8,pwdtextField.getText());
					ps.setString(9,cpwdtextField.getText());
					
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null,"Registered Successfully");
				}
					
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null,ex);
				}
				} 
		}
			}
	
);
		submitbtn.setBounds(90, 604, 221, 52);
		panel_1.add(submitbtn);
		
		JButton resetbtn = new JButton("RESET");
		resetbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ftextField.setText("");
				ltextField.setText("");
				ptextField.setText("");
				etextField.setText("");
			   ((JTextField)dtextField.getDateEditor().getUiComponent()).setText("");
				if(maleRButton.isSelected())
					maleRButton.setSelected(false);
				else
					femaleRButton.setSelected(false);
				atextArea.setText("");
				pwdtextField.setText("");
				cpwdtextField.setText("");
				val.setText(" ");
				val1.setText(" ");
				val2.setText(" ");
				val3.setText(" ");
				val4.setText(" ");
				val5.setText(" ");
				val6.setText(" ");
				val7.setText(" ");
				val8.setText(" ");
			}
		});
		resetbtn.setBounds(364, 601, 257, 52);
		panel_1.add(resetbtn);
		setUndecorated(true);
	}
}
