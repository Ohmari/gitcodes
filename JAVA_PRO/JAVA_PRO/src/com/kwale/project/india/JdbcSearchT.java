package com.kwale.project.india;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JOptionPane;

public class JdbcSearchT
{
	@SuppressWarnings("rawtypes")
	public static void searchTable(String tableName, Connection conObj, Vector add_rows)throws java.sql.SQLException
	{
	  ResultSet rs = null;
	  DatabaseMetaData dbmd = conObj.getMetaData();
	  rs = dbmd.getTables(null,null,tableName,null);
	  
	  if (!rs.next())
		{
				JdbcCreateTable.createAutoTable(conObj,tableName,add_rows);
		}
	  
	  else {
		  
		  if (tableName.equals("MAINRECORD"))
		  {
				int i = JdbcInsert.insertRecords(conObj,add_rows);
				if (i!=1)
				{
					JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "Record entry "+add_rows.elementAt(0)+" saved succesiful", "Success", JOptionPane.PLAIN_MESSAGE);
				}

		  }
		  
		  else if (tableName.equals("FINTABLE"))
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
	  }
	}
}
