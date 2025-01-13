package com.project.service;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class RegistrationPage extends JFrame {
	public static boolean isValid(String email)
	{
	String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
	Pattern pattern = Pattern.compile(regex);
	if (email == null)
	return false;
	return pattern.matcher(email).matches();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	protected String gender;

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
	public RegistrationPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(40, 60, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 700, 128);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(72, 36, 553, 51);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(23, 152, 160, 25);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(198, 155, 230, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel val = new JLabel("Incorrect Name");
		val.setBounds(462, 158, 228, 19);
		val.setVisible(false);
		contentPane.add(val);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setBounds(23, 187, 160, 25);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(198, 190, 230, 22);
		contentPane.add(textField_1);
		
		JLabel val1 = new JLabel("");
		val1.setBounds(462, 187, 228, 19);
		contentPane.add(val1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("New label");
		lblNewLabel_1_1_1.setBounds(23, 222, 160, 25);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(198, 222, 230, 22);
		contentPane.add(textField_2);
		
		JLabel val2 = new JLabel("");
		val2.setBounds(462, 216, 228, 19);
		contentPane.add(val2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("New label");
		lblNewLabel_1_1_1_1.setBounds(23, 257, 160, 25);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(198, 260, 230, 22);
		contentPane.add(textField_3);
		
		JLabel val3 = new JLabel("");
		val3.setBounds(462, 263, 228, 19);
		contentPane.add(val3);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("New label");
		lblNewLabel_1_1_1_1_1.setBounds(23, 300, 160, 25);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(193, 292, 235, 25);
		contentPane.add(dateChooser);
		
		JLabel val4 = new JLabel("");
		val4.setBounds(462, 292, 228, 19);
		contentPane.add(val4);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("New label");
		lblNewLabel_1_1_1_1_1_1.setBounds(23, 347, 160, 25);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			        gender="male";
			        rdbtnNewRadioButton.setSelected(true);
			        rdbtnNewRadioButton.setSelected(false);
			    }
			});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(215, 349, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  gender="female";
				  rdbtnNewRadioButton_1.setSelected(true);
				  rdbtnNewRadioButton_1.setSelected(false);
			    }
			});
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(334, 349, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel val5 = new JLabel("");
		val5.setBounds(462, 353, 228, 19);
		contentPane.add(val5);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("New label");
		lblNewLabel_1_1_1_1_1_1_1.setBounds(23, 382, 160, 25);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(198, 382, 242, 82);
		contentPane.add(textArea);
		
		JLabel val6 = new JLabel("");
		val6.setBounds(462, 382, 228, 19);
		contentPane.add(val6);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("New label");
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(23, 485, 160, 25);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(198, 488, 230, 22);
		contentPane.add(textField_4);
		
		JLabel val7 = new JLabel("");
		val7.setBounds(462, 491, 228, 19);
		contentPane.add(val7);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1 = new JLabel("New label");
		lblNewLabel_1_1_1_1_1_1_1_1_1.setBounds(23, 531, 160, 25);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(198, 534, 230, 22);
		contentPane.add(textField_5);
		
		JLabel val8 = new JLabel("");
		val8.setBounds(462, 537, 228, 19);
		contentPane.add(val8);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				  String fname=textField.getText();
				  String lname=textField_1.getText();
				  String pname=textField_2.getText();
				  String ename=textField_3.getText();
				 // String pwdname=textField_4.getText(); 
				  // for first name
				    String PATTERN ="^[a-zA-Z]*$";
					Pattern patt=Pattern.compile(PATTERN);
					Matcher match=patt.matcher(textField.getText());
					if(!match.matches()) 
					{
			        	val.setVisible(true);

					}
						
					else if(fname.equals("")) {
			        	val.setVisible(true);

					}
					else
					{
			        	val.setVisible(false);

					}
					// last name
					
				                String PATTERN1="^[a-zA-Z]*$";
								Pattern patt1=Pattern.compile(PATTERN1);
								Matcher match1=patt1.matcher(textField_1.getText());
								if(!match1.matches()) 
								{
									val1.setVisible(true);

								}
								else if(lname.equals("")) {
									val1.setVisible(true);

								}
									
								else {
										val1.setVisible(false);

								}
					
								// for phone Number 
								String regex = "^[6-9]{1}[0-9]{9}$";
								Pattern pattern = Pattern.compile(regex);
								Matcher matcher = pattern.matcher(textField_2.getText());
								if(!matcher.matches())
								{
									val2.setVisible(true);
								}
								else if(pname.equals("")) {
									val2.setVisible(true);

								}
									
								else {
										val2.setVisible(false);

								}
								
								// for email 
								
								String expression = "^[a-zA-Z0-9+_.-]+@(.+)$"; 
								Pattern p = Pattern.compile(expression);
								Matcher m = p.matcher(textField_3.getText());
								if(!m.matches())
								{
									val3.setVisible(true);
								}
								else if(ename.equals("")) {
									val3.setVisible(true);

								}
									
								else {
										val3.setVisible(false);

								}
								//for dob 
								
								if(!rdbtnNewRadioButton.isSelected() && !rdbtnNewRadioButton_1.isSelected() ) {
									//val5.setText("Gender Field is Empty");
									val5.setVisible(true);
									
								}else
								{
									val5.setVisible(false);

								}
								
								if(textArea.getText().trim().isEmpty() ) {
									val6.setText("Address Field is Empty");
								}
								if(textField_4.getText().trim().isEmpty() ) {
									val7.setText("Password Field is Empty");
								}
								if(textField_5.getText().trim().isEmpty() ) {
									val8.setText("Confirm Password Field is Empty");
								} 
							}
					
		});
		btnNewButton.setBounds(95, 576, 153, 43);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(291, 572, 137, 47);
		contentPane.add(btnNewButton_1);
		
	}
}
