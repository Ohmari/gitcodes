package com.kwale.project.india;

import javax.swing.JDialog;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.HeadlessException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class UserPanel extends JDialog {
	private static String usrname;
	private JTextField unamecreatejTextField;
	private JPasswordField passwordcreatejPasswordField;
	private JTextField confirmpasswordcreatejTextField;
	private JTextField passHintTextField;
	private JTextField unameUpdatejTextField;
	private JTextField newpassUpdatejTextField;
	private JTextField deletAccountjTextField;
	private JTextField systemusnameupdate;
	private JPasswordField systempassupdate;
	private JTextField systempasshintupdate;
	private JComboBox rolecreatejComboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UserPanel dialog = new UserPanel();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public UserPanel() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setBounds(100, 100, 450, 300);
		setSize(600, 600);
		setLocationRelativeTo(null);
		
		JLabel lblAdminPanel = new JLabel("Admin Panel");
		lblAdminPanel.setForeground(new Color(255, 51, 0));
		lblAdminPanel.setBackground(Color.WHITE);
		
		JLabel lblCreateNewSystem = new JLabel("Create New System User");
		lblCreateNewSystem.setForeground(new Color(255, 102, 0));
		
		JLabel lblUserName = new JLabel("User name");
		
		unamecreatejTextField = new JTextField();
		unamecreatejTextField.setColumns(10);
		
		JLabel lblPasssword = new JLabel("Passsword");
		
		passwordcreatejPasswordField = new JPasswordField();
		
		JLabel lblConfirmPswd = new JLabel("Confirm pswd");
		
		confirmpasswordcreatejTextField = new JTextField();
		confirmpasswordcreatejTextField.setColumns(10);
		
		JLabel lblUserLog = new JLabel("User Log");
		
		rolecreatejComboBox = new JComboBox();
		rolecreatejComboBox.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Standard"}));
		
		JLabel lblPassHint = new JLabel("Pass Hint");
		
		passHintTextField = new JTextField();
		passHintTextField.setColumns(10);
		
		JLabel lblViewSystemUsers = new JLabel("View System Users");
		
		JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnViewactionPerformed();
			}
		});
		
		JLabel lblChangeUsersPassword = new JLabel("Change User's Password");
		lblChangeUsersPassword.setForeground(new Color(255, 102, 0));
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCreateactionPerformed();
			}
		});
		
		JLabel lblUserName_1 = new JLabel("User Name");
		
		unameUpdatejTextField = new JTextField();
		unameUpdatejTextField.setColumns(10);
		
		JLabel lblNewPassword = new JLabel("New Pass");
		
		newpassUpdatejTextField = new JTextField();
		newpassUpdatejTextField.setColumns(10);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnUpdateactionPerformed();
			}
		});
		
		JLabel lblDeleteSystemUser = new JLabel("Delete System User");
		lblDeleteSystemUser.setForeground(new Color(255, 102, 0));
		
		JLabel lblUserName_2 = new JLabel("User Name");
		
		deletAccountjTextField = new JTextField();
		deletAccountjTextField.setColumns(10);
		
		JButton btnDelet = new JButton("Delete");
		btnDelet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDeletactionPerformed();
			}
		});
		
		JLabel lblSystemUsersPanel = new JLabel("System User's Panel");
		lblSystemUsersPanel.setForeground(Color.RED);
		
		JLabel lblUpdateUsersInfo = new JLabel("Update User's Info");
		lblUpdateUsersInfo.setForeground(new Color(255, 102, 0));
		
		JLabel label = new JLabel("User name");
		
		systemusnameupdate = new JTextField();
		systemusnameupdate.setColumns(10);
		
		systempassupdate = new JPasswordField();
		
		JLabel label_1 = new JLabel("Passsword");
		
		JLabel label_3 = new JLabel("Pass Hint");
		
		systempasshintupdate = new JTextField();
		systempasshintupdate.setColumns(10);
		
		JButton button = new JButton("Update");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonactionPerformed();
			}
		});
		
		JLabel lblExitSystemPanel = new JLabel("Exit System Panel");
		lblExitSystemPanel.setForeground(new Color(255, 102, 0));
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JButton btnLogOut = new JButton("log out");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblChangeUsersPassword)
							.addContainerGap(456, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewPassword)
							.addContainerGap(528, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblDeleteSystemUser)
							.addContainerGap(480, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblExitSystemPanel, Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnExit)
									.addPreferredGap(ComponentPlacement.RELATED, 423, Short.MAX_VALUE)
									.addComponent(btnLogOut))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblUserName_2)
											.addGap(18)
											.addComponent(deletAccountjTextField, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblViewSystemUsers)
											.addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
											.addComponent(btnView))
										.addComponent(lblAdminPanel)
										.addComponent(lblCreateNewSystem)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(lblUserLog, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblUserName, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblPasssword, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblConfirmPswd, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblPassHint, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
													.addComponent(passHintTextField, 133, 133, 133)
													.addComponent(rolecreatejComboBox, 0, 133, Short.MAX_VALUE)
													.addComponent(confirmpasswordcreatejTextField, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
													.addComponent(passwordcreatejPasswordField, 133, 133, 133)
													.addComponent(btnCreate, Alignment.TRAILING))
												.addComponent(unamecreatejTextField, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblUserName_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(newpassUpdatejTextField, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
												.addComponent(unameUpdatejTextField, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
												.addComponent(btnUpdate, Alignment.TRAILING)))
										.addComponent(btnDelet, Alignment.TRAILING))
									.addGap(135)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblUpdateUsersInfo)
										.addComponent(lblSystemUsersPanel)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
												.addComponent(label_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
												.addComponent(label_3))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(systempassupdate, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
												.addComponent(systempasshintupdate, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
												.addComponent(button, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
												.addComponent(systemusnameupdate, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))))))
							.addGap(35))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAdminPanel)
						.addComponent(lblSystemUsersPanel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCreateNewSystem)
						.addComponent(lblUpdateUsersInfo))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblUserName)
								.addComponent(unamecreatejTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPasssword)
								.addComponent(passwordcreatejPasswordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblConfirmPswd)
								.addComponent(confirmpasswordcreatejTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(rolecreatejComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblUserLog))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPassHint)
								.addComponent(passHintTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCreate)
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblViewSystemUsers)
								.addComponent(btnView))
							.addGap(18)
							.addComponent(lblChangeUsersPassword)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblUserName_1)
								.addComponent(unameUpdatejTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewPassword)
								.addComponent(newpassUpdatejTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnUpdate)
							.addGap(18)
							.addComponent(lblDeleteSystemUser)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblUserName_2)
								.addComponent(deletAccountjTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(systemusnameupdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label))
							.addGap(6)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(systempassupdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(systempasshintupdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_3))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnDelet)
					.addGap(20)
					.addComponent(lblExitSystemPanel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLogOut)
						.addComponent(btnExit))
					.addGap(37))
		);
		getContentPane().setLayout(groupLayout);
	}

	@SuppressWarnings({ "deprecation", "rawtypes", "unchecked" })
	protected void buttonactionPerformed() {
		java.util.Vector update_systeminfo = new java.util.Vector();
		String systemaccount = systemusnameupdate.getText();

		if(!("Administrer".equals(usrname)))
		{
			update_systeminfo.add(systemaccount);
			update_systeminfo.add(systempassupdate.getText());
			update_systeminfo.add(systempasshintupdate.getText());
			update_systeminfo.add(usrname);
			
			java.sql.Connection conObj = JdbcConnect.createConnection();
			int i = 0;
			
			try {
				i = JdbcUpdateSYSTEMUSER.updateRecordFromTable(conObj,update_systeminfo);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null,e.getMessage(), "", JOptionPane.ERROR_MESSAGE);
			}
			
			if (i==0)
			{
				javax.swing.JOptionPane.showMessageDialog(null, "The given User@"+systemaccount+" do not exist in the system", "User@"+systemaccount+" access error", javax.swing.JOptionPane.ERROR_MESSAGE);
			}
			
			else {	
				javax.swing.JOptionPane.showMessageDialog(null, "System User Succesifully Updated,"
						+ " Please Ensure You Note Down Your Details"
						+ "\n\nUser Name: "+systemaccount+"\nPassword: "+systempassupdate.getText()
						+"\nPass Hint: "+systempasshintupdate.getText(),
						"User@"+usrname+" success message",
						javax.swing.JOptionPane.PLAIN_MESSAGE);
			}				
		}
		else {
			JOptionPane.showMessageDialog(null, "Not permitted to interfere with the parent Administrator", "Security message", JOptionPane.ERROR_MESSAGE);
		}
	}

	protected void btnDeletactionPerformed() {
		// TODO Auto-generated method stub
		java.sql.Connection conObj = JdbcConnect.createConnection();
			String account = deletAccountjTextField.getText();
			
			if (!("Administrer".equals(account)))
			{
					if ("Administrer".equals(usrname)||usrname.equals(account))
					{
						int request = javax.swing.JOptionPane.showConfirmDialog(null, "Are your sure you want to remove User@"+account+" from the system?", "Delete User@"+account, javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.ERROR_MESSAGE);
						if (request == javax.swing.JOptionPane.YES_OPTION)
						{
							int i = 0;
							try {
								i = JdbcDeleteUSERACCOUNTS.deleteAccountFromSystem(conObj,account);
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null, e.getMessage(), "", JOptionPane.ERROR_MESSAGE);
							}
							
							if (i==1)
							{
								JOptionPane.showMessageDialog(null, "User@"+account+" removed from the system");
							}

							else {
								javax.swing.JOptionPane.showMessageDialog(null, "User@"+account+" not in the system", "User@"+account+" access not available", javax.swing.JOptionPane.ERROR_MESSAGE); 
							}	
						}

						else if (request == javax.swing.JOptionPane.NO_OPTION)
						{
							javax.swing.JOptionPane.showMessageDialog(null, "Great Option! Nothing was interfered");
						}
					}

					else {
						javax.swing.JOptionPane.showMessageDialog(null, "You Are No The Parent Administrator, Not Permitted To Inteffere With Other Accounts", "User@"+usrname+" access denied", javax.swing.JOptionPane.ERROR_MESSAGE);
					}
				}
			
			else {
				JOptionPane.showMessageDialog(null, "Not permitted to interfere with the parent Administrator", "Security message", JOptionPane.ERROR_MESSAGE);
			}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected void btnUpdateactionPerformed() {
		// TODO Auto-generated method stub
		java.sql.Connection conObj = JdbcConnect.createConnection();
		java.util.Vector update_pass = new java.util.Vector();
		
		update_pass.add(newpassUpdatejTextField.getText());
		update_pass.add(unameUpdatejTextField.getText());
		
		if("Administrer".equals(unameUpdatejTextField.getText()))
		{
			if("Administrer".equals(usrname))
			{
				int i = 0;
				try {
					i = JdbcUpdateUSERACCOUNTS.updateRecordFromTable(conObj,update_pass);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null,e.getMessage(), "", JOptionPane.ERROR_MESSAGE);
				}	
				if (i==0)
				{
					JOptionPane.showMessageDialog(null, "Database Internal Error", "User@"+unameUpdatejTextField.getText()+" access error", JOptionPane.ERROR_MESSAGE);
				}
				
				else {	
					JOptionPane.showMessageDialog(null, "You have successful generated new password for User@"+unameUpdatejTextField.getText(), "User@"+unameUpdatejTextField.getText()+" success message", JOptionPane.PLAIN_MESSAGE);
				}							
			}
			
			else {
				JOptionPane.showMessageDialog(null, "User@"+usrname+" Not permitted to interfere with the parent Administrator", "Security message", JOptionPane.ERROR_MESSAGE);
			}
		}	
		else {
			int i = 0;
			try {
				i = JdbcUpdateUSERACCOUNTS.updateRecordFromTable(conObj,update_pass);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null,e.getMessage(), "", JOptionPane.ERROR_MESSAGE);
			}	
			if (i==0)
			{
				javax.swing.JOptionPane.showMessageDialog(null, "Internal Error", "User@"+unameUpdatejTextField.getText()+" access error", javax.swing.JOptionPane.ERROR_MESSAGE);
			}
			
			else {	
				javax.swing.JOptionPane.showMessageDialog(null, "You have successful generated new password for User@"+unameUpdatejTextField.getText(), "User@"+unameUpdatejTextField.getText()+" success message", javax.swing.JOptionPane.PLAIN_MESSAGE);
			}
		}
	}

	protected void btnViewactionPerformed() {
		java.sql.Connection conObj = JdbcConnect.createConnection();
		String accounts = null;
		if ("Administrer".equals(usrname))
		{
			JdbcSelectUSERACCOUNTS jua = new JdbcSelectUSERACCOUNTS();
			try {
				accounts = jua.selectRecordFromTable(conObj);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			JOptionPane.showMessageDialog(null,new javax.swing.JTextArea(accounts), "System accounts", JOptionPane.PLAIN_MESSAGE);	
		}

		else {
			JOptionPane.showMessageDialog(null, "Only The Parent Administrator Is Allowed To View Other User's Details", "Security Details", JOptionPane.ERROR_MESSAGE);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked", "deprecation" })
	protected void btnCreateactionPerformed() {
		// TODO Auto-generated method stub
		if ((confirmpasswordcreatejTextField.getText()).equals(passwordcreatejPasswordField.getText()))
		{
			java.sql.Connection conObj = JdbcConnect.createConnection();
			java.sql.ResultSet rs = null;
			try {
				rs = JdbcSelectUname.selectRecordFromTable(conObj,usrname);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage(), "Internal Error", JOptionPane.ERROR_MESSAGE);
			}
			
			try {
				if (rs.next())
				{
						String role = (String) rolecreatejComboBox.getSelectedItem();
	
						java.util.Vector add_rows = new java.util.Vector();
						//adding new user details to the Vector_add_rows
						add_rows.add(unamecreatejTextField.getText());
						add_rows.add(passwordcreatejPasswordField.getText());
						add_rows.add(passHintTextField.getText());
						add_rows.add(role);
	
						int i = JdbcCreateUser.insertRecords(conObj,add_rows);
	
						if (i!=1)
						{
							javax.swing.JOptionPane.showMessageDialog(null, "User@"+unamecreatejTextField.getText()+" not created\nPlease try again...", "User@"+unamecreatejTextField.getText()+" error", javax.swing.JOptionPane.ERROR_MESSAGE);
						}
						else {
							javax.swing.JOptionPane.showMessageDialog(null, "User@"+unamecreatejTextField.getText()+" added to the system", "User@"+unamecreatejTextField.getText()+" success message", javax.swing.JOptionPane.PLAIN_MESSAGE);
						}
				}//rs.next() if statement;
	
				else {
					javax.swing.JOptionPane.showMessageDialog(null, "Access denied! User@"+usrname+" not granted to create new users", "User@"+usrname+" authentication error", javax.swing.JOptionPane.ERROR_MESSAGE);
				}
			} catch (HeadlessException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage(), "", JOptionPane.ERROR_MESSAGE);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage(), "", JOptionPane.ERROR_MESSAGE);
			}
		}
	
		else {
				javax.swing.JOptionPane.showMessageDialog(null, "Access Denied! The given password do not match", "Mismatch error", javax.swing.JOptionPane.ERROR_MESSAGE);						
		}				
	}

	public static void setString(String usrname) {
		// TODO Auto-generated method stub
		UserPanel.usrname = usrname;
	}
}
