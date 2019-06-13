package com.kwale.project.india;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Vector;

public class JdbcCreateTable
{
	public static Statement st;
    
	@SuppressWarnings("rawtypes")
	public static void createAutoTable(Connection conObj,String tableName, Vector add_rows)
	{
		try	
		{
			st=conObj.createStatement();
			if (tableName.equals("USERACCOUNTS"))
			{
				JdbcCreateTableUser.createAutoTable(conObj,tableName);
			}
			
			else if (tableName.equals("MAINRECORD"))
			{
				JdbcCreateTableM_DB.createAutoTable(conObj,tableName,add_rows);
			}
			
			else if(tableName.equals("FINTABLE"))
			{
				JdbcCreateTableF_TABLE.createAutoTable(conObj,tableName,add_rows);
			}
		}
		catch (java.sql.SQLException sqe)
		{
			javax.swing.JOptionPane.showMessageDialog(null, sqe.getMessage());
		}
	}
}
