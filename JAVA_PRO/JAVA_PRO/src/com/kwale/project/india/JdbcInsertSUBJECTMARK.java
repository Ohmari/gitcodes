package com.kwale.project.india;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.Vector;

public class JdbcInsertSUBJECTMARK
{			  
	@SuppressWarnings("rawtypes")
	public static int insertRecords(Connection conObj,Vector subMarks,String tableName)throws java.sql.SQLException
	{
		PreparedStatement ps=null;
		String insertTableDetails="INSERT INTO "+tableName+" VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		ps=conObj.prepareStatement(insertTableDetails);

		for (int j=0; j<subMarks.size(); j++)
		{
			if (subMarks.elementAt(j).equals(""))
			{
				ps.setString((j+1),"null");	
			}
			else {
				ps.setString((j+1),(String) subMarks.get(j));				
			}
		}

		int i=ps.executeUpdate();
		
		return i;
	}
};