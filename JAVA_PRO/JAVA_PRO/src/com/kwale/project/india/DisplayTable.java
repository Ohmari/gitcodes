package com.kwale.project.india;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class DisplayTable
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void displayData(Connection conObj, javax.swing.JTable studentDataTable)throws java.sql.SQLException
	{ 
		String str = ("SELECT * FROM MAINRECORD ORDER BY ROLL_NUMBER ASC");
		Statement st = conObj.createStatement();
		//will return a request set

		ResultSet rs = st.executeQuery(str);
		ResultSetMetaData rsmd = rs.getMetaData();

		//It will store the number of columns
		int columns = rsmd.getColumnCount();

		//This object will pass data into Table
		DefaultTableModel dtm = new DefaultTableModel();

		Vector column_name = new Vector();
		Vector data_rows = new Vector();
			column_name.addElement("INDEX");
		for (int i=1; i<=columns; i++)
		{
			column_name.addElement(rsmd.getColumnName(i));
		}
		dtm.setColumnIdentifiers(column_name);

		int i = 0;
		while(rs.next())
		{
			data_rows = new Vector();
			data_rows.addElement(++i+".");
			for(int j=1;j<=columns;j++)
			{
			data_rows.addElement(rs.getString(j));
			}
			dtm.addRow(data_rows);
		}

		if (!data_rows.isEmpty())
		{
			studentDataTable.setModel(dtm);
		}
		else {
			javax.swing.JOptionPane.showMessageDialog(null, "Our database has no records at the moment\n");
		}
	}
};	