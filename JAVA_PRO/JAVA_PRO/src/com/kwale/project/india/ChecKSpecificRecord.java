package com.kwale.project.india;

import java.sql.Connection;

public class ChecKSpecificRecord
{
	private static String cosem;

	public static void displayData(Connection conObj, String rno, String sname, String ward,String college, String course, String tableName, javax.swing.JTable studentDataTable)throws java.sql.SQLException
	{
		String str = null;
		
		if (!rno.equals(""))
		{
			rno = "\'"+rno+"\'";
			str = ("SELECT * FROM "+tableName+" WHERE ROLL_NUMBER="+rno+" ORDER BY ROLL_NUMBER ASC");
		}
		
		else if (!sname.equals(""))
		{
			sname = "\'%"+sname+"%\'";
			str = ("SELECT * FROM "+tableName+" WHERE STUDENT_NAME LIKE "+sname+" ORDER BY ROLL_NUMBER ASC");
		}
		
		else if (!ward.equals(""))
		{
			ward = "\'%"+ward+"%\'";
			str = ("SELECT * FROM "+tableName+" WHERE WARD LIKE "+ward+" ORDER BY ROLL_NUMBER ASC");
		}
		
		else if (!college.equals(""))
		{
			college = "\'%"+college+"%\'";
			str = ("SELECT * FROM "+tableName+" WHERE COLLEGE LIKE "+college+" ORDER BY ROLL_NUMBER ASC");
		}

		else if (!course.equals(""))
		{
			course = "\'%"+course+"%\'";
		    str = ("SELECT * FROM "+tableName+" WHERE COURSE LIKE "+course+" ORDER BY ROLL_NUMBER ASC");
		}
		
		if (tableName.equals("MAINRECORD"))
		{
			ReadMAINTABLE.readData(conObj,str,studentDataTable);	
		}

		else if (tableName.equals("FINTABLE"))
		{
			ReadFINTABLE.readData(conObj,str,studentDataTable);
		}
		
		else if (tableName.equals("SUBJECTSMARKS"))
		{
			ReadACADEMI_TB.readData(conObj,str,studentDataTable,cosem);
		}
	}
	
	public static void setCourseSem(String cosem)
	{
		ChecKSpecificRecord.cosem = cosem;
	}
};