package com.kwale.project.india;

public class GrandTotal
{
	private float sumStipend;
	private float sumRentEle;
	private float sumSchFees;
	private float sumOtherCo;

	public float getStipendSum(javax.swing.JTable studentDataTable)
	{
		int rowsCount = studentDataTable.getRowCount();

		for (int i=0; i<rowsCount; i++)
		{
			String str = (String) studentDataTable.getModel().getValueAt(i,4);
		
			if (!str.equalsIgnoreCase("null"))
			{
				sumStipend+= Float.parseFloat(str);
			}

			else {
				sumStipend+=0;
			}		
		}

		return sumStipend;
	}

	public float getRentEleSum(javax.swing.JTable studentDataTable)
	{
		int rowsCount = studentDataTable.getRowCount();

		for (int i=0; i<rowsCount; i++)
		{
			String str = (String) studentDataTable.getModel().getValueAt(i,6);
		
			if (!str.equalsIgnoreCase("null"))
			{
				sumRentEle+= Float.parseFloat(str);
			}

			else {
				sumRentEle+=0;
			}		
		}

		return sumRentEle;
	}

	public float getSchFeesSum(javax.swing.JTable studentDataTable)
	{
		int rowsCount = studentDataTable.getRowCount();
		
		for (int i=0; i<rowsCount; i++)
		{
			String str = (String) studentDataTable.getModel().getValueAt(i,8);
			
			if (!str.equalsIgnoreCase("null"))
			{
				sumSchFees+= Float.parseFloat(str);
			}

			else {
				sumSchFees+=0;
			}
		}

		return sumSchFees;
	}

	public float getOtherCoSum(javax.swing.JTable studentDataTable)
	{
		int rowsCount = studentDataTable.getRowCount();
		
		for (int i=0; i<rowsCount; i++)
		{
			String str = (String) studentDataTable.getModel().getValueAt(i,10);
			
			if (!str.equalsIgnoreCase("null"))
			{
				sumOtherCo+= Float.parseFloat(str);
			}

			else {
				sumOtherCo+=0;
			}
		}

		return sumOtherCo;
	}
};