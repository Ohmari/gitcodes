package com.kwale.project.india;

import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.juhibernate.config.JUdbServer;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class LoginInterFace extends JFrame {
	
	private JPanel contentPane;
	private JTextField usernametextField;
	private Connection conObj;
	private JPasswordField passwordField;
	private JTextField usrnametextField;
	private JPasswordField passwordtextField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					JUdbServer.dbStartup();					
					LoginInterFace frame = new LoginInterFace();
					frame.setSize(1250, 700);
					frame.setLocationRelativeTo(null);
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
	public LoginInterFace() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.PINK);
		setContentPane(contentPane);
		
		usernametextField = new JTextField();
		usernametextField.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		
		JLabel lblPassword = new JLabel("Password");
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				btnLoginactionPerformed();
			}
		});
		
		JButton btnForgotPassword = new JButton("Guest");
		btnForgotPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Yet To Be Implemented, Be Patient & Lets Wait for The Best", "Great Message", JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		passwordField = new JPasswordField();
		
		JLabel lblDbusername = new JLabel("DB_username");
		
		usrnametextField = new JTextField();
		usrnametextField.setColumns(10);
		
		JLabel lblDbpassword = new JLabel("DB_password");
		
		JButton btnSavedbSpecifications = new JButton("Save");
		btnSavedbSpecifications.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSavedbSpecificationsactionPerformed();
			}
		});
		
		JLabel lblDatabaseAuthentication = new JLabel("Database authentication");
		
		passwordtextField = new JPasswordField();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(33, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(lblPassword, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblUsername, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(passwordField)
										.addComponent(usernametextField, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnForgotPassword)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnLogin)))
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDatabaseAuthentication)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblDbusername)
									.addGap(4)
									.addComponent(usrnametextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblDbpassword)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(passwordtextField, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnSavedbSpecifications)))
							.addGap(23))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(17)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(usernametextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblUsername))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLogin)
						.addComponent(btnForgotPassword))
					.addPreferredGap(ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
					.addComponent(lblDatabaseAuthentication)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSavedbSpecifications)
						.addComponent(lblDbpassword)
						.addComponent(usrnametextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDbusername)
						.addComponent(passwordtextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

	@SuppressWarnings("deprecation")
	protected void btnSavedbSpecificationsactionPerformed() {
		// TODO Auto-generated method stub
		String usrname = usrnametextField.getText();
		String password = passwordtextField.getText();
		PropertiesFile.setPropertiesFile(usrname, password);
	}

	protected void btnLoginactionPerformed() {
		conObj = JdbcConnect.createConnection();
		try {
			JdbcSearchT.searchTable("USERACCOUNTS",conObj,null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Unabale to establish connection", "Internal error", JOptionPane.ERROR_MESSAGE);	
		}
		checkingAuthentication(conObj); 
	}

	protected void checkingAuthentication(Connection conObj) {
        // TODO add your handling code here:
		
			String usrName =usernametextField.getText();
			@SuppressWarnings("deprecation")
			String pswd = passwordField.getText();
			
			java.sql.ResultSet rs = null;
			try {
				rs = JdbcSelectLoginAccount.selectRecordFromTable(conObj,usrName);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				if (rs.next())
				{
					if (pswd.equals(rs.getString(2)))
					{	
						dispose();
						KCPI.setString(usrName);
						KCPI frame = new KCPI();
						frame.setSize(1300, 700);
						frame.setLocationRelativeTo(null);	
						frame.setVisible(true);
					}

					else {
						javax.swing.JOptionPane.showMessageDialog(null, "Incorrect password", "Login error", javax.swing.JOptionPane.ERROR_MESSAGE);
					}
				}

				else {
						javax.swing.JOptionPane.showMessageDialog(null, "User not in the system", "Login error", javax.swing.JOptionPane.ERROR_MESSAGE);
				}
			} catch (HeadlessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
    }
}
