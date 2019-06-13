package com.kwale.project.india;

	import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.HeadlessException;

@SuppressWarnings("serial")
public class AcademicEntries extends JDialog {
	private static String courseSem;
	private static String usrname;
	private JTextField rnojTextField;
	private JTextField subj1jTextField;
	private JTextField subj2jTextField;
	private JTextField subj3jTextField;
	private JTextField subj4jTextField;
	private JTextField subj5jTextField;
	private JTextField subj6jTextField;
	private JTextField subj7jTextField;
	private JTextField subj8jTextField;
	private JTextField subj9jTextField;
	private JTextField subj10jTextField;
	private JLabel lblCode;
	private JTextField code1jTextField;
	private JTextField code2jTextField;
	private JTextField code3jTextField;
	private JTextField code4jTextField;
	private JTextField code5jTextField;
	private JTextField code6jTextField;
	private JTextField code7jTextField;
	private JTextField code8jTextField;
	private JTextField code9jTextField;
	private JTextField code10jTextField;
	private JLabel lblMarks;
	private JTextField mk1jTextField;
	private JTextField mk2jTextField;
	private JTextField mk3jTextField;
	private JTextField mk4jTextField;
	private JTextField mk5jTextField;
	private JTextField mk6jTextField;
	private JTextField mk7jTextField;
	private JTextField mk8jTextField;
	private JTextField mk9jTextField;
	private JTextField mk10jTextField;
	private JLabel label;
	private JTextField crTextField;
	private JLabel label_1;
	private JButton buttoncheckrecord;
	private JTextField checkNamejTextField;
	private JButton buttoncheckname;
	private JLabel label_2;
	private JTextField drTextField;
	private JButton buttondeletrecord;
	private JButton btnCancel;
	private JLabel label_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
			AcademicEntries dialog = new AcademicEntries();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AcademicEntries() {
		getContentPane().setBackground(Color.CYAN);
		setBounds(100, 100, 843, 502);
		setLocationRelativeTo(null);
		
		JLabel lblRollNumber = new JLabel("ROLL NUMBER");
		
		rnojTextField = new JTextField();
		rnojTextField.setColumns(10);
		
		JLabel lblSubjectName = new JLabel("SUBJECT NAME");
		
		subj1jTextField = new JTextField();
		subj1jTextField.setColumns(10);
		
		subj2jTextField = new JTextField();
		subj2jTextField.setColumns(10);
		
		subj3jTextField = new JTextField();
		subj3jTextField.setColumns(10);
		
		subj4jTextField = new JTextField();
		subj4jTextField.setColumns(10);
		
		subj5jTextField = new JTextField();
		subj5jTextField.setColumns(10);
		
		subj6jTextField = new JTextField();
		subj6jTextField.setColumns(10);
		
		subj7jTextField = new JTextField();
		subj7jTextField.setColumns(10);
		
		subj8jTextField = new JTextField();
		subj8jTextField.setColumns(10);
		
		subj9jTextField = new JTextField();
		subj9jTextField.setColumns(10);
		
		subj10jTextField = new JTextField();
		subj10jTextField.setColumns(10);
		
		lblCode = new JLabel("CODE");
		
		code1jTextField = new JTextField();
		code1jTextField.setColumns(10);
		
		code2jTextField = new JTextField();
		code2jTextField.setColumns(10);
		
		code3jTextField = new JTextField();
		code3jTextField.setColumns(10);
		
		code4jTextField = new JTextField();
		code4jTextField.setColumns(10);
		
		code5jTextField = new JTextField();
		code5jTextField.setColumns(10);
		
		code6jTextField = new JTextField();
		code6jTextField.setColumns(10);
		
		code7jTextField = new JTextField();
		code7jTextField.setColumns(10);
		
		code8jTextField = new JTextField();
		code8jTextField.setColumns(10);
		
		code9jTextField = new JTextField();
		code9jTextField.setColumns(10);
		
		code10jTextField = new JTextField();
		code10jTextField.setColumns(10);
		
		lblMarks = new JLabel("MARKS");
		
		mk1jTextField = new JTextField();
		mk1jTextField.setColumns(10);
		
		mk2jTextField = new JTextField();
		mk2jTextField.setColumns(10);
		
		mk3jTextField = new JTextField();
		mk3jTextField.setColumns(10);
		
		mk4jTextField = new JTextField();
		mk4jTextField.setColumns(10);
		
		mk5jTextField = new JTextField();
		mk5jTextField.setColumns(10);
		
		mk6jTextField = new JTextField();
		mk6jTextField.setColumns(10);
		
		mk7jTextField = new JTextField();
		mk7jTextField.setColumns(10);
		
		mk8jTextField = new JTextField();
		mk8jTextField.setColumns(10);
		
		mk9jTextField = new JTextField();
		mk9jTextField.setColumns(10);
		
		mk10jTextField = new JTextField();
		mk10jTextField.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSaveactionPerformed();
			}
		});
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnUpdateactionPerformed();
			}
		});
		
		JButton btnNew = new JButton("New");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewactionPerformed();
			}
		});
		
		label = new JLabel("Check record");
		
		crTextField = new JTextField();
		crTextField.setColumns(10);
		
		label_1 = new JLabel("      roll number required");
		
		buttoncheckrecord = new JButton("Confirm");
		buttoncheckrecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttoncheckrecordactionPerformed();
			}
		});
		
		checkNamejTextField = new JTextField();
		checkNamejTextField.setColumns(10);
		
		buttoncheckname = new JButton("Confirm");
		buttoncheckname.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonchecknameactionPerformed();
			}
		});
		
		label_2 = new JLabel("Delete record");
		
		drTextField = new JTextField();
		drTextField.setColumns(10);
		
		buttondeletrecord = new JButton("Confirm");
		buttondeletrecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttondeletrecordactionPerformed();
			}
		});
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		label_3 = new JLabel("Give Academic Entries for "+courseSem);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblRollNumber)
							.addPreferredGap(ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
							.addComponent(rnojTextField, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnNew)
									.addPreferredGap(ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
									.addComponent(btnUpdate))
								.addComponent(lblSubjectName, Alignment.LEADING)
								.addComponent(subj2jTextField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
								.addComponent(subj3jTextField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
								.addComponent(subj4jTextField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
								.addComponent(subj5jTextField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
								.addComponent(subj6jTextField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
								.addComponent(subj7jTextField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
								.addComponent(subj8jTextField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
								.addComponent(subj9jTextField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
								.addComponent(subj10jTextField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
								.addComponent(subj1jTextField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(code10jTextField)
										.addComponent(code9jTextField)
										.addComponent(code8jTextField)
										.addComponent(code7jTextField)
										.addComponent(code6jTextField)
										.addComponent(code5jTextField)
										.addComponent(code4jTextField)
										.addComponent(code3jTextField)
										.addComponent(code2jTextField)
										.addComponent(code1jTextField, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
										.addComponent(lblCode))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(mk10jTextField, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
										.addComponent(mk9jTextField, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
										.addComponent(mk8jTextField, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
										.addComponent(mk7jTextField, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
										.addComponent(mk6jTextField, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
										.addComponent(mk5jTextField, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
										.addComponent(mk4jTextField, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
										.addComponent(mk3jTextField, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
										.addComponent(mk2jTextField, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
										.addComponent(lblMarks, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(mk1jTextField, 0, 0, Short.MAX_VALUE)))
								.addComponent(btnSave)))
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 382, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(69)
									.addComponent(crTextField, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE))
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(54)
									.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
									.addGap(11)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(btnCancel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
										.addComponent(buttondeletrecord, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
										.addComponent(buttoncheckname, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
										.addComponent(buttoncheckrecord, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(69)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(drTextField, Alignment.LEADING)
										.addComponent(checkNamejTextField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))))
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
							.addGap(246))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblRollNumber)
								.addComponent(rnojTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblSubjectName)
								.addComponent(lblCode)
								.addComponent(lblMarks))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(subj1jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(code1jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(mk1jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(subj2jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(code2jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(mk2jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(subj3jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(code3jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(mk3jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(subj4jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(code4jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(mk4jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(subj5jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(code5jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(mk5jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_2)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(crTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(8)
									.addComponent(label_1)
									.addGap(34)
									.addComponent(checkNamejTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(26)
									.addComponent(buttoncheckrecord)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(buttoncheckname)
							.addGap(26)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(subj6jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(code6jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(mk6jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(subj7jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(code7jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(mk7jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(drTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(buttondeletrecord)))
					.addGap(6)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(subj8jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(code8jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(mk8jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(subj9jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(code9jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(mk9jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(subj10jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(code10jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(mk10jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSave)
						.addComponent(btnUpdate)
						.addComponent(btnNew))
					.addPreferredGap(ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnCancel)
						.addComponent(label_3))
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
		setSubjectsView();
	}

	protected void buttondeletrecordactionPerformed() {
		// TODO Auto-generated method stub
		try
		{
			java.sql.Connection conObj = JdbcConnect.createConnection();
			
			String rno = drTextField.getText();
			String keyElement = rno+courseSem;

			java.sql.ResultSet rs = JdbcSelectSUBJECTSMARKS.selectRecordFromTable(conObj,keyElement);

			if (rs.next())
			{
				String pass = JOptionPane.showInputDialog(null, "Security Code", "Authentication required", JOptionPane.ERROR_MESSAGE);
				rs = JdbcSelectPASS.selectRecordFromTable(conObj,pass);
				
				if (rs.next())
				{
					int request = JOptionPane.showConfirmDialog(null, "Are your sure you want to delet Record NO. "+rno+"?", "Confirmation dialog", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
	
					if (request == JOptionPane.YES_OPTION)
					{
						int i = JdbcDeleteSM_Record.deleteRecordFromTable(conObj,keyElement);;					
	
						if (i==1)
						{
							JOptionPane.showMessageDialog(null, "Academic record entry. "+keyElement+" for "+rno+" deleted from the academic system");
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
					JOptionPane.showMessageDialog(null, "Authentication validity failed!!!", "Authentication error", JOptionPane.ERROR_MESSAGE); 
				}
			}

			else {
				JOptionPane.showMessageDialog(null, "Oops! Record entry. "+keyElement+" do not exist in the system", 
						"", JOptionPane.ERROR_MESSAGE); 			
			}
		}
		catch (java.sql.SQLException sqe)
		{
			javax.swing.JOptionPane.showMessageDialog(null, sqe.getMessage());
		}
	}

	protected void buttonchecknameactionPerformed() {
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
					rnojTextField.setText(rs.getString(1));
				}

				else {
					JOptionPane.showMessageDialog(null, "No key found for the given name", 
							"", JOptionPane.ERROR_MESSAGE);
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
		rnojTextField.setText("");
		mk1jTextField.setText("");
		mk2jTextField.setText("");
		mk3jTextField.setText("");
		mk4jTextField.setText("");
		mk5jTextField.setText("");
		mk6jTextField.setText("");
		mk7jTextField.setText("");
		mk8jTextField.setText("");
		mk9jTextField.setText("");
		mk10jTextField.setText("");
	}

	protected void buttoncheckrecordactionPerformed() {
		// TODO Auto-generated method stub
			java.sql.Connection conObj = JdbcConnect.createConnection();
			
			String rno = crTextField.getText();
			String keyElement = rno+courseSem;

			java.sql.ResultSet rs = null;
			try {
				rs = JdbcSelectSUBJECTSMARKS.selectRecordFromTable(conObj,keyElement);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Unabale to establish connection", "Internal error", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
			}

			try {
				if (rs.next())
				{
					rnojTextField.setText(rno);
					mk1jTextField.setText(rs.getString(5));
					mk2jTextField.setText(rs.getString(6));
					mk3jTextField.setText(rs.getString(7));
					mk4jTextField.setText(rs.getString(8));
					mk5jTextField.setText(rs.getString(9));
					mk6jTextField.setText(rs.getString(10));
					mk7jTextField.setText(rs.getString(11));
					mk8jTextField.setText(rs.getString(12));
					mk9jTextField.setText(rs.getString(13));
					mk10jTextField.setText(rs.getString(14));
				}

				else {
					JOptionPane.showMessageDialog(null, "Oops! Record entry. "+keyElement+" do not exist in the system", 
							"", JOptionPane.ERROR_MESSAGE); 			
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
	protected void btnUpdateactionPerformed() {
		// TODO Auto-generated method stub
			int i = 0;
			java.sql.Connection conObj = JdbcConnect.createConnection();
			
			java.util.Vector subjectName = new java.util.Vector();

			subjectName.add(subj1jTextField.getText());
			subjectName.add(subj2jTextField.getText());
			subjectName.add(subj3jTextField.getText());
			subjectName.add(subj4jTextField.getText());
			subjectName.add(subj5jTextField.getText());
			subjectName.add(subj6jTextField.getText());
			subjectName.add(subj7jTextField.getText());
			subjectName.add(subj8jTextField.getText());
			subjectName.add(subj9jTextField.getText());
			subjectName.add(subj10jTextField.getText());
			subjectName.add(courseSem);

			try {
				i = JdbcUpdateACADEMII.updateRecordFromTable(conObj,subjectName,"SUBJECTSNAMES","BATCH");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Unabale to establish connection", "Internal error", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
			}

			if (i==0)
			{
					JOptionPane.showMessageDialog(null, "Something happened with Record NO. "+(rnojTextField.getText())+courseSem,
							"Internal error", JOptionPane.ERROR_MESSAGE);
			}
			
			else {	
				i = 0;
				java.util.Vector codeNumber = new java.util.Vector();

				codeNumber.add(code1jTextField.getText());
				codeNumber.add(code2jTextField.getText());
				codeNumber.add(code3jTextField.getText());
				codeNumber.add(code4jTextField.getText());
				codeNumber.add(code5jTextField.getText());
				codeNumber.add(code6jTextField.getText());
				codeNumber.add(code7jTextField.getText());
				codeNumber.add(code8jTextField.getText());
				codeNumber.add(code9jTextField.getText());
				codeNumber.add(code10jTextField.getText());
				codeNumber.add(courseSem);

				try {
					i = JdbcUpdateACADEMII.updateRecordFromTable(conObj,codeNumber,"SUBJECTSCODES","BATCH");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Unabale to establish connection", "Internal error", JOptionPane.ERROR_MESSAGE);
					JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
				}

				if (i==0)
				{
						JOptionPane.showMessageDialog(null, "Something happened with Record NO. "+(rnojTextField.getText())+courseSem,
								"Internal error", JOptionPane.ERROR_MESSAGE);
				}
				else {
					i = 0;

					java.util.Vector subMarks = new java.util.Vector();
					subMarks.add(mk1jTextField.getText());
					subMarks.add(mk2jTextField.getText());
					subMarks.add(mk3jTextField.getText());
					subMarks.add(mk4jTextField.getText());
					subMarks.add(mk5jTextField.getText());
					subMarks.add(mk6jTextField.getText());
					subMarks.add(mk7jTextField.getText());
					subMarks.add(mk8jTextField.getText());
					subMarks.add(mk9jTextField.getText());
					subMarks.add(mk10jTextField.getText());
					subMarks.add((rnojTextField.getText())+courseSem);
	
					try {
						i = JdbcUpdateACADEMII.updateRecordFromTable(conObj,subMarks,"SUBJECTSMARKS","KEYELEMENT");
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null, "Unabale to establish connection", "Internal error", JOptionPane.ERROR_MESSAGE);
						JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
					}

					if (i==0)
					{
							JOptionPane.showMessageDialog(null, "Something happened with Record entry. "+(rnojTextField.getText())+courseSem,
									"Internal error", JOptionPane.ERROR_MESSAGE);
					}
					else {	
						javax.swing.JOptionPane.showMessageDialog(null, "Record NO. "+(rnojTextField.getText())+" updated successiful");
					}
				}
			}				
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected void btnSaveactionPerformed() {
		// TODO Auto-generated method stub
		try
		{
			String monthDate = GetCurrentDateTime.getDateTime();
			java.util.Vector subjectName = new java.util.Vector();
			java.util.Vector codeNumber = new java.util.Vector();
			java.util.Vector subMarks = new java.util.Vector();

			Connection conObj = JdbcConnect.createConnection();
			ResultSet rs = JdbcSelect.selectRecordFromTable(conObj,(rnojTextField.getText()));
			
			if (rs.next())
			{
				String rollnumber = rs.getString(1);
				
				codeNumber.add(courseSem);
				codeNumber.add(code1jTextField.getText());
				codeNumber.add(code2jTextField.getText());
				codeNumber.add(code3jTextField.getText());
				codeNumber.add(code4jTextField.getText());
				codeNumber.add(code5jTextField.getText());
				codeNumber.add(code6jTextField.getText());
				codeNumber.add(code7jTextField.getText());
				codeNumber.add(code8jTextField.getText());
				codeNumber.add(code9jTextField.getText());
				codeNumber.add(code10jTextField.getText());

				subjectName.add(courseSem);
				subjectName.add(subj1jTextField.getText());
				subjectName.add(subj2jTextField.getText());
				subjectName.add(subj3jTextField.getText());
				subjectName.add(subj4jTextField.getText());
				subjectName.add(subj5jTextField.getText());
				subjectName.add(subj6jTextField.getText());
				subjectName.add(subj7jTextField.getText());
				subjectName.add(subj8jTextField.getText());
				subjectName.add(subj9jTextField.getText());
				subjectName.add(subj10jTextField.getText());
					
				subMarks.add(rollnumber+courseSem);
				subMarks.add(courseSem);
				subMarks.add(rollnumber);
				subMarks.add(rs.getString(2));
				subMarks.add(mk1jTextField.getText());
				subMarks.add(mk2jTextField.getText());
				subMarks.add(mk3jTextField.getText());
				subMarks.add(mk4jTextField.getText());
				subMarks.add(mk5jTextField.getText());
				subMarks.add(mk6jTextField.getText());
				subMarks.add(mk7jTextField.getText());
				subMarks.add(mk8jTextField.getText());
				subMarks.add(mk9jTextField.getText());
				subMarks.add(mk10jTextField.getText());
				subMarks.add(monthDate+"User@"+usrname);
				subMarks.add(rs.getString(5));
				
				JdbcSearchTable.searchTable("SUBJECTSNAMES",conObj,codeNumber,subMarks,subjectName);
			}

		else {
			JOptionPane.showMessageDialog(null, "The given key do not exist in the main database", "", JOptionPane.ERROR_MESSAGE); 
		}
		
		}
		catch (java.sql.SQLException sqe)
		{
			sqe.printStackTrace();
			javax.swing.JOptionPane.showMessageDialog(null, sqe.getMessage(), "Internal error", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void setSubjectsView() {
		// TODO Auto-generated method stub
		try
		{
			Connection conObj = JdbcConnect.createConnection();
			ResultSet rs = JdbcSelectSUBNAM.selectRecordFromTable(conObj,courseSem);				
			if (rs.next())
			{
				subj1jTextField.setText(rs.getString(2));
				subj2jTextField.setText(rs.getString(3));
				subj3jTextField.setText(rs.getString(4));
				subj4jTextField.setText(rs.getString(5));
				subj5jTextField.setText(rs.getString(6));
				subj6jTextField.setText(rs.getString(7));
				subj7jTextField.setText(rs.getString(8));
				subj8jTextField.setText(rs.getString(9));
				subj9jTextField.setText(rs.getString(10));
				subj10jTextField.setText(rs.getString(11));

				rs = JdbcSelectSUBCO.selectRecordFromTable(conObj,courseSem);

				if (rs.next())
				{
					code1jTextField.setText(rs.getString(2));
					code2jTextField.setText(rs.getString(3));
					code3jTextField.setText(rs.getString(4));
					code4jTextField.setText(rs.getString(5));
					code5jTextField.setText(rs.getString(6));
					code6jTextField.setText(rs.getString(7));
					code7jTextField.setText(rs.getString(8));
					code8jTextField.setText(rs.getString(9));
					code9jTextField.setText(rs.getString(10));
					code10jTextField.setText(rs.getString(11));					
				}

				else {
				}
			}

			else {
			}
		}
		catch (java.sql.SQLException sqe)
		{
			JOptionPane.showMessageDialog(null, "This the first time we are accessing the entry part of "+courseSem
					+ " lets ensure we give subjects names and codes correctly"
					+ "\n This operation is done only once for every initial entry", 
					"",
					JOptionPane.ERROR_MESSAGE);
		//	JOptionPane.showMessageDialog(null, sqe.getMessage());
		}

	}

	public static void setString(String courseSem) {
		// TODO Auto-generated method stub
		AcademicEntries.courseSem = courseSem;
	}

	public static void setString2(String usrname) {
		// TODO Auto-generated method stub
		AcademicEntries.usrname = usrname;
	}
}
