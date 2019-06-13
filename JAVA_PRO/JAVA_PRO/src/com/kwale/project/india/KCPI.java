  package com.kwale.project.india;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.sql.SQLException;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class KCPI extends JFrame {

	private JComboBox yrComboBox;
	private JComboBox monthComboBox;
	private JPanel contentPane;
	private JTextField rollNOTextField;
	private JTextField nameTextField;
	private JTextField wardTextField;
	private JTextField passTextField;
	private JTextField collegeTextField;
	private JTextField courseTextField;
	private JTable table;
	private JTextField crTextField;
	private JTextField drTextField;
	private JTextField crnTextField;
	private JButton btnUser;
	private static String usrname; 
	private JComboBox diplaymainselectedcomboBox;
	private JComboBox comboBoxcourse;
	private JComboBox comboBoxsemyear;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private String gender;
	private JRadioButton rdbtnM;
	private JRadioButton rdbtnF;
	
	/**
	 * Create the frame.
	 */
	public KCPI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1250, 630);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblRollNumber = new JLabel("ROLL NUMBER\t\t*");
		lblRollNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblName = new JLabel("NAME\t\t*");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblWard = new JLabel("WARD");
		lblWard.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblPassNumber = new JLabel("PASS NUMBER");
		lblPassNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblCollege = new JLabel("COLLEGE");
		lblCollege.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblCourse = new JLabel("COURSE");
		lblCourse.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		rollNOTextField = new JTextField();
		rollNOTextField.setColumns(10);
		
		nameTextField = new JTextField();
		nameTextField.setColumns(10);
		
		wardTextField = new JTextField();
		wardTextField.setColumns(10);
		
		passTextField = new JTextField();
		passTextField.setColumns(10);
		
		collegeTextField = new JTextField();
		collegeTextField.setColumns(10);
		
		courseTextField = new JTextField();
		courseTextField.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnSaveactionPerformed();
			}
		});
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnUpdateactionPerformed();
			}
		});
		
		JButton btnNew = new JButton("New");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNewactionPerformed();
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		
		btnUser = new JButton();
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnUseractionPerformed();
			}
		});
		btnUser.setText("User@"+usrname);
		crTextField = new JTextField();
		crTextField.setColumns(10);
		
		JLabel lblCheckReord = new JLabel("Check record");
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnConfirmactionPerformed();
			}
		});
		
		JLabel lblNewLabel = new JLabel("Delete record");
		
		drTextField = new JTextField();
		drTextField.setColumns(10);
		
		JButton btnConfirmdr = new JButton("Confirm");
		btnConfirmdr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnConfirmdractionPerformed();
			}
		});
		
		JLabel lblDisplay = new JLabel("Display");
		
		JButton btnConfirmdisplay = new JButton("Confirm");
		btnConfirmdisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnConfirmdisplayactionPerformed();
			}
		});
		
		JLabel lblCheckRecordBased = new JLabel("Check record based on");
		
		diplaymainselectedcomboBox = new JComboBox();
		diplaymainselectedcomboBox.setModel(new DefaultComboBoxModel(new String[] {"Rollnumber", "Name", "Ward", "College", "Course"}));
		
		crnTextField = new JTextField();
		crnTextField.setColumns(10);
		
		JButton btnConfirmcheckspecific = new JButton("Confirm");
		btnConfirmcheckspecific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnConfirmcheckspecificactionPerformed();
			}
		});
		
		JLabel lblFinance = new JLabel("FINANCE");
		
		JLabel lblSelectMonthAnd = new JLabel("Select month and year of entry");
		
		monthComboBox = new JComboBox();
		monthComboBox.setModel(new DefaultComboBoxModel(new String[] {"Jan", "Feb", "Match", "April", "May ", "June ", "July", "Aug", "Sept ", "Oct", "Nov", "Dec "}));
		
		yrComboBox = new JComboBox();
		yrComboBox.setModel(new DefaultComboBoxModel(new String[] {"2014", "2015", "2016", "2017", "2018", "2019", "2020"}));
		
		JButton btnEnterRecord = new JButton("Enter records");
		btnEnterRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnEnterRecordaddActionListener();
			}
		});
		
		JLabel lblDisplayTheFinancial = new JLabel("Display financial records");
		
		JButton btnDisplayDatafinance = new JButton("Display data");
		btnDisplayDatafinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDisplayDatafinanceactionPerformed();
			}
		});
		
		JLabel lblAcademics = new JLabel("ACADEMICS");
		
		JLabel lblSelectCourseAnd = new JLabel("Select course and semester/year of entry");
		
		comboBoxcourse = new JComboBox();
		comboBoxcourse.setModel(new DefaultComboBoxModel(new String[] {"BBA", "BCA", "B.COM", "BA/LLB "}));
		
		comboBoxsemyear = new JComboBox();
		comboBoxsemyear.setModel(new DefaultComboBoxModel(new String[] {"first", "second", "third", "fourth", "fifth", "sixth"}));
		
		JButton btnEnterRecordsAcademics = new JButton("Enter records");
		btnEnterRecordsAcademics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEnterRecordsAcademicsactionPerformed();
			}
		});
		
		JLabel lblDisplayAcademicRecords = new JLabel("Display academic records based on course_semester");
		
		JButton btnDisplayDataAcademics = new JButton("Display data ");
		btnDisplayDataAcademics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDisplayDataAcademicsactionPerformed();
			}
		});
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnPrintactionPerformed();
			}
		});
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		rdbtnM = new JRadioButton("M", true);
		buttonGroup.add(rdbtnM);
		rdbtnM.setBackground(Color.CYAN);

		rdbtnF = new JRadioButton("F");
		buttonGroup.add(rdbtnF);
		rdbtnF.setBackground(Color.CYAN);
		
		JButton btnLogOut = new JButton("log out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLogOutactionPerformed();
			}
		});
        
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblDisplay)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnConfirmdisplay))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblCourse, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblWard, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblRollNumber, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
												.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblPassNumber, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblCollege, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblGender, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
												.addComponent(lblCheckReord))
											.addPreferredGap(ComponentPlacement.UNRELATED))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblNewLabel)
											.addGap(47)))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(collegeTextField, 201, 201, 201)
										.addComponent(passTextField, 201, 201, 201)
										.addComponent(wardTextField, 201, 201, 201)
										.addComponent(nameTextField, 201, 201, 201)
										.addComponent(rollNOTextField, 201, 201, 201)
										.addComponent(courseTextField, 201, 201, 201)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(drTextField, Alignment.LEADING)
												.addComponent(crTextField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(crnTextField, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addComponent(btnConfirmdr)
												.addComponent(btnConfirmcheckspecific, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btnUpdate)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(btnNew, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addGap(4))
												.addComponent(btnConfirm)))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(rdbtnM)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(rdbtnF)))))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(14)
									.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblSelectMonthAnd)
										.addComponent(lblFinance)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(monthComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(yrComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addComponent(btnEnterRecord)
										.addComponent(lblDisplayTheFinancial)
										.addComponent(btnDisplayDatafinance))
									.addGap(37)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnDisplayDataAcademics)
										.addComponent(lblDisplayAcademicRecords)
										.addComponent(btnEnterRecordsAcademics)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(comboBoxcourse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(comboBoxsemyear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblAcademics, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
											.addComponent(btnPrint))
										.addComponent(lblSelectCourseAnd)))))
						.addComponent(lblCheckRecordBased)
						.addComponent(diplaymainselectedcomboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(btnUser, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
							.addGap(19)
							.addComponent(btnLogOut)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnUser)
						.addComponent(btnLogOut))
					.addGap(8)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblRollNumber)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(rollNOTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblName))))
							.addGap(23)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblWard)
								.addComponent(wardTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(17)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblPassNumber)
								.addComponent(passTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(24)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCollege)
								.addComponent(collegeTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(19)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblCourse)
								.addComponent(courseTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblGender)
										.addComponent(rdbtnM)
										.addComponent(rdbtnF))
									.addGap(12)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnSave)
										.addComponent(btnUpdate)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(63)
									.addComponent(btnNew))))
						.addComponent(scrollPane, 0, 0, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblCheckReord)
							.addComponent(crTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnConfirm)
							.addComponent(lblFinance)
							.addComponent(lblAcademics))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnPrint)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel)
										.addComponent(drTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnConfirmdr))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblDisplay)
										.addComponent(btnConfirmdisplay))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblCheckRecordBased)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(diplaymainselectedcomboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(crnTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnConfirmcheckspecific)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblSelectMonthAnd)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(monthComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(yrComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnEnterRecord)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblDisplayTheFinancial)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnDisplayDatafinance))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(lblSelectCourseAnd)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBoxcourse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBoxsemyear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnEnterRecordsAcademics)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblDisplayAcademicRecords)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnDisplayDataAcademics)))
					.addContainerGap(80, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Roll Number", "Student Name", "Ward", "Passport Number", "College", "Course"
			}
		));
		scrollPane.setColumnHeaderView(table);
		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
	}

	protected void btnPrintactionPerformed() {
		// TODO Auto-generated method stub
		try {
			table.print();
		} catch (PrinterException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage(), "Internal Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	protected void btnLogOutactionPerformed() {
		// TODO Auto-generated method stub
		dispose();
		LoginInterFace frame = new LoginInterFace();
		frame.setSize(1250, 700);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	protected void btnUseractionPerformed() {
		// TODO Auto-generated method stub
		UserPanel.setString(usrname);
		UserPanel dialog = new UserPanel();
		dialog.setModal(true);
		dialog.setVisible(true);
	}

	protected void btnDisplayDataAcademicsactionPerformed() {
		// TODO Auto-generated method stub
		String str1 = (String) comboBoxcourse.getSelectedItem();
		String str2 = (String) comboBoxsemyear.getSelectedItem();
		
		String courseSem = str1+str2;

		java.sql.ResultSet rs = null;
		java.sql.Connection conObj = JdbcConnect.createConnection();
		try {
			rs = JdbcSelectUname.selectRecordFromTable(conObj,usrname);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage(), "Internal error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
		}

		try {
			if (rs.next())
			{
				AcademicDisplay.setString2(usrname);
				AcademicDisplay.setString(courseSem);
				AcademicDisplay dialog = new AcademicDisplay();
				dialog.setModal(true);
				dialog.setVisible(true);	
			}

			else {
				String pass = javax.swing.JOptionPane.showInputDialog(null, "Security Code", "Authentication required", javax.swing.JOptionPane.ERROR_MESSAGE);
				rs = JdbcSelectPASS.selectRecordFromTable(conObj,pass);

				if (rs.next())
				{
					AcademicDisplay.setString2(usrname);
					AcademicDisplay.setString(courseSem);
					AcademicDisplay dialog = new AcademicDisplay();
					dialog.setModal(true);
					dialog.setVisible(true);			
				}

				else {
					javax.swing.JOptionPane.showMessageDialog(null, "Authentication failed!!!", "User@"+usrname+" authentication", javax.swing.JOptionPane.ERROR_MESSAGE); 
				}
			}
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage(), "Internal error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage(), "Internal error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
		}

	}

	protected void btnEnterRecordsAcademicsactionPerformed() {
		// TODO Auto-generated method stub
		String str1 = (String) comboBoxcourse.getSelectedItem();
		String str2 = (String) comboBoxsemyear.getSelectedItem();
		
		String courseSem = str1+str2;
		AcademicEntries.setString(courseSem);
		AcademicEntries.setString2(usrname);
		AcademicEntries dialog = new AcademicEntries();
		dialog.setModal(true);
		dialog.setVisible(true);
	}

	protected void btnDisplayDatafinanceactionPerformed() {
			java.sql.ResultSet rs = null;
			java.sql.Connection conObj = JdbcConnect.createConnection();
			try {
				rs = JdbcSelectUname.selectRecordFromTable(conObj,usrname);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage(), "Internal error", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
			}
	
			try {
				if (rs.next())
				{
					FinRecords.setString(usrname);
					FinRecords dialog = new FinRecords();
					dialog.setLocationRelativeTo(null);
					dialog.setModal(true);
					dialog.setVisible(true);			
				}

				else {
					String pass = javax.swing.JOptionPane.showInputDialog(null, "Security Code", "Authentication required", javax.swing.JOptionPane.ERROR_MESSAGE);
					rs = JdbcSelectPASS.selectRecordFromTable(conObj,pass);

					if (rs.next())
					{
						FinRecords.setString(usrname);
						FinRecords dialog = new FinRecords();
						dialog.setLocationRelativeTo(null);
						dialog.setModal(true);
						dialog.setVisible(true);			
					}

					else {
						javax.swing.JOptionPane.showMessageDialog(null, "Authentication failed!!!", "User@"+usrname+" authentication", javax.swing.JOptionPane.ERROR_MESSAGE); 
					}
				}
			} catch (HeadlessException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage(), "Internal error", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage(), "Internal error", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
			}
	}

	protected void btnEnterRecordaddActionListener() {
		// TODO Auto-generated method stub
		String str1 = (String) monthComboBox.getSelectedItem();
		String str2 = (String) yrComboBox.getSelectedItem();
		String monthYear = str1+str2;		

		int request = javax.swing.JOptionPane.showConfirmDialog(null, "Do the entries involves school fees?", "Confirmation dialog", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.PLAIN_MESSAGE);
		if (request == javax.swing.JOptionPane.YES_OPTION)
		{
			ENTRIESWITH.setString(monthYear);
			ENTRIESWITH.setString2(usrname);
			ENTRIESWITH dialog = new ENTRIESWITH();
			dialog.setModal(true);
			dialog.setVisible(true);
		}

		else if (request == javax.swing.JOptionPane.NO_OPTION)
		{
			ENTRIES.setString(monthYear);
			ENTRIES.setString2(usrname);
			ENTRIES dialog = new ENTRIES();
			dialog.setModal(true);
			dialog.setVisible(true);
		}
	}

	protected void btnConfirmcheckspecificactionPerformed() {
		// TODO Auto-generated method stub
		String strselectedvalue = (String) diplaymainselectedcomboBox.getSelectedItem();
		java.sql.Connection conObj = JdbcConnect.createConnection();
		if (strselectedvalue.equals("Rollnumber"))
		{				
			String givenValue = crnTextField.getText();
			try {
				ChecKSpecificRecord.displayData(conObj,givenValue,"","","","","MAINRECORD", table);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage(), "Internal error", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if (strselectedvalue.equals("Name"))
		{
			String givenValue = crnTextField.getText().toUpperCase();
			try {
				ChecKSpecificRecord.displayData(conObj,"",givenValue,"","","","MAINRECORD", table);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage(), "Internal error", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
			}	
		}
		
		else if (strselectedvalue.equals("Ward"))
		{
			String givenValue = crnTextField.getText().toUpperCase();
			try {
				ChecKSpecificRecord.displayData(conObj,"","",givenValue,"","","MAINRECORD", table);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage(), "Internal error", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if (strselectedvalue.equals("College"))
		{
			String givenValue = crnTextField.getText().toUpperCase();
			try {
				ChecKSpecificRecord.displayData(conObj,"","","",givenValue,"","MAINRECORD", table);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage(), "Internal error", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		else if (strselectedvalue.equals("Course"))
		{
			String givenValue = crnTextField.getText().toUpperCase();
			try {
				ChecKSpecificRecord.displayData(conObj,"","","","",givenValue,"MAINRECORD", table);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage(), "Internal error", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	protected void btnConfirmdisplayactionPerformed() {
		// TODO Auto-generated method stub
			java.sql.ResultSet rs = null;
			java.sql.Connection conObj = JdbcConnect.createConnection();
			try {
				rs = JdbcSelectUname.selectRecordFromTable(conObj,usrname);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage(), "Internal error", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
			}
			
			try {
				if (rs.next())
				{
					DisplayTable.displayData(conObj,table);
				}

				else {
					String pass = JOptionPane.showInputDialog(null, "Security Code", "Authentication required", JOptionPane.ERROR_MESSAGE);
					rs = JdbcSelectPASS.selectRecordFromTable(conObj,pass);
					
					if (rs.next())
					{
						DisplayTable.displayData(conObj,table);
					}
					
					else {
						JOptionPane.showMessageDialog(null, "Authentication failed!!!", "User@"+usrname+" authentication", JOptionPane.ERROR_MESSAGE); 
					}
				}
			} catch (HeadlessException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage(), "Internal error", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage(), "Internal error", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
			}
	}

	protected void btnConfirmdractionPerformed() {
		// TODO Auto-generated method stub
				java.sql.ResultSet rs = null;
				String rno = drTextField.getText();
				java.sql.Connection conObj = JdbcConnect.createConnection();
				try {
					rs = JdbcSelectUname.selectRecordFromTable(conObj,usrname);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e.getMessage(), "Internal error", JOptionPane.ERROR_MESSAGE);
					JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
				}
				
				try {
					if (rs.next())
					{
						int request = JOptionPane.showConfirmDialog(null, "Are your sure you want to delet Record NO. "+rno+"?", "Confirmation dialog", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
						
						if (request == JOptionPane.YES_OPTION)
						{
							int i = JdbcDelete.deleteRecordFromTable(conObj,rno);
							
							if (i==1)
							{
								JOptionPane.showMessageDialog(null, "Record NO. "+rno+" deleted from the system");
							}

							else {
								JOptionPane.showMessageDialog(null, "Oops! Record NO. "+rno+" do not exist in the system"); 
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
								int i = JdbcDelete.deleteRecordFromTable(conObj,rno);

								if (i==1)
								{
									JOptionPane.showMessageDialog(null, "Record NO. "+rno+" deleted from the system");
								}

								else {
									JOptionPane.showMessageDialog(null, "Oops! Record NO. "+rno+" do not exist in the system"); 
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
					JOptionPane.showMessageDialog(null, e.getMessage(), "Internal error", JOptionPane.ERROR_MESSAGE);
					JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e.getMessage(), "Internal error", JOptionPane.ERROR_MESSAGE);
					JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
				}
	}

	protected void btnConfirmactionPerformed() {
		// TODO Auto-generated method stub
			java.sql.Connection conObj = JdbcConnect.createConnection();
			
			String rno = crTextField.getText();
			java.sql.ResultSet rs=null;
			try {
				rs = JdbcSelect.selectRecordFromTable(conObj,rno);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage(), "Internal error", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
			}

			try {
				if (rs.next())
				{
					rollNOTextField.setText(rs.getString(1));
					nameTextField.setText(rs.getString(2));
					wardTextField.setText(rs.getString(4));
					passTextField.setText(rs.getString(5));
					collegeTextField.setText(rs.getString(6));
					courseTextField.setText(rs.getString(7));
				}

				else {
					JOptionPane.showMessageDialog(null, "Oops! Record NO. "+rno+" do not exist in the system", "Internal error", JOptionPane.ERROR_MESSAGE); 			
				}
			} catch (HeadlessException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage(), "Internal error", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
			}
	}

	protected void btnNewactionPerformed() {
		// TODO Auto-generated method stub
		rollNOTextField.setText("");
		nameTextField.setText("");
		wardTextField.setText("");
		passTextField.setText("");
		collegeTextField.setText("");
		courseTextField.setText("");
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected void btnUpdateactionPerformed() {
		// TODO Auto-generated method stub
		if (rdbtnM.isSelected()) {
			gender = rdbtnM.getText();
		}
		
		else if(rdbtnF.isSelected()) {
			gender = rdbtnF.getText();
		}
		
		String monthDate = GetCurrentDateTime.getDateTime();
		java.sql.Connection conObj = JdbcConnect.createConnection();
		
		java.util.Vector update_row = new java.util.Vector();
		java.util.Vector update_rowfinmain = new java.util.Vector();
		java.util.Vector update_rowacamain = new java.util.Vector();
		
		update_row.add(nameTextField.getText().toUpperCase());
		update_row.add(gender);
		update_row.add(wardTextField.getText().toUpperCase());
		update_row.add(passTextField.getText().toUpperCase());
		update_row.add(collegeTextField.getText().toUpperCase());
		update_row.add(courseTextField.getText().toUpperCase());
		update_row.add("updated"+monthDate+btnUser.getText());
		update_row.add(rollNOTextField.getText().toUpperCase());
		
		update_rowfinmain.add(nameTextField.getText().toUpperCase());
		update_rowfinmain.add(wardTextField.getText().toUpperCase());
		update_rowfinmain.add(collegeTextField.getText().toUpperCase());
		update_rowfinmain.add(courseTextField.getText().toUpperCase());
		update_rowfinmain.add(rollNOTextField.getText().toUpperCase());
		
		update_rowacamain.add(nameTextField.getText().toUpperCase());
		update_rowacamain.add(collegeTextField.getText().toUpperCase());
		update_rowacamain.add(rollNOTextField.getText().toUpperCase());

		int i=0;
		try {
			i = JdbcUpdate.updateRecordFromTable(conObj,update_row);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage(), "Internal error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
		}
		
		try {
			JdbcUpdateFINMAIN.updateRecordFromTable(conObj,update_rowfinmain);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage(), "Internal error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
		}
		
		try {
			JdbcUpdateACAMAIN.updateRecordFromTable(conObj,update_rowacamain);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage(), "Internal error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
		}
		
		if (i==0)
		{
				JOptionPane.showMessageDialog(null, "Internal Error", "", JOptionPane.ERROR_MESSAGE);
		}
		
		else {	
				JOptionPane.showMessageDialog(null, "Record NO. "+rollNOTextField.getText()+" updated successiful");
		}	
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected void btnSaveactionPerformed() {
		// TODO Auto-generated method stub
			if (rdbtnM.isSelected()) {
				gender = rdbtnM.getText();
			}
			
			else if(rdbtnF.isSelected()) {
				gender = rdbtnF.getText();
			}
			
			String monthDate = GetCurrentDateTime.getDateTime();
			java.sql.Connection conObj = JdbcConnect.createConnection();
			String rollnumber = rollNOTextField.getText();
			if (12==rollnumber.length())
			{
				Vector add_rows = new Vector();
				add_rows.add(rollnumber);
				add_rows.add(nameTextField.getText().toUpperCase());
				add_rows.add(gender);
				add_rows.add(wardTextField.getText().toUpperCase());
				add_rows.add(passTextField.getText().toUpperCase());
				add_rows.add(collegeTextField.getText().toUpperCase());
				add_rows.add(courseTextField.getText().toUpperCase());
				add_rows.add(monthDate+btnUser.getText());
				
				try {
					JdbcSearchT.searchTable("MAINRECORD",conObj,add_rows);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e.getMessage(), "Internal error", JOptionPane.ERROR_MESSAGE);
					JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Invalid roll number","", JOptionPane.ERROR_MESSAGE);
			}
	}

	public static void setString(String usrName) {
		// TODO Auto-generated method stub
		usrname = usrName;
	}
}