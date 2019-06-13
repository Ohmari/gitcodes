/**
 * 
 */
package com.kwale.project.india;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author SoftoDocDevelopers
 *
 */
public class FetchNames {
	   public static ResultSet selectRecordFromTable(Connection conObj, String cosem)throws java.sql.SQLException
	   {
			String selectTableDetails=("SELECT * FROM SUBJECTSNAMES WHERE BATCH=?");
			PreparedStatement ps=conObj.prepareStatement(selectTableDetails);
			
			ps.setString(1,cosem);

			ResultSet rs=ps.executeQuery();
			
			return rs;
		}
}
