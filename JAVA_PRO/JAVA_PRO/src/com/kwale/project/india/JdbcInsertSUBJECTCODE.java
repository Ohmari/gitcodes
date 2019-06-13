package com.kwale.project.india;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.Vector;

public class JdbcInsertSUBJECTCODE
{			  
	@SuppressWarnings("rawtypes")
	public static int insertRecords(Connection conObj,Vector codeNumber,String tableName)throws java.sql.SQLException
	{
		PreparedStatement ps=null;
		String insertTableDetails="INSERT INTO "+tableName+" VALUES(?,?,?,?,?,?,?,?,?,?,?)";

		ps=conObj.prepareStatement(insertTableDetails);

		for (int j=0; j<codeNumber.size(); j++)
		{
			if (codeNumber.elementAt(j).equals(""))
			{
				ps.setString((j+1),"null");	
			}
			else {
				ps.setString((j+1),(String) codeNumber.get(j));				
			}
		}

		int i=ps.executeUpdate();
		
		return i;
	}
};