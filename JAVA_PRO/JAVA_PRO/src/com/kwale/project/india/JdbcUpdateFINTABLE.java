package com.kwale.project.india;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Vector;

public class JdbcUpdateFINTABLE
{
   @SuppressWarnings("rawtypes")
public static int updateRecordFromTable(Connection conObj,Vector update_row)throws java.sql.SQLException
	   {
			String updateTableDetails=("UPDATE FINTABLE SET \"DATE\"=?, STIPEND=?, \"ST DOP\"=?, \"RENT AND ELECTRICITY\"=?, \"RE DOP\"=?, \"SCHOOL FEES\"=?, \"SCH DOP\"=?, OTHERS=?, \"OTH DOP\"=?, DATEUSER=? WHERE KEYELEMENT=?");
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

			int i=ps.executeUpdate();

			return i;
		}
}; 
