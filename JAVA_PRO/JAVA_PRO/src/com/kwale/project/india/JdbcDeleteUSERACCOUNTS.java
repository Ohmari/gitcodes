package com.kwale.project.india;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JdbcDeleteUSERACCOUNTS
{
	public static int deleteAccountFromSystem(Connection conObj,String usrName)throws java.sql.SQLException
		{
			
			String deleteSQL="DELETE FROM USERACCOUNTS WHERE USERNAME=?";
			
			PreparedStatement ps=conObj.prepareStatement(deleteSQL);
			ps.setString(1, usrName);
			
			int i = ps.executeUpdate();

			return i;
		}
}