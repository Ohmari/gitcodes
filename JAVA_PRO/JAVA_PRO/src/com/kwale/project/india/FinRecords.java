package com.kwale.project.india;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class FinRecords extends JDialog {
	private JTable table;
	private JTextField crnTextField;
	private JTextField deletUpdateTextField;
	private JComboBox diplaymainselectedcomboBox;
	private JComboBox comboBoxmonth;
	private JComboBox comboBoxYear;
	private JComboBox comboBoxmonthdeleteupdate;
	private JComboBox comboBoxyeardeleteupdate;
	private JComboBox comboBoxdeleteupdate;
	private static String usrname;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			FinRecords dialog = new FinRecords();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FinRecords() {
		getContentPane().setBackground(Color.CYAN);
		setBounds(100, 100, 590, 300);
		setSize(1250, 600);
		setLocationRelativeTo(null);
		JScrollPane scrollPane = new JScrollPane();
		
		diplaymainselectedcomboBox = new JComboBox();
		diplaymainselectedcomboBox.setModel(new DefaultComboBoxModel(new String[] {"Rollnumber", "Name", "Ward", "College", "Course"}));
		
		crnTextField = new JTextField();
		crnTextField.setColumns(10);
		
		JButton buttonConfirmcheckrnwcc = new JButton("Confirm");
		buttonConfirmcheckrnwcc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonConfirmcheckrnwccactionPerformed();
			}
		});
		
		JLabel label = new JLabel("Check record based on");
		
		comboBoxmonth = new JComboBox();
		comboBoxmonth.setModel(new DefaultComboBoxModel(new String[] {"Jan", "Feb", "Match", "April", "May ", "June ", "July", "Aug", "Sept ", "Oct", "Nov", "Dec"}));
		
		comboBoxYear = new JComboBox();
		comboBoxYear.setModel(new DefaultComboBoxModel(new String[] {"2014", "2015", "2016", "2017", "2018", "2019", "2020"}));
		
		JButton buttonmonthYear = new JButton("Confirm");
		buttonmonthYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonmonthYearactionPerformed();
			}
		});
		
		JButton button_2 = new JButton("Print");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				} catch (PrinterException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e.getMessage(), "Internal Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		JButton buttonGrandTotal = new JButton("Grand Total");
		buttonGrandTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonGrandTotalactionPerformed();
			}
		});
		
		JLabel lblKwaleCountyProject = new JLabel("KWALE COUNTY PROJECT INDIA MANAGEMENT SYSTEM");
		
		comboBoxdeleteupdate = new JComboBox();
		comboBoxdeleteupdate.setModel(new DefaultComboBoxModel(new String[] {"delete", "update/enternew"}));
		
		JLabel lblSelectAnOperation = new JLabel("Select an operation to perform");
		
		deletUpdateTextField = new JTextField();
		deletUpdateTextField.setColumns(10);
		
		JButton btnConfirmdeletUpdate = new JButton("Confirm");
		btnConfirmdeletUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnConfirmdeletUpdateactionPerformed();
			}
		});
		
		comboBoxmonthdeleteupdate = new JComboBox();
		comboBoxmonthdeleteupdate.setModel(new DefaultComboBoxModel(new String[] {"Jan", "Feb", "Match", "April", "May ", "June ", "July", "Aug", "Sept ", "Oct", "Nov", "Dec"}));
		
		comboBoxyeardeleteupdate = new JComboBox();
		comboBoxyeardeleteupdate.setModel(new DefaultComboBoxModel(new String[] {"2014", "2015", "2016", "2017", "2018", "2019", "2020"}));
		
		JButton btnReload = new JButton("Reload");
		btnReload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnReloadactionPerformed();
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1224, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 901, Short.MAX_VALUE)
									.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(comboBoxmonth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(comboBoxYear, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(diplaymainselectedcomboBox, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(crnTextField, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(buttonConfirmcheckrnwcc, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
										.addComponent(buttonmonthYear, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
									.addGap(140)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblSelectAnOperation)
											.addPreferredGap(ComponentPlacement.RELATED, 510, Short.MAX_VALUE)
											.addComponent(btnReload)
											.addGap(73))
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(comboBoxmonthdeleteupdate, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(comboBoxyeardeleteupdate, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
												.addComponent(deletUpdateTextField, 134, 134, 134))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(comboBoxdeleteupdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(btnConfirmdeletUpdate))
											.addPreferredGap(ComponentPlacement.RELATED, 439, Short.MAX_VALUE)
											.addComponent(buttonGrandTotal, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)))))
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblKwaleCountyProject)
							.addGap(478))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
					.addGap(19)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(label)
							.addComponent(button_2)
							.addComponent(btnReload))
						.addComponent(lblSelectAnOperation))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(diplaymainselectedcomboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(crnTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonConfirmcheckrnwcc)
						.addComponent(comboBoxdeleteupdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxmonthdeleteupdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxyeardeleteupdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBoxmonth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonmonthYear)
						.addComponent(buttonGrandTotal)
						.addComponent(deletUpdateTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnConfirmdeletUpdate))
					.addGap(18)
					.addComponent(lblKwaleCountyProject)
					.addGap(8))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Roll Number", "Student Name", "Ward", "College", "Course", "Stipend", "St DOP", "Rent & Electricity", "RE DOP"
			}
		));
		scrollPane.setColumnHeaderView(table);
		scrollPane.setViewportView(table);
		getContentPane().setLayout(groupLayout);
		
		java.sql.Connection conObj = JdbcConnect.createConnection();
		try {
			DisplayTableFINTABLE.displayData(conObj,table,null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Finance table still epmty... no records to display", "Internal error", JOptionPane.ERROR_MESSAGE);
		}

	}


	protected void buttonGrandTotalactionPerformed() {
		// TODO Auto-generated method stub
		GrandTotal gt = new GrandTotal();
		float sumStipend = gt.getStipendSum(table);
		float sumRentEle = gt.getRentEleSum(table);
		float sumSchFees = gt.getSchFeesSum(table);
		float sumOtherCo = gt.getOtherCoSum(table);
		float grandTotal = sumStipend+sumRentEle+sumSchFees+sumOtherCo;
		
		JOptionPane.showMessageDialog(null,new javax.swing.JTextArea("\tAutoGeneratedReport\t\t\n\n\nStipend: \t\tRs.  "
		+sumStipend+"\nRent & Electricity: \tRs.  "
		+sumRentEle+"\nSchool Fees: \t\tRs.  "
		+sumSchFees+"\nOther Transactions: \tRs.  "
		+sumOtherCo+"\n\nGrand Total: \t\tRs. "+grandTotal 
		+"\n\n\n"), 
		"Grand Total", JOptionPane.PLAIN_MESSAGE);
	}
	
	protected void btnConfirmdeletUpdateactionPerformed() {
		// TODO Auto-generated method stub
		String rollNumber = deletUpdateTextField.getText();
		String monthdeleteupdatevalue = (String) comboBoxmonthdeleteupdate.getSelectedItem();
		String yeardeleteupdateValue = (String) comboBoxyeardeleteupdate.getSelectedItem();
		String keyElement = rollNumber+monthdeleteupdatevalue+yeardeleteupdateValue;
		String monthYear = monthdeleteupdatevalue+yeardeleteupdateValue;
		
		String operationvalue = (String) comboBoxdeleteupdate.getSelectedItem();
		
		if (operationvalue.equals("delete"))
		{
			DeleteRecordF_DB.deleteR(rollNumber,keyElement);	
		}
		else if (operationvalue.equals("update/enternew"))
		{
			int request = javax.swing.JOptionPane.showConfirmDialog(null, "Do the entries involves school fees?", "Confirmation dialog", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.PLAIN_MESSAGE);
			if (request == javax.swing.JOptionPane.YES_OPTION)
			{
				ENTRIESWITH.setString(monthYear);
				ENTRIESWITH.setString2(usrname);
				ENTRIESWITH dialog = new ENTRIESWITH();
				dialog.setModalityType(DEFAULT_MODALITY_TYPE);
				dialog.setVisible(true);
			}

			else if (request == javax.swing.JOptionPane.NO_OPTION)
			{
				ENTRIES.setString(monthYear);
				ENTRIES.setString2(usrname);
				ENTRIES dialog = new ENTRIES();
				dialog.setModalityType(DEFAULT_MODALITY_TYPE);
				dialog.setVisible(true);
			}
		}
	}
	
	protected void btnReloadactionPerformed() {
		// TODO Auto-generated method stub
		java.sql.Connection conObj = JdbcConnect.createConnection();
		try {
			DisplayTableFINTABLE.displayData(conObj,table,null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Unabale to establish connection", "Internal error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
		}
	}

	protected void buttonmonthYearactionPerformed() {
		// TODO Auto-generated method stub
		String month = (String) comboBoxmonth.getSelectedItem();
		String year = (String) comboBoxYear.getSelectedItem();
		String monthYear = month+year;
		
		java.sql.Connection conObj = JdbcConnect.createConnection();
		try {
			DisplayTableFINTABLE.displayData(conObj,table,monthYear);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Unabale to establish connection", "Internal error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
		}
	}

	protected void buttonConfirmcheckrnwccactionPerformed() {
		// TODO Auto-generated method stub
		String strselectedvalue = (String) diplaymainselectedcomboBox.getSelectedItem();
		java.sql.Connection conObj = JdbcConnect.createConnection();
		if (strselectedvalue.equals("Rollnumber"))
		{				
			String givenValue = crnTextField.getText();
			try {
				ChecKSpecificRecord.displayData(conObj,givenValue,"","","","","FINTABLE", table);
			} catch (SQLException e) {
				e.printStackTrace();
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Unabale to establish connection", "Internal error", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if (strselectedvalue.equals("Name"))
		{
			String givenValue = crnTextField.getText();
			try {
				ChecKSpecificRecord.displayData(conObj,"",givenValue,"","","","FINTABLE", table);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Unabale to establish connection", "Internal error", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
			}	
		}
		
		else if (strselectedvalue.equals("Ward"))
		{
			String givenValue = crnTextField.getText();
			try {
				ChecKSpecificRecord.displayData(conObj,"","",givenValue,"","","FINTABLE", table);			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Unabale to establish connection", "Internal error", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if (strselectedvalue.equals("College"))
		{
			String givenValue = crnTextField.getText();
			try {
				ChecKSpecificRecord.displayData(conObj,"","","",givenValue,"","FINTABLE", table);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Unabale to establish connection", "Internal error", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		else if (strselectedvalue.equals("Course"))
		{
			String givenValue = crnTextField.getText();
			try {
				ChecKSpecificRecord.displayData(conObj,"","","","",givenValue,"FINTABLE", table);	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Unabale to establish connection", "Internal error", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public static void setString(String usrname) {
		// TODO Auto-generated method stub
		FinRecords.usrname = usrname;
	}
}