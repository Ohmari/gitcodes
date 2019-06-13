package com.kwale.project.india;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class JdbcSelectSUBJECTSMARKS
{
   public static ResultSet selectRecordFromTable(Connection conObj, String keyElement)throws java.sql.SQLException
	   {
			String selectTableDetails=("SELECT * FROM SUBJECTSMARKS WHERE KEYELEMENT=?");
			PreparedStatement ps=conObj.prepareStatement(selectTableDetails);
			
			ps.setString(1,keyElement);

			ResultSet rs=ps.executeQuery();
			
			return rs;
		}
};