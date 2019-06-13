package com.kwale.project.india;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Vector;

public class JdbcCreateTableUser
{
	public static Statement st;
    @SuppressWarnings("rawtypes")
	public static Vector add_rows;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void createAutoTable(Connection conObj,String tableName)
	{
		try	
		{
			add_rows = new Vector();
			add_rows.add("Administrer");
			add_rows.add("2208mwak92");
			add_rows.add("as98");
			add_rows.add("Admin");

			st=conObj.createStatement();
			String crtQry = "CREATE TABLE "+tableName+"("
				+"\"USERNAME\"	VARCHAR(15) NOT NULL,"
				+"\"PASS\"		VARCHAR(20) NOT NULL,"
				+"\"PASSHINT\"  VARCHAR(10),"
				+"\"AUTHOR\"	VARCHAR(10) NOT NULL,"
				+"PRIMARY KEY(\"USERNAME\")"
				+")";

			boolean i=st.execute(crtQry);
			
			if (i)
			{
				int j = JdbcCreateUser.insertRecords(conObj,add_rows);
				if (j!=1)
				{
					JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
				}
			}
			
			else {
				int j = JdbcCreateUser.insertRecords(conObj,add_rows);
				if (j!=1)
				{
					JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		catch (java.sql.SQLException sqe)
		{
			JOptionPane.showMessageDialog(null, sqe.getMessage());
		}
	}
}
