package com.project.service;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.UIManager;


public class HomePage extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 650);
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 850, 164);
		panel.setBackground(new Color(0, 0, 205));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO VACCINATION DRIVE");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Segoe UI Variable", Font.BOLD, 40));
		lblNewLabel.setBounds(40, 33, 756, 88);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Rashmi Sathe\\OneDrive\\Pictures\\Saved Pictures\\medicalimg.png"));
		lblNewLabel_1.setBounds(0, 162, 850, 488);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("LOGIN ");
		btnNewButton.setBorder(UIManager.getBorder("Button.border"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage lp=new LoginPage();
				lp.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(152, 251, 152));
		btnNewButton.setBounds(316, 360, 187, 55);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SIGN UP");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationPage rg=new RegistrationPage();
				rg.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(255, 127, 80));
		btnNewButton_1.setBounds(315, 451, 188, 55);
		contentPane.add(btnNewButton_1);
		setUndecorated(true);
	}
}
