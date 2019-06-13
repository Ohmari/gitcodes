package com.kwale.project.india;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.util.Vector;

public class JdbcSearchTable
{
	@SuppressWarnings("rawtypes")
	public static void searchTable(String tableName, Connection conObj, Vector codeNumber,Vector subMarks,Vector subNames)throws java.sql.SQLException
	{
	  ResultSet rs = null;
	  DatabaseMetaData dbmd = conObj.getMetaData();
	  rs = dbmd.getTables(null,null,tableName,null);
	  
	  if (rs.next())
		{
		  rs = JdbcSelectSUBNAM.selectRecordFromTable(conObj,(String) subMarks.elementAt(1));
		  if (rs.next())
		  {
			  int i = JdbcInsertSUBJECTMARK.insertRecords(conObj,subMarks,"SUBJECTSMARKS");
			  if (i!=1)
			  {
				  JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
			  }
			  else {
				  javax.swing.JOptionPane.showMessageDialog(null, "Record NO. "+subMarks.get(2)+" inserted successful");
			  }
		  }
		  else {
			  int j = JdbcInsertSUBJECTNAME.insertRecords(conObj,subNames,tableName);

			  if (j!=1)
			  {
				  JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
			  }
			  else {
				  int k = JdbcInsertSUBJECTCODE.insertRecords(conObj,codeNumber,"SUBJECTSCODES");
				  if (k!=1)
				  {
					  JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
				  }
				  else {
					  int l = JdbcInsertSUBJECTMARK.insertRecords(conObj,subMarks,"SUBJECTSMARKS");
					  if (l!=1)
					  {
						  JOptionPane.showMessageDialog(null, "Contact Support @whatsapp+254718569878/call +917310683187", "Internal error", JOptionPane.ERROR_MESSAGE);
					  }
					  else {
						  javax.swing.JOptionPane.showMessageDialog(null, "Record NO. "+subMarks.get(2)+" inserted successful");
					  }
				  }
			  }
		  }
	  }

	  else {
		  JdbcAutoCreate.createAutoTable(codeNumber,conObj,subMarks,subNames,tableName);
	  }
	}
}