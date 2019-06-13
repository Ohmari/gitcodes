package com.kwale.project.india;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Vector;

public class JdbcUpdateUSERACCOUNTS
{
   @SuppressWarnings("rawtypes")
public static int updateRecordFromTable(Connection conObj,Vector update_pass)throws java.sql.SQLException
	   {
			String updateTableDetails=("UPDATE USERACCOUNTS SET PASS=? WHERE USERNAME=?");
			PreparedStatement ps=conObj.prepareStatement(updateTableDetails);
			
			for (int j=0; j<update_pass.size(); j++)
			{
				ps.setString((j+1),(String) update_pass.get(j));
			}

			int i=ps.executeUpdate();

			return i;
		}
}; 
