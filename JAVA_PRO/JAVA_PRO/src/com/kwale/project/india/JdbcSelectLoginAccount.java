package com.kwale.project.india;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class JdbcSelectLoginAccount
{
   public static ResultSet selectRecordFromTable(Connection conObj, String usrName)throws java.sql.SQLException
	   {				
			String selectTableDetails=("SELECT * FROM USERACCOUNTS WHERE USERNAME=?");
			PreparedStatement ps=conObj.prepareStatement(selectTableDetails);
			
			ps.setString(1,usrName);

			ResultSet rs=ps.executeQuery();
			
			return rs;
		}
};