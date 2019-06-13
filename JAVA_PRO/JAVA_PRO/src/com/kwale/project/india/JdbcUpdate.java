package com.kwale.project.india;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Vector;

public class JdbcUpdate
{
   @SuppressWarnings("rawtypes")
   public static int updateRecordFromTable(Connection conObj,Vector update_row)throws java.sql.SQLException
   {
		String updateTableDetails=("UPDATE MAINRECORD SET STUDENT_NAME=?, G=?, WARD=?,PASSPORT_NUMBER=?,COLLEGE=?,COURSE=?, DATEUSER=? WHERE ROLL_NUMBER=?");
		PreparedStatement ps=conObj.prepareStatement(updateTableDetails);
		
		for (int j=0; j<update_row.size(); j++)
		{
			if (update_row.elementAt(j).equals("") || ((String) update_row.elementAt(j)).equalsIgnoreCase("null"))
			{
				ps.setString((j+1),"null");	
			}
			else {
				ps.setString((j+1),(String) update_row.get(j));
			}
		}
		
		int i=ps.executeUpdate();

		return i;
   }
}; 
