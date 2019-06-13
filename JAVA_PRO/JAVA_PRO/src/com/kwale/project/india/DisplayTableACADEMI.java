package com.kwale.project.india;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JTable;

public class DisplayTableACADEMI {

	private static String str;
	private static String course;
	
	public static void displayData(Connection conObj, JTable table, String courseSem) throws SQLException {
		// TODO Auto-generated method stub
		course="\'"+courseSem+"\'";
		str = ("SELECT * FROM SUBJECTSMARKS WHERE BATCH="+course+" ORDER BY ROLL_NUMBER ASC");
		
		ReadACADEMI_TB.readData(conObj,str,table,courseSem);
	}
}
