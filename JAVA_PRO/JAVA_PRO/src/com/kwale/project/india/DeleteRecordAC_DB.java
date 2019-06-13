package com.kwale.project.india;

import java.awt.HeadlessException;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DeleteRecordAC_DB {

	public static void deleteR(String rno, String keyElement) {
		// TODO Auto-generated method stub
		java.sql.Connection conObj = JdbcConnect.createConnection();
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
}
