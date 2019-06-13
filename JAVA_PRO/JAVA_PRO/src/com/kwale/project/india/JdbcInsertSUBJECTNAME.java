package com.kwale.project.india;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.Vector;

public class JdbcInsertSUBJECTNAME
{			  
	@SuppressWarnings("rawtypes")
	public static int insertRecords(Connection conObj,Vector subNames,String tableName)throws java.sql.SQLException
	{
		PreparedStatement ps=null;
		String insertTableDetails="INSERT INTO "+tableName+" VALUES(?,?,?,?,?,?,?,?,?,?,?)";

		ps=conObj.prepareStatement(insertTableDetails);

		for (int j=0; j<subNames.size(); j++)
		{
			if (subNames.elementAt(j).equals(""))
			{
				ps.setString((j+1),"null");	
			}
			else{
				ps.setString((j+1),(String) subNames.get(j));				
			}
		}

		int i=ps.executeUpdate();
		
		return i;
	}
};