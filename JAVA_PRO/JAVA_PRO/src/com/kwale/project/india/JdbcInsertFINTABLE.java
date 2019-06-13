/*
 * @Powered By OmaJaSoft_JSDs
 * Friday, July 15, 2016
 * 4:02:15 PM
 */

/**
 * A JdbcBasedGui Project Based On Java
 * Connection Business Logic Class  
 * With Respect & Dedication To 
 * Mr. Rahul Yadav, DR. MPS & Kwale County Government Reign(2013/17)
 * System Developers Mwakaribu O Suleiman & Akida M Jafar 
 */


/**
* package name(projectindia)
*/
package com.kwale.project.india;

/**
* explicit import 
*/
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.Vector;

// @JdbcInsertDEC2014WITH Class
public class JdbcInsertFINTABLE
{			  
	@SuppressWarnings("rawtypes")
	public static int insertRecords(Connection conObj,Vector add_rows)throws java.sql.SQLException
	{
		PreparedStatement ps=null;
		String insertTableDetails="INSERT INTO FINTABLE VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		ps=conObj.prepareStatement(insertTableDetails);

		for (int j=0; j<add_rows.size(); j++)
		{
			if (add_rows.elementAt(j).equals(""))
			{
				ps.setString((j+1),"null");	
			}
			else {
				ps.setString((j+1),(String) add_rows.get(j));
			}
		}

		int i=ps.executeUpdate();
		
		return i;
	}
};