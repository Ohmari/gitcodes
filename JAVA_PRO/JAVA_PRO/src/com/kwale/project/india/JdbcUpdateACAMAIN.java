package com.kwale.project.india;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;

public class JdbcUpdateACAMAIN {

	@SuppressWarnings("rawtypes")
	public static void updateRecordFromTable(Connection conObj, Vector update_rowacamain) throws SQLException {
		// TODO Auto-generated method stub
		String updateTableDetails=("UPDATE FINTABLE SET STUDENT_NAME=?, COLLEGE=? WHERE ROLL_NUMBER=?");
		PreparedStatement ps=conObj.prepareStatement(updateTableDetails);
		
		for (int j=0; j<update_rowacamain.size(); j++)
		{
			if (update_rowacamain.elementAt(j).equals(""))
			{
				ps.setString((j+1),"null");	
			}
			else {
				ps.setString((j+1),(String) update_rowacamain.get(j));
			}
		}
		
		ps.executeUpdate();
	}
}
