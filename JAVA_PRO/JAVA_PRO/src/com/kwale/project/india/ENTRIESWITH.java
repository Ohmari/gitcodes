package com.kwale.project.india;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.HeadlessException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ENTRIESWITH extends JDialog {

	private static String monthYear;
	private static String usrname;
	private final JPanel contentPanel = new JPanel();
	private JTextField rollNOTextField;
	private JTextField dateTextField;
	private JTextField stipendTextField;
	private JDateChooser stpendDOPjTextField;
	private JTextField relecTextField;
	private JDateChooser rentDOPjTextField;
	private JTextField schTextField;
	private JDateChooser schDOPTextField;
	private JTextField otherTextField;
	private JDateChooser othersDOPjTextField;
	private JTextField crTextField;
	private JTextField checkNamejTextField;
	private JTextField drTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ENTRIESWITH dialog = new ENTRIESWITH();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ENTRIESWITH() {
		setBounds(100, 100, 745, 468);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.CYAN);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		JLabel lblRollNumber = new JLabel("ROLL NO");
		
		JLabel lblDatet = new JLabel("DATE");
		
		JLabel label = new JLabel("");
		
		rollNOTextField = new JTextField();
		rollNOTextField.setColumns(10);
		
		dateTextField = new JTextField();
		dateTextField.setColumns(10);
		
		JButton btnCheckCurrentDate = new JButton("Check Current Date");
		btnCheckCurrentDate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnCheckCurrentDateactionPerformed();
			}
		});
		
		JLabel lblStipend = new JLabel("STIPEND");
		
		stipendTextField = new JTextField();
		stipendTextField.setColumns(10);
		
		JLabel lblDop = new JLabel("DOP");
		
		stpendDOPjTextField = new JDateChooser();
		
		relecTextField = new JTextField();
		relecTextField.setColumns(10);
		
		JLabel lblRentElectricity = new JLabel("RENT & ELECTRICITY");
		
		rentDOPjTextField = new JDateChooser();
			
		JLabel lblDop_1 = new JLabel("DOP");
		
		schTextField = new JTextField();
		schTextField.setColumns(10);
		
		JLabel lblSchoolFess = new JLabel("SCHOOL FESS");
		
		schDOPTextField = new JDateChooser();
		
		JLabel lblDop_2 = new JLabel("DOP");
		
		otherTextField = new JTextField();
		otherTextField.setColumns(10);
		
		JLabel lblOthers = new JLabel("OTHERS");
		
		othersDOPjTextField = new JDateChooser();
		
		JLabel lblDop_3 = new JLabel("DOP");
		
		JLabel label_1 = new JLabel("@"+monthYear);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnSaveactionPerformed();
			}
		});
		
		JButton btnNew = new JButton("New");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNewactionPerformed();
			}
		});
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnUpdateactionPerformed();
			}
		});
		
		JLabel lblCheckRecord = new JLabel("Check record");
		
		crTextField = new JTextField();
		crTextField.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnConfirmactionPerformed();
			}
		});
		
		checkNamejTextField = new JTextField();
		checkNamejTextField.setColumns(10);
		
		JButton btnConfirmcheckname = new JButton("Confirm");
		btnConfirmcheckname.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnConfirmchecknameactionPerformed();
			}
		});
		
		JLabel lblDeleteRecord = new JLabel("Delete record");
		
		drTextField = new JTextField();
		drTextField.setColumns(10);
		
		JButton btnConfirmdelet = new JButton("Confirm");
		btnConfirmdelet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnConfirmdeletactionPerformed();
			}
		});
		
		JLabel lblRollNumberRequired = new JLabel("      roll number required");
		
		JLabel lblNameRequired = new JLabel("      name required");
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblSchoolFess)
								.addComponent(lblDatet, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblStipend, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblDop, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblDop_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblOthers, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblDop_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblDop_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblRentElectricity, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblRollNumber, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addComponent(otherTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
									.addComponent(label)
									.addGap(211))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
										.addComponent(stipendTextField, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(dateTextField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
										.addComponent(rollNOTextField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
										.addComponent(btnCheckCurrentDate)
										.addComponent(stpendDOPjTextField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
										.addComponent(relecTextField, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(rentDOPjTextField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
										.addComponent(schTextField, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(schDOPTextField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
										.addComponent(othersDOPjTextField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
										.addGroup(gl_contentPanel.createSequentialGroup()
											.addComponent(btnNew)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(btnUpdate)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(btnSave)))
									.addGap(6)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPanel.createSequentialGroup()
											.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblDeleteRecord, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblCheckRecord))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(drTextField, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
											.addGap(88))
										.addGroup(gl_contentPanel.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING, false)
												.addGroup(gl_contentPanel.createSequentialGroup()
													.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
														.addGroup(gl_contentPanel.createSequentialGroup()
															.addComponent(lblRollNumberRequired, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(btnConfirm))
														.addGroup(gl_contentPanel.createSequentialGroup()
															.addComponent(lblNameRequired, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
																.addComponent(btnConfirmcheckname)
																.addComponent(btnCancel)
																.addComponent(btnConfirmdelet))))
													.addGap(25))
												.addGroup(gl_contentPanel.createSequentialGroup()
													.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
														.addComponent(crTextField, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
														.addComponent(checkNamejTextField, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
													.addGap(93)))))))))
					.addGap(61))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRollNumber)
						.addComponent(rollNOTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCheckRecord))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDatet)
						.addComponent(dateTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(crTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCheckCurrentDate)
						.addComponent(btnConfirm)
						.addComponent(lblRollNumberRequired))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStipend)
						.addComponent(stipendTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblDop)
										.addComponent(stpendDOPjTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblRentElectricity)
										.addComponent(relecTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addComponent(checkNamejTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNameRequired)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblDop_1)
										.addComponent(rentDOPjTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblDeleteRecord))
									.addGap(18)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblSchoolFess)
										.addComponent(schTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblDop_2)
										.addComponent(schDOPTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
									.addComponent(drTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnConfirmdelet)
									.addGap(19)))
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGap(26)
									.addComponent(label))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblOthers)
										.addComponent(otherTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
							.addGap(12)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDop_3)
								.addComponent(othersDOPjTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnSave)
								.addComponent(btnNew)
								.addComponent(btnUpdate))
							.addGap(30)
							.addComponent(label_1)
							.addContainerGap())
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(26)
							.addComponent(btnConfirmcheckname)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnCancel)
							.addGap(25))))
		);
		contentPanel.setLayout(gl_contentPanel);
	}

	protected void btnConfirmchecknameactionPerformed() {
		// TODO Auto-generated method stub
		java.sql.Connection conObj = JdbcConnect.createConnection();
		String sname = checkNamejTextField.getText().toUpperCase();
		java.sql.ResultSet rs = null;
		try {
			rs = DisplayRollNUMBERMAINTABLE.displayData(conObj,sname);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Unabale to establish connection", "Internal error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
		}
		
		try {
			if (rs.next())
			{
				String rno = rs.getString(1);
				rollNOTextField.setText(rno);
				crTextField.setText(rno);
			}

			else {
				javax.swing.JOptionPane.showMessageDialog(null, "No record found for the given entry");
			}
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Unabale to establish connection", "Internal error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Unabale to establish connection", "Internal error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
		}
	}

	protected void btnConfirmdeletactionPerformed() {
		// TODO Auto-generated method stub
		java.sql.ResultSet rs = null;
		String rno = drTextField.getText();
		String keyElement = rno+monthYear;
		java.sql.Connection conObj = JdbcConnect.createConnection();
		try {
			rs = JdbcSelectUname.selectRecordFromTable(conObj,usrname);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Unabale to establish connection", "Internal error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
		}
		
		try {
			if (rs.next())
			{
				int request = JOptionPane.showConfirmDialog(null, "Are your sure you want to delet Record NO. "+rno+"?", "Confirmation dialog", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
				
				if (request == JOptionPane.YES_OPTION)
				{
					int i = JdbcDeleteFINTABLE.deleteRecordFromTable(conObj,keyElement);					
					if (i==1)
					{
						JOptionPane.showMessageDialog(null, "Financial record entry. "+keyElement+" for "+rno+" deleted from the financial system");
					}

					else {
						JOptionPane.showMessageDialog(null, "Ooops!!! record entry. "+keyElement+" for "+rno+" not found in financial system"); 
					}	
				}

				else if (request == JOptionPane.NO_OPTION)
				{
					JOptionPane.showMessageDialog(null, "Great Option! Nothing was interfered");
				}
			}

			else {
				String pass = JOptionPane.showInputDialog(null, "Security Code", "Authentication required", JOptionPane.ERROR_MESSAGE);
				rs = JdbcSelectPASS.selectRecordFromTable(conObj,pass);
				
				if (rs.next())
				{
					int request = JOptionPane.showConfirmDialog(null, "Are your sure you want to delet Record NO. "+rno+"?", "Confirmation dialog", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);

					if (request == JOptionPane.YES_OPTION)
					{
						int i = JdbcDeleteFINTABLE.deleteRecordFromTable(conObj,keyElement);					

						if (i==1)
						{
							JOptionPane.showMessageDialog(null, "Financial record entry. "+keyElement+" for "+rno+" deleted from the financial system");
						}

						else {
							JOptionPane.showMessageDialog(null, "Ooops!!! record entry. "+keyElement+" for "+rno+" not found in financial system"); 
						}	
					}

					else if (request == JOptionPane.NO_OPTION)
					{
						JOptionPane.showMessageDialog(null, "Great Option! Nothing was interfered");
					}
				}

				else {
					JOptionPane.showMessageDialog(null, "Authentication failed!!!", "User@"+usrname+" authentication", JOptionPane.ERROR_MESSAGE); 
				}
			}
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Unabale to establish connection", "Internal error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Unabale to establish connection", "Internal error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
		}
	}

	protected void btnNewactionPerformed() {
		// TODO Auto-generated method stub
		rollNOTextField.setText("");
		stipendTextField.setText("");
		relecTextField.setText("");
		schTextField.setText("");
		otherTextField.setText("");
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected void btnUpdateactionPerformed() {
		// TODO Auto-generated method stub
		DateFormat dateFormat = new SimpleDateFormat("dd MMM, yyyy");
		
		Date date = stpendDOPjTextField.getDate();
		if (date == null)
		{
			date = new Date();
		}
		String dateString = dateFormat.format(date);

		Date dateRent = rentDOPjTextField.getDate();
		if (dateRent == null)
		{
			dateRent = new Date();
		}
		String dateStringRent = dateFormat.format(dateRent);
		
		Date dateFees = schDOPTextField.getDate();
		if (dateFees == null)
		{
			dateFees = new Date();
		}
		String dateStringFees = dateFormat.format(dateFees);
		
		Date dateOthers = othersDOPjTextField.getDate();
		if (dateOthers == null)
		{
			dateOthers = new Date();
		}
		String dateStringOthers = dateFormat.format(dateOthers);
		String monthDate = GetCurrentDateTime.getDateTime();
		String keyElement = rollNOTextField.getText()+monthYear;
		java.sql.Connection conObj = JdbcConnect.createConnection();
		
		java.util.Vector update_row = new java.util.Vector();
		
		update_row.add(dateTextField.getText());
		update_row.add(stipendTextField.getText());
		update_row.add(dateString);
		update_row.add(relecTextField.getText());
		update_row.add(dateStringRent);
		update_row.add(schTextField.getText());
		update_row.add(dateStringFees);
		update_row.add(otherTextField.getText());
		update_row.add(dateStringOthers);
		update_row.add("update"+monthDate+"User@"+usrname);
		update_row.add(keyElement);

		int i = 0;
		try {
			i = JdbcUpdateFINTABLE.updateRecordFromTable(conObj,update_row);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Unabale to establish connection", "Internal error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
		}

		if (i==0)
		{
				javax.swing.JOptionPane.showMessageDialog(null, "Something happened with Record entry. "+keyElement);
		}
		
		else {	
				javax.swing.JOptionPane.showMessageDialog(null, "Record entry. "+keyElement+" updated successiful");
		}						
	}

	protected void btnCheckCurrentDateactionPerformed() {
		// TODO Auto-generated method stub
		String monthDate = GetCurrentDateTime.getDateTime();
		dateTextField.setText(monthDate);
	}

	protected void btnConfirmactionPerformed() {
		// TODO Auto-generated method stub
		DateFormat dateFormat = new SimpleDateFormat("dd MMM, yyyy");
		java.sql.Connection conObj = JdbcConnect.createConnection();
		
		String rno = crTextField.getText();
		String keyElement = rno+monthYear;

		java.sql.ResultSet rs = null;
		try {
			rs = JdbcSelectFINTABLE.selectRecordFromTable(conObj,keyElement);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Table not in system....", "Internal error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);		
		}

		try {
			if (rs.next())
			{
				String dateString = rs.getString(7);
				Date date = null;
				try {
					date = dateFormat.parse(dateString);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e.getMessage(), "Internal Error", JOptionPane.ERROR_MESSAGE);
				}
				
				String dateStringRent = rs.getString(9);
				Date dateRent = null;
				try {
					dateRent = dateFormat.parse(dateStringRent);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e.getMessage(), "Internal Error", JOptionPane.ERROR_MESSAGE);
				}
				
				String dateStringFees = rs.getString(11);
				Date dateFees = null;
				try {
					dateFees = dateFormat.parse(dateStringFees);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e.getMessage(), "Internal Error", JOptionPane.ERROR_MESSAGE);
				}
				
				String dateStringOthers = rs.getString(13);
				Date dateOthers = null;
				try {
					dateOthers = dateFormat.parse(dateStringOthers);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e.getMessage(), "Internal Error", JOptionPane.ERROR_MESSAGE);
				}
				
				rollNOTextField.setText(rs.getString(3));
				dateTextField.setText(rs.getString(5));
				stipendTextField.setText(rs.getString(6));
				stpendDOPjTextField.setDate(date);
				relecTextField.setText(rs.getString(8));
				rentDOPjTextField.setDate(dateRent);
				schTextField.setText(rs.getString(10));
				schDOPTextField.setDate(dateFees);
				otherTextField.setText(rs.getString(12));
				othersDOPjTextField.setDate(dateOthers);
			}

			else {
				javax.swing.JOptionPane.showMessageDialog(null, "Oops! Record entry. "+keyElement+" do not exist in the system"); 			
			}
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Unabale to establish connection", "Internal error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Unabale to establish connection", "Internal error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);	
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected void btnSaveactionPerformed() {
		// TODO Auto-generated method stub
		DateFormat dateFormat = new SimpleDateFormat("dd MMM, yyyy");
		
		Date date = stpendDOPjTextField.getDate();
		if (date == null)
		{
			date = new Date();
		}
		String dateString = dateFormat.format(date);
		
		Date dateRent = rentDOPjTextField.getDate();
		if (dateRent == null)
		{
			dateRent = new Date();
		}
		String dateStringRent = dateFormat.format(dateRent);
		
		Date dateFees = schDOPTextField.getDate();
		if (dateFees == null)
		{
			dateFees = new Date();
		}
		String dateStringFees = dateFormat.format(dateFees);
		
		Date dateOthers = othersDOPjTextField.getDate();
		if (dateOthers == null)
		{
			dateOthers = new Date();
		}
		String dateStringOthers = dateFormat.format(dateOthers);
		java.sql.Connection conObj = JdbcConnect.createConnection();
		
		java.sql.ResultSet rs = null;
		try {
			rs = JdbcSelect.selectRecordFromTable(conObj, rollNOTextField.getText());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Unabale to establish connection", "Internal error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
		}
		
		try {
			if (rs.next())
			{
				String monthDate = GetCurrentDateTime.getDateTime();
				java.util.Vector add_rows = new java.util.Vector();
				
				add_rows.add(rollNOTextField.getText()+monthYear);
				add_rows.add(monthYear);
				add_rows.add(rollNOTextField.getText());
				add_rows.add(rs.getString(2));
				add_rows.add(dateTextField.getText());
				add_rows.add(stipendTextField.getText());
				add_rows.add(dateString);
				add_rows.add(relecTextField.getText());
				add_rows.add(dateStringRent);
				add_rows.add(schTextField.getText());
				add_rows.add(dateStringFees);
				add_rows.add(otherTextField.getText());
				add_rows.add(dateStringOthers);
				add_rows.add(monthDate+"User@"+usrname);
				add_rows.add(rs.getString(3));
				add_rows.add(rs.getString(5));
				add_rows.add(rs.getString(6));
			
				JdbcSearchT.searchTable("FINTABLE",conObj,add_rows);
			}
			else {
				JOptionPane.showMessageDialog(null, "Oops! Record NO. "+rollNOTextField.getText()+" do not exist in the system", "Internal error", JOptionPane.ERROR_MESSAGE); 			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Record entry "+rollNOTextField.getText()+monthYear+" exists in the system please use update option", "Internal error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void setString(String monthYear) {
		// TODO Auto-generated method stub
		ENTRIESWITH.monthYear = monthYear;
	}

	public static void setString2(String usrname) {
		// TODO Auto-generated method stub
		ENTRIESWITH.usrname = usrname;
	}
}
