package com.kwale.project.india;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JdbcDeleteFINTABLE
{
	public static int deleteRecordFromTable(Connection conObj,String keyElement)throws java.sql.SQLException
		{	
			String deleteSQL="DELETE FROM FINTABLE WHERE KEYELEMENT=?";
			
			PreparedStatement ps=conObj.prepareStatement(deleteSQL);
			ps.setString(1, keyElement);
			
			int i = ps.executeUpdate();

			return i;
		}
}