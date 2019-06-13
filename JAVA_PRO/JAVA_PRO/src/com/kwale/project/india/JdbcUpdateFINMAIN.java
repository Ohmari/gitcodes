package com.kwale.project.india;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;

public class JdbcUpdateFINMAIN {

	@SuppressWarnings("rawtypes")
	public static void updateRecordFromTable(Connection conObj, Vector update_row) throws SQLException {
		// TODO Auto-generated method stub
		String updateTableDetails=("UPDATE FINTABLE SET STUDENT_NAME=?, WARD=?, COLLEGE=?, COURSE=? WHERE ROLL_NUMBER=?");
		PreparedStatement ps=conObj.prepareStatement(updateTableDetails);
		
		for (int j=0; j<update_row.size(); j++)
		{
			if (update_row.elementAt(j).equals(""))
			{
				ps.setString((j+1),"null");	
			}
			else {
				ps.setString((j+1),(String) update_row.get(j));
			}
		}
		
		ps.executeUpdate();
	}
}
