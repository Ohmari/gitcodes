package com.kwale.project.india;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class JdbcSelectPASS
{
   public static ResultSet selectRecordFromTable(Connection conObj, String pass)throws java.sql.SQLException
	   {
			String selectTableDetails=("SELECT * FROM USERACCOUNTS WHERE PASS=? AND AUTHOR=\'Admin\'");
			PreparedStatement ps=conObj.prepareStatement(selectTableDetails);
			
			ps.setString(1,pass);

			ResultSet rs=ps.executeQuery();
			
			return rs;
		}
};