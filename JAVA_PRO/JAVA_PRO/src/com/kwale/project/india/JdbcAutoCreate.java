package com.kwale.project.india;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Vector;

public class JdbcAutoCreate
{
	public static Statement st;
    
	@SuppressWarnings("rawtypes")
	public static void createAutoTable(Vector codeNumber,Connection conObj,Vector subMarks,Vector subNames,String tableName)
	{
		try	
		{
			st=conObj.createStatement();
			String crtQry = "CREATE TABLE "+tableName+"("
				+"\"BATCH\"	  VARCHAR(15) NOT NULL,"
				+"\"SUBJ_1\"  VARCHAR(50),"
				+"\"SUBJ_2\"  VARCHAR(50),"
				+"\"SUBJ_3\"  VARCHAR(50),"
				+"\"SUBJ_4\"  VARCHAR(50),"
				+"\"SUBJ_5\"  VARCHAR(50),"
				+"\"SUBJ_6\"  VARCHAR(50),"
				+"\"SUBJ_7\"  VARCHAR(50),"
				+"\"SUBJ_8\"  VARCHAR(50),"
				+"\"SUBJ_9\"  VARCHAR(50),"
				+"\"SUBJ_10\" VARCHAR(50),"
				+"PRIMARY KEY(\"BATCH\")"
				+")";
			int i=st.executeUpdate(crtQry);
			
			if (!(i==1))
			{
				int j = JdbcInsertSUBJECTNAME.insertRecords(conObj,subNames,tableName);
				if (j!=1)
				{
					JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
				}

				else {
					String crtQuery = "CREATE TABLE SUBJECTSCODES("
						+"\"BATCH\"	  VARCHAR(15) NOT NULL,"
						+"\"SUBJ_1\"  VARCHAR(50),"
						+"\"SUBJ_2\"  VARCHAR(50),"
						+"\"SUBJ_3\"  VARCHAR(50),"
						+"\"SUBJ_4\"  VARCHAR(50),"
						+"\"SUBJ_5\"  VARCHAR(50),"
						+"\"SUBJ_6\"  VARCHAR(50),"
						+"\"SUBJ_7\"  VARCHAR(50),"
						+"\"SUBJ_8\"  VARCHAR(50),"
						+"\"SUBJ_9\"  VARCHAR(50),"
						+"\"SUBJ_10\" VARCHAR(50),"
						+"PRIMARY KEY(\"BATCH\")"
						+")";

					 int k =st.executeUpdate(crtQuery);

						 if (!(k==1))
						 {
							int l = JdbcInsertSUBJECTCODE.insertRecords(conObj,codeNumber,"SUBJECTSCODES");
							if (l!=1)
							{
								javax.swing.JOptionPane.showMessageDialog(null, "Record NO. "+subMarks.get(0)+"not inserted\nPlease try again...");
							}
							else {
								String crtQuer = "CREATE TABLE SUBJECTSMARKS("
									+"\"KEYELEMENT\"	VARCHAR(30) NOT NULL,"
									+"\"BATCH\"			VARCHAR(15),"
									+"\"ROLL_NUMBER\"   VARCHAR(15),"
									+"\"STUDENT_NAME\"  VARCHAR(50),"
									+"\"SUBJ_1\"  		VARCHAR(50),"
									+"\"SUBJ_2\"  		VARCHAR(50),"
									+"\"SUBJ_3\"  		VARCHAR(50),"
									+"\"SUBJ_4\"  		VARCHAR(50),"
									+"\"SUBJ_5\"  		VARCHAR(50),"
									+"\"SUBJ_6\"  		VARCHAR(50),"
									+"\"SUBJ_7\"  		VARCHAR(50),"
									+"\"SUBJ_8\"  		VARCHAR(50),"
									+"\"SUBJ_9\"  		VARCHAR(50),"
									+"\"SUBJ_10\" 		VARCHAR(50),"
									+"\"DATEUSER\"		VARCHAR(50),"
									+"\"COLLEGE\"		VARCHAR(15),"
									+"PRIMARY KEY(\"KEYELEMENT\")"
									+")";
								 int m =st.executeUpdate(crtQuer);

								 if (!(m==1))
								 {
									int n = JdbcInsertSUBJECTMARK.insertRecords(conObj,subMarks,"SUBJECTSMARKS");
									if (n!=1)
									{
										javax.swing.JOptionPane.showMessageDialog(null, "Record NO. "+subMarks.get(0)+"not inserted\nPlease try again...");
									}
									else {
										javax.swing.JOptionPane.showMessageDialog(null, "Record NO. "+subMarks.get(0)+" inserted successful");
									}
								 }

								else{
									JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
								}
							}	
						 }
						
						else
							{
							  JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
						}			
					}
			}
			
			else {
				JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
			}
		}
		catch (java.sql.SQLException sqe)
		{
			javax.swing.JOptionPane.showMessageDialog(null, sqe.getMessage());
		}
	}
}
