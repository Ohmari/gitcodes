package com.kwale.project.india;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class DisplayRollNUMBERMAINTABLE
{
	public static String str;

	public static ResultSet displayData(Connection conObj,String sname)throws java.sql.SQLException
	{
		sname = "\'%"+sname+"%\'";
		str = ("SELECT * FROM MAINRECORD WHERE STUDENT_NAME LIKE "+sname);

		Statement st = conObj.createStatement();			

		ResultSet rs = st.executeQuery(str);
		
		return rs;
	}
}