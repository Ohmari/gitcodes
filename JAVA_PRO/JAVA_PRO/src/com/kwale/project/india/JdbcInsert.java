package com.kwale.project.india;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.Vector;

import javax.swing.JOptionPane;

public class JdbcInsert
{			  
	@SuppressWarnings("rawtypes")
	public static int insertRecords(Connection conObj,Vector add_rows)throws java.sql.SQLException
	{
		int i = 0;
		PreparedStatement ps=null;
		String insertTableDetails="INSERT INTO MAINRECORD VALUES(?,?,?,?,?,?,?,?)";

		ps=conObj.prepareStatement(insertTableDetails);
		
		if (add_rows.elementAt(0).equals(""))
		{
			javax.swing.JOptionPane.showMessageDialog(null, "Roll number can't be empty", "Internal Error", javax.swing.JOptionPane.ERROR_MESSAGE);
		}

		else {
			for (int j=0; j<add_rows.size(); j++)
			{
				if(j==1)
				{
					if (add_rows.elementAt(j).equals(""))
					{
						JOptionPane.showMessageDialog(null, "Name field can't be empty", "Database Internal Error", JOptionPane.ERROR_MESSAGE );
						break;
					}	
					ps.setString((j+1),(String) add_rows.get(j));
				}
				else {
					if (add_rows.elementAt(j).equals(""))
					{
						ps.setString((j+1),"null");	
					}
					else {
						ps.setString((j+1),(String) add_rows.get(j));
					}	
				}
			}
		i=ps.executeUpdate();
		}
		return i;
	}
};