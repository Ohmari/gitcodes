package com.kwale.project.india;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeleteSM_Record {

	public static int deleteRecordFromTable(Connection conObj, String keyElement) throws SQLException {
		// TODO Auto-generated method stub
		String deleteSQL="DELETE FROM SUBJECTSMARKS WHERE KEYELEMENT=?";
		
		PreparedStatement ps=conObj.prepareStatement(deleteSQL);
		ps.setString(1, keyElement);
		
		int i = ps.executeUpdate();

		return i;
	}
	
}
