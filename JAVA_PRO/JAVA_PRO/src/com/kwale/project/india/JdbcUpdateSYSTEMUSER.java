package com.kwale.project.india;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;

public class JdbcUpdateSYSTEMUSER {

	@SuppressWarnings("rawtypes")
	public static int updateRecordFromTable(Connection conObj, Vector update_systeminfo) throws SQLException {
		// TODO Auto-generated method stub
		String updateTableDetails=("UPDATE USERACCOUNTS SET \"USERNAME\"=?, \"PASS\"=?, \"PASSHINT\"=? WHERE USERNAME=?");
		PreparedStatement ps=conObj.prepareStatement(updateTableDetails);
		
		for (int j=0; j<update_systeminfo.size(); j++)
		{
			ps.setString((j+1),(String) update_systeminfo.get(j));
		}

		int i=ps.executeUpdate();

		return i;
	}
}
