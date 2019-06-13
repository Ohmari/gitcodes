package com.kwale.project.india;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.Vector;

public class JdbcCreateUser
{			  
	@SuppressWarnings("rawtypes")
	public static int insertRecords(Connection conObj,Vector add_rows)throws java.sql.SQLException
	{
		PreparedStatement ps=null;
		String insertTableDetails="INSERT INTO USERACCOUNTS VALUES(?,?,?,?)";
		
		ps=conObj.prepareStatement(insertTableDetails);

		for (int j=0; j<add_rows.size(); j++)
		{
			ps.setString((j+1),(String) add_rows.get(j));
		}

		int i=ps.executeUpdate();
		
		return i;

	}
};