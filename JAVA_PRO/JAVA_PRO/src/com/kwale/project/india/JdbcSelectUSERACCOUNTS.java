package com.kwale.project.india;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class JdbcSelectUSERACCOUNTS
{
   private String accounts="userAccount@password@passwordhint@authentication";
   
   public String selectRecordFromTable(Connection conObj)throws java.sql.SQLException
	   {
			String selectTableDetails=("SELECT * FROM USERACCOUNTS");
			PreparedStatement ps=conObj.prepareStatement(selectTableDetails);

			ResultSet rs=ps.executeQuery();

			while (rs.next())
			{
				String str = "\n"+rs.getString(1)+"@"+rs.getString(2)
					+"@"+rs.getString(3)+"@"+rs.getString(4);

				accounts = accounts+str;
			}

			return accounts;
		}
};