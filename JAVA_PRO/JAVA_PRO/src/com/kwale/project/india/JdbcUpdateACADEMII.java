package com.kwale.project.india;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Vector;

public class JdbcUpdateACADEMII
{
   @SuppressWarnings("rawtypes")
public static int updateRecordFromTable(Connection conObj,Vector update_row,String tableName,String keyValue)throws java.sql.SQLException
	   {
			String updateTableDetails=("UPDATE "+tableName+" SET SUBJ_1=?,SUBJ_2=?,SUBJ_3=?,SUBJ_4=?,SUBJ_5=?,SUBJ_6=?,SUBJ_7=?,SUBJ_8=?,SUBJ_9=?,SUBJ_10=? WHERE \""+keyValue+"\"=?");
			PreparedStatement ps=conObj.prepareStatement(updateTableDetails);
			
			for (int j=0;  j<update_row.size(); j++)
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