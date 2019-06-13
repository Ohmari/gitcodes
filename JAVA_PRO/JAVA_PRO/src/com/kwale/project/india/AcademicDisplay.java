package com.kwale.project.india;

import java.awt.Color;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class AcademicDisplay extends JDialog {
	private static String courseSem;
	private static String usrname;
	private JTable table;
	private JTextField crnTextField;
	private JTextField deletUpdateTextField;
	private JComboBox comboBoxcourse;
	private JComboBox comboBoxsemyear;
	private JComboBox diplaymainselectedcomboBox;
	private JComboBox comboBoxdeleteupdate;
	private JComboBox comboBox;
	private JComboBox comboBox_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AcademicDisplay dialog = new AcademicDisplay();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AcademicDisplay() {
		getContentPane().setBackground(Color.CYAN);
		setBounds(100, 100, 1250, 600);
		setSize(1250, 575);
		setLocationRelativeTo(null);
		JScrollPane scrollPane = new JScrollPane();

		JLabel label = new JLabel("Check record based on");

		diplaymainselectedcomboBox = new JComboBox();
		diplaymainselectedcomboBox.setModel(new DefaultComboBoxModel(new String[] {"Rollnumber", "Name", "College"}));
		crnTextField = new JTextField();
		crnTextField.setColumns(10);

		JButton confirmrnc = new JButton("Confirm");
		confirmrnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonrncactionPerformed();
			}
		});

		comboBoxcourse = new JComboBox();
		comboBoxcourse.setModel(new DefaultComboBoxModel(new String[] {"BBA", "BCA", "B.COM", "BA/LLB "}));

		comboBoxsemyear = new JComboBox();
		comboBoxsemyear.setModel(new DefaultComboBoxModel(new String[] {"first", "second", "third", "fourth", "fifth", "sixth"}));

		JButton buttonRecheckRecord = new JButton("Confirm");
		buttonRecheckRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonRecheckRecordactionPerformed();
			}
		});

		JLabel label_1 = new JLabel("Select an operation to perform");

		comboBoxdeleteupdate = new JComboBox();
		comboBoxdeleteupdate.setModel(new DefaultComboBoxModel(new String[] {"delete", "update/enternew"}));

		deletUpdateTextField = new JTextField();
		deletUpdateTextField.setColumns(10);

		JButton buttondeletnewentry = new JButton("Confirm");
		buttondeletnewentry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttondeletnewentryactionPerformed();
			}
		});

		JLabel label_2 = new JLabel("KWALE COUNTY PROJECT INDIA MANAGEMENT SYSTEM");

		JButton button_3 = new JButton("Print");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				} catch (PrinterException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e.getMessage(), "Internal Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		JButton buttonReload = new JButton("Reload");
		buttonReload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buttonReloadactionPerformed();
			}
		});

		JButton button_5 = new JButton("Sample Slip");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Yet To Be Updated",  "", JOptionPane.INFORMATION_MESSAGE);
			}
		});

		JLabel lblAcademicsFor = new JLabel("Academics for "+courseSem);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BBA", "BCA", "B.COM", "BA/LLB"}));
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"first", "second", "third", "fourth", "fifth", "sixth"}));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
										.addContainerGap()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 1214, GroupLayout.PREFERRED_SIZE)
												.addGroup(groupLayout.createSequentialGroup()
														.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																.addComponent(label, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
																.addGroup(groupLayout.createSequentialGroup()
																		.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																				.addGroup(groupLayout.createSequentialGroup()
																						.addComponent(diplaymainselectedcomboBox, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(ComponentPlacement.RELATED)
																						.addComponent(crnTextField, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
																				.addGroup(groupLayout.createSequentialGroup()
																						.addComponent(comboBoxcourse, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(ComponentPlacement.RELATED)
																						.addComponent(comboBoxsemyear, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)))
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																				.addComponent(buttonRecheckRecord, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
																				.addComponent(confirmrnc, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))))
														.addGap(128)
														.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																.addGroup(groupLayout.createSequentialGroup()
																		.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																				.addComponent(label_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																				.addGroup(groupLayout.createSequentialGroup()
																						.addComponent(deletUpdateTextField, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
																						.addComponent(buttondeletnewentry, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
																				.addGroup(groupLayout.createSequentialGroup()
																						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(ComponentPlacement.RELATED)
																						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																						.addComponent(comboBoxdeleteupdate, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)))
																		.addGap(343)
																		.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
																				.addGroup(groupLayout.createSequentialGroup()
																						.addComponent(buttonReload, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(ComponentPlacement.RELATED)
																						.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
																				.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)))
																.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)))))
								.addGroup(groupLayout.createSequentialGroup()
										.addGap(535)
										.addComponent(lblAcademicsFor)))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label)
								.addComponent(label_1))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(diplaymainselectedcomboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(crnTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(confirmrnc)
								.addComponent(comboBoxdeleteupdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_3)
								.addComponent(buttonReload))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBoxcourse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(buttonRecheckRecord)
								.addComponent(deletUpdateTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(buttondeletnewentry)
								.addComponent(comboBoxsemyear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_5))
						.addGap(11)
						.addComponent(label_2)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblAcademicsFor)
						.addContainerGap(28, Short.MAX_VALUE))
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
						"Roll Number", "Student Name", "Subj_1", "Subj_2", "Subj_3", "Subj_4", "Subj_5", "Subj_6", "Subj_7"
				}
				));
		scrollPane.setColumnHeaderView(table);
		scrollPane.setViewportView(table);
		getContentPane().setLayout(groupLayout);

		java.sql.Connection conObj = JdbcConnect.createConnection();
		try {
			DisplayTableACADEMI.displayData(conObj, table, courseSem);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Academic table still epmty... no records to display", "Internal error", JOptionPane.ERROR_MESSAGE);
		}
	}

	protected void buttonReloadactionPerformed() {
		java.sql.Connection conObj = JdbcConnect.createConnection();
		try {
			DisplayTableACADEMI.displayData(conObj, table, courseSem);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Academic table still epmty... no records to display", "Internal error", JOptionPane.ERROR_MESSAGE);
		}	
	}

	protected void buttondeletnewentryactionPerformed() {
		// TODO Auto-generated method stub
		String rollNumber = deletUpdateTextField.getText();
		String course = (String) comboBox.getSelectedItem();
		String sem = (String) comboBox_1.getSelectedItem();
		courseSem = course+sem;
		String keyElement = rollNumber+courseSem;
		String operationvalue = (String) comboBoxdeleteupdate.getSelectedItem();
		if (operationvalue.equals("delete"))
		{
			DeleteRecordAC_DB.deleteR(rollNumber,keyElement);	
		}
		else if (operationvalue.equals("update/enternew"))
		{
			AcademicEntries.setString(courseSem);
			AcademicEntries.setString2(usrname);
			AcademicEntries dialog = new AcademicEntries();
			dialog.setModal(true);
			dialog.setVisible(true);
		}
	}

	protected void buttonrncactionPerformed() {
		// TODO Auto-generated method stub
		String strselectedvalue = (String) diplaymainselectedcomboBox.getSelectedItem();
		java.sql.Connection conObj = JdbcConnect.createConnection();
		if (strselectedvalue.equals("Rollnumber"))
		{				
			String givenValue = crnTextField.getText();
			try {
				ChecKSpecificRecord.setCourseSem(courseSem);
				ChecKSpecificRecord.displayData(conObj,givenValue,"","","","","SUBJECTSMARKS", table);
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
				ChecKSpecificRecord.setCourseSem(courseSem);
				ChecKSpecificRecord.displayData(conObj,"",givenValue,"","","","SUBJECTSMARKS", table);
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
				ChecKSpecificRecord.setCourseSem(courseSem);
				ChecKSpecificRecord.displayData(conObj,"","","",givenValue,"","SUBJECTSMARKS", table);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Unabale to establish connection", "Internal error", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	protected void buttonRecheckRecordactionPerformed() {
		// TODO Auto-generated method stub
		String str1 = (String) comboBoxcourse.getSelectedItem();
		String str2 = (String) comboBoxsemyear.getSelectedItem();

		courseSem = str1+str2;
		java.sql.Connection conObj = JdbcConnect.createConnection();
		try {
			DisplayTableACADEMI.displayData(conObj, table, courseSem);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Academic table still epmty... no records to display", "Internal error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void setString(String courseSem) {
		// TODO Auto-generated method stub
		AcademicDisplay.courseSem = courseSem;
	}

	public static void setString2(String usrname) {
		// TODO Auto-generated method stub
		AcademicDisplay.usrname = usrname;
	}
}
