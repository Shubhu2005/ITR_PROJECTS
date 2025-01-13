package com.project.service;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.project.dao.Connectionz;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginPage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel ulabel = new JLabel("");
		ulabel.setBounds(468, 42, 222, 24);
		contentPane.add(ulabel);
		
		JLabel plabel = new JLabel("");
		plabel.setBounds(468, 89, 222, 28);
		contentPane.add(plabel);
		
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBounds(41, 157, 201, 61);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().trim().isEmpty() && textField_1.getText().trim().isEmpty()) {
					ulabel.setText("Username is empty");
					plabel.setText("Password is empty");
				}
				else if(textField.getText().trim().isEmpty()) {
					ulabel.setText("Username is empty");
				}else if(textField_1.getText().trim().isEmpty()) {
					plabel.setText("Password is empty");
				}
				else {
					String uname=textField.getText();
					String pword=textField_1.getText();
					try {
						con=Connectionz.getConnection();
						pst=con.prepareStatement("SELECT * FROM `details` WHERE emailId =?  and password =? ");
					    pst.setString(1,uname);
						pst.setString(2, pword);
						rs=pst.executeQuery();
						
						if(rs.next()) {
							String s1=rs.getString("emailId");
							String s2=rs.getString("password");
							 if(s1.equals(uname) && s2.equals(pword)) {
								// JOptionPane.showMessageDialog(null,"Username password Matched");
										DashBoardPage dp=new DashBoardPage();
										dp.setVisible(true);
										setVisible(false);
									
							 }
						}else {
							 JOptionPane.showMessageDialog(null,"Username password Not Matched");
						}
					}catch(Exception ex) {
						System.out.println(" "+ex);
					}
					
				}
		}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Enter Username : ");
		lblNewLabel.setBounds(23, 21, 122, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(23, 74, 151, 43);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(187, 33, 241, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(187, 86, 241, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		JButton btnNewButton_1 = new JButton("CANCEL");
		btnNewButton_1.setBounds(287, 157, 235, 61);
		contentPane.add(btnNewButton_1);
		setUndecorated(true);
	}
}
