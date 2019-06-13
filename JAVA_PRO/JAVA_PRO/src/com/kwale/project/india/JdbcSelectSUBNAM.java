package com.kwale.project.india;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class JdbcSelectSUBNAM
{
   public static ResultSet selectRecordFromTable(Connection conObj, String semCourse)throws java.sql.SQLException
	   {
			String selectTableDetails=("SELECT * FROM SUBJECTSNAMES WHERE \"BATCH\"=?");
			PreparedStatement ps=conObj.prepareStatement(selectTableDetails);
			
			ps.setString(1,semCourse);

			ResultSet rs=ps.executeQuery();
			
			return rs;
		}
};