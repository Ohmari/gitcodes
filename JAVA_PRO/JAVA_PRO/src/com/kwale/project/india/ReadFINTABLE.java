package com.kwale.project.india;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class ReadFINTABLE
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void readData(Connection conObj,String str, javax.swing.JTable studentDataTable)throws java.sql.SQLException
	{
		Statement st =conObj.createStatement();
		//will return a request set
		ResultSet rs = st.executeQuery(str);
		ResultSetMetaData rsmd = rs.getMetaData();

		//It will store the number of columns
		int columns = rsmd.getColumnCount();

		//This object will pass data into Table
		DefaultTableModel dtm = new DefaultTableModel();

		Vector column_name = new Vector();
		Vector data_rows = new Vector();
		//pass Default Table Object into myTable
		column_name.addElement("ENTRY INDEX");
		for (int i=1; i<=columns; i++)
		{
			if (i==1||i==5||i==15||i==16||i==17)
			{
			}
			else {
				column_name.addElement(rsmd.getColumnName(i));	
			}
		}
		dtm.setColumnIdentifiers(column_name);

		int i = 0;
		while(rs.next())
		{
			data_rows = new Vector();
			data_rows.addElement(++i+".");	
			
			for(int j=1;j<=columns;j++)
			{
				if (j==1||j==5||j==15||j==16||j==17)
				{
				}
				else {
					data_rows.addElement(rs.getString(j));	
				}
			}
			dtm.addRow(data_rows);
		}

		if (!data_rows.isEmpty())
		{
			studentDataTable.setModel(dtm);
		}

		else {
			javax.swing.JOptionPane.showMessageDialog(null, "No records were found, insert new records/try with different search option or entry", "Internal error", JOptionPane.ERROR_MESSAGE);
		}
	}
}