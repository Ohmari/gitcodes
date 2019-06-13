package com.kwale.project.india;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JOptionPane;

public class JdbcCreateTableF_TABLE {
	public static Statement st;
	
	@SuppressWarnings("rawtypes")
	public static void createAutoTable(Connection conObj,String tableName, Vector add_rows)
	{
		try	
		{
			st=conObj.createStatement();
			String crtQry = "CREATE TABLE "+tableName+"("
				+"\"KEYELEMENT\"			VARCHAR(30) NOT NULL,"
				+"\"DURATION\"				VARCHAR(10),"
				+"\"ROLL_NUMBER\"			VARCHAR(15) NOT NULL,"
				+"\"STUDENT_NAME\"			VARCHAR(50),"				
				+"\"DATE\"					VARCHAR(50),"
				+"\"STIPEND\"				VARCHAR(10),"
				+"\"ST DOP\"				VARCHAR(15),"
				+"\"RENT AND ELECTRICITY\"	VARCHAR(10),"
				+"\"RE DOP\"				VARCHAR(15),"
				+"\"SCHOOL FEES\"			VARCHAR(10),"
				+"\"SCH DOP\"				VARCHAR(15),"
				+"\"OTHERS\"				VARCHAR(10),"
				+"\"OTH DOP\"				VARCHAR(15),"
				+"\"DATEUSER\"				VARCHAR(50),"
				+"\"WARD\"  				VARCHAR(15),"
				+"\"COLLEGE\"				VARCHAR(15),"
				+"\"COURSE\"				VARCHAR(15),"
				+"PRIMARY KEY(\"KEYELEMENT\")"
				+")";

			boolean i=st.execute(crtQry);
			
			if (i)
			{
				int j = JdbcInsertFINTABLE.insertRecords(conObj,add_rows);
				if (j!=1)
				{
					JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "Record entry "+add_rows.elementAt(0)+" saved succesiful", "Success", JOptionPane.PLAIN_MESSAGE);
				}
			}
			
			else {
				int j = JdbcInsertFINTABLE.insertRecords(conObj,add_rows);				
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