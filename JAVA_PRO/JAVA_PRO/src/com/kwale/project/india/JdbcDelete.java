package com.kwale.project.india;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JdbcDelete
{
	public static int deleteRecordFromTable(Connection conObj,String rno)throws java.sql.SQLException
		{
			
			String deleteSQL="DELETE FROM MAINRECORD WHERE ROLL_NUMBER=?";
			
			PreparedStatement ps=conObj.prepareStatement(deleteSQL);
			ps.setString(1, rno);
			
			int i = ps.executeUpdate();

			return i;
		}
}