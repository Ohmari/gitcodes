package com.kwale.project.india;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.HeadlessException;

@SuppressWarnings("serial")
public class ENTRIES extends JDialog {
	private static String monthYear;
	private static String usrname;
	private JTextField rollNOTextField;
	private JTextField dateTextField;
	private JTextField crTextField;
	private JTextField stipendTextField;
	private JDateChooser stpendDOPjTextField;
	private JTextField checkNamejTextField;
	private JTextField drTextField;
	private JTextField relecTextField;
	private JDateChooser rentDOPjTextField;
	private JTextField otherTextField;
	private JDateChooser othersDOPjTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ENTRIES dialog = new ENTRIES();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ENTRIES() {
		getContentPane().setBackground(Color.CYAN);
		setBounds(100, 100, 767, 532);
		setLocationRelativeTo(null);
		rollNOTextField = new JTextField();
		rollNOTextField.setColumns(10);
		
		JLabel label = new JLabel("ROLL NO");
		
		JLabel label_1 = new JLabel("DATE");
		
		dateTextField = new JTextField();
		dateTextField.setColumns(10);
		
		JButton button = new JButton("Check Current Date");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buttonactionPerformed();
			}
		});
		
		crTextField = new JTextField();
		crTextField.setColumns(10);
		
		JLabel label_2 = new JLabel("Check record");
		
		stipendTextField = new JTextField();
		stipendTextField.setColumns(10);
		
		JLabel label_3 = new JLabel("STIPEND");
		
		JLabel label_4 = new JLabel("DOP");
		
		stpendDOPjTextField = new JDateChooser();
		
		checkNamejTextField = new JTextField();
		checkNamejTextField.setColumns(10);
		
		drTextField = new JTextField();
		drTextField.setColumns(10);
		
		JLabel label_5 = new JLabel("Delete record");
		
		relecTextField = new JTextField();
		relecTextField.setColumns(10);
		
		JLabel label_6 = new JLabel("RENT & ELECTRICITY");
		
		JLabel label_7 = new JLabel("DOP");
		
		rentDOPjTextField = new JDateChooser();
		
		JLabel label_8 = new JLabel("OTHERS");
		
		otherTextField = new JTextField();
		otherTextField.setColumns(10);
		
		JLabel label_9 = new JLabel("DOP");
		
		othersDOPjTextField = new JDateChooser();
			
		JButton buttonNew = new JButton("New");
		buttonNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buttonNewactionPerformed();
			}
		});
		
		JButton buttonUpdate = new JButton("Update");
		buttonUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buttonUpdateactionPerformed();
			}
		});
		
		JButton buttonSave = new JButton("Save");
		buttonSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buttonSaveactionPerformed();
			}
		});
		
		JLabel lblnull = new JLabel("@ "+monthYear);
		
		JButton btnConfirmcr = new JButton("Confirm");
		btnConfirmcr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnConfirmcractionPerformed();
			}
		});
		
		JButton buttonname = new JButton("Confirm");
		buttonname.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buttonnameactionPerformed();
			}
		});
		
		JButton buttonDrecord = new JButton("Confirm");
		buttonDrecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buttonDrecordactionPerformed();
			}
		});
		
		JButton buttonCancel = new JButton("Cancel");
		buttonCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		JLabel lblNameRequired = new JLabel("name required");
		
		JLabel lblRollNumberRequired = new JLabel("roll number required");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(rollNOTextField, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(relecTextField, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
										.addComponent(rentDOPjTextField, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
										.addComponent(otherTextField, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
								.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(117)
							.addComponent(buttonNew)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(buttonUpdate, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addComponent(buttonSave, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(othersDOPjTextField, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)))
						.addComponent(lblnull, GroupLayout.PREFERRED_SIZE, 448, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(stpendDOPjTextField, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(button)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(dateTextField, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(stipendTextField, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblRollNumberRequired)
								.addComponent(lblNameRequired)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(drTextField)
									.addComponent(checkNamejTextField)
									.addComponent(crTextField, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnConfirmcr, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(buttonDrecord, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
								.addComponent(buttonname, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(95))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(buttonCancel, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(43)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(rollNOTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2))
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(dateTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(crTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(button)
								.addComponent(btnConfirmcr)
								.addComponent(lblRollNumberRequired)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(61)
							.addComponent(checkNamejTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(label_3)
										.addComponent(stipendTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(12)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(label_4)
										.addComponent(stpendDOPjTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(21)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(label_6)
										.addComponent(relecTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addComponent(lblNameRequired))
							.addGap(6)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(rentDOPjTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_5))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(drTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(otherTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_8)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(label_7)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_9)
								.addComponent(othersDOPjTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(buttonUpdate)
								.addComponent(buttonNew))
							.addGap(8)
							.addComponent(buttonSave)
							.addGap(10)
							.addComponent(lblnull))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(buttonname)
							.addGap(121)
							.addComponent(buttonDrecord)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(buttonCancel)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
	}

	protected void buttonDrecordactionPerformed() {
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

	protected void buttonnameactionPerformed() {
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

	protected void btnConfirmcractionPerformed() {
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

	protected void buttonNewactionPerformed() {
		// TODO Auto-generated method stub
		rollNOTextField.setText("");
		stipendTextField.setText("");
		relecTextField.setText("");
		otherTextField.setText("");
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected void buttonUpdateactionPerformed() {
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
		update_row.add("null");
		update_row.add("null");
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

	protected void buttonactionPerformed() {
		// TODO Auto-generated method stub
		String monthDate = GetCurrentDateTime.getDateTime();
		dateTextField.setText(monthDate);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected void buttonSaveactionPerformed() {
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
				add_rows.add("null");
				add_rows.add("null");
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
		ENTRIES.monthYear = monthYear;
	}

	public static void setString2(String usrname) {
		// TODO Auto-generated method stub
		ENTRIES.usrname = usrname;
	}
}
