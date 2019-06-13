package com.kwale.project.india;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ReadACADEMI_TB {

	private static ResultSet rsCode;
	private static String code;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void readData(Connection conObj, String str, JTable table, String cosem) throws SQLException {
		// TODO Auto-generated method stub
		rsCode = FetchNames.selectRecordFromTable(conObj, cosem);
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
		
		for (int i=1; i<5; i++)
		{	
			if(i==1||i==2)
			{
				continue;
			}
			else{
				column_name.addElement(rsmd.getColumnName(i));	
			}
		}
		
		while(rsCode.next())
		{
			for (int i=2; i<columns; i++)
			{	
				code = rsCode.getString(i);
				
				if("null".equals(code))
				{
					break;
				}
				else{
					column_name.addElement(code);	
				}
			}	
		}
		dtm.setColumnIdentifiers(column_name);			

		int i = 0;
		while(rs.next())
		{
			data_rows = new Vector();
			data_rows.addElement(++i+".");	
			
			for(int j=1;j<columns;j++)
			{
				if(j==1||j==2)
				{	
					continue;
				}
				data_rows.addElement(rs.getString(j));
			}
			dtm.addRow(data_rows);
		}

		if (!data_rows.isEmpty())
		{
			table.setModel(dtm);
		}

		else {
			javax.swing.JOptionPane.showMessageDialog(null, "No records were found, insert new records/try with different search option or entry", "Internal error", JOptionPane.ERROR_MESSAGE);
		}

	}
}
