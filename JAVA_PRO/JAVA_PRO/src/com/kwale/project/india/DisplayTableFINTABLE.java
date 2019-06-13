package com.kwale.project.india;

import java.sql.Connection;

public class DisplayTableFINTABLE
{
	private static String str;

	public static void displayData(Connection conObj, javax.swing.JTable studentDataTable, String monthYear)throws java.sql.SQLException
	{
		if (monthYear!=null)
		{
			monthYear="\'"+monthYear+"\'";
			str = ("SELECT * FROM FINTABLE WHERE DURATION="+monthYear+" ORDER BY ROLL_NUMBER ASC");
		}
		else {
			str = ("SELECT * FROM FINTABLE ORDER BY ROLL_NUMBER ASC");			
		}
		
		ReadFINTABLE.readData(conObj,str,studentDataTable);
	}
};