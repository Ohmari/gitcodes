package com.kwale.project.india;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Vector;

import javax.swing.JOptionPane;

public class G_PropertiesFile {
	private static FileInputStream fis;
	@SuppressWarnings("rawtypes")
	private static Vector usrnamePassword;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Vector getPropetiesFile(){
		Properties properties = new Properties();
		try {
			fis = new FileInputStream("property.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "File property.properties do not exist",
					"FileNotFoundException", JOptionPane.ERROR_MESSAGE);
		}
		
		try {
			properties.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Internal erro",
					"", JOptionPane.ERROR_MESSAGE);
		}
		
		usrnamePassword = new Vector();
		usrnamePassword.add(properties.getProperty("db_user"));
		usrnamePassword.add(properties.getProperty("db_password"));
		
		return usrnamePassword;	
	}
}
