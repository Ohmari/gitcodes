package com.kwale.project.india;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JOptionPane;

public class JdbcCreateTableM_DB {
	public static Statement st;
	
	@SuppressWarnings("rawtypes")
	public static void createAutoTable(Connection conObj,String tableName, Vector add_rows)
	{
		try	
		{
			st=conObj.createStatement();
			String crtQry = "CREATE TABLE "+tableName+"("
				+"\"ROLL_NUMBER\"		NUMBER NOT NULL,"
				+"\"STUDENT_NAME\"		CHAR(50) NOT NULL,"
				+"\"G\"					CHAR(1),"
				+"\"WARD\"  			VARCHAR(15),"
				+"\"PASSPORT_NUMBER\"	VARCHAR(15),"
				+"\"COLLEGE\"			VARCHAR(15),"
				+"\"COURSE\"			VARCHAR(15),"
				+"\"DATEUSER\"			VARCHAR(50),"
				+"PRIMARY KEY(\"ROLL_NUMBER\")"
				+")";

			boolean i=st.execute(crtQry);
			
			if (i)
			{
				int j = JdbcInsert.insertRecords(conObj,add_rows);
				if (j!=1)
				{
					JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "Record entry "+add_rows.elementAt(0)+" saved succesiful", "Success", JOptionPane.PLAIN_MESSAGE);
				}
			}
			
			else {
				int j = JdbcInsert.insertRecords(conObj,add_rows);
				if (j!=1)
				{
					JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "Record entry "+add_rows.elementAt(0)+" saved succesiful", "Success", JOptionPane.PLAIN_MESSAGE);
				}
			}
		}
		catch (java.sql.SQLException sqe)
		{
			javax.swing.JOptionPane.showMessageDialog(null, sqe.getMessage());
		}
	}
}
