package com.kwale.project.india;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class JdbcSelect
{
   public static ResultSet selectRecordFromTable(Connection conObj, String rno)throws java.sql.SQLException
	   {
			String selectTableDetails=("SELECT * FROM MAINRECORD WHERE ROLL_NUMBER=?");
			PreparedStatement ps=conObj.prepareStatement(selectTableDetails);
			
			ps.setString(1,rno);

			ResultSet rs=ps.executeQuery();
			
			return rs;
		}
};