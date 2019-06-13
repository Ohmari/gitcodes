/**
 * 
 */
package com.kwale.project.india;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.swing.JOptionPane;

/**
 * @author SoftoDocDevelopers
 *
 */
public class PropertiesFile {
	public static void setPropertiesFile(String usrname, String password) {
		File propertiesfile = new File("property.properties");
		
		if (propertiesfile.exists())
		{
			Properties properties =new Properties();
			
			FileInputStream fis = null;
			try {
				fis = new FileInputStream("property.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage(), "", JOptionPane.ERROR_MESSAGE);
			}
			
			try {
				properties.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage(), "", JOptionPane.ERROR_MESSAGE);
			}
			
			FileOutputStream fos = null;
			try {
				fos = new FileOutputStream("property.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage(), "", JOptionPane.ERROR_MESSAGE);
			}
			
			properties.setProperty("db_user", usrname);
			properties.setProperty("db_password", password);
			try {
				properties.store(fos,"Update on "+new Date()+" with respect to KwaSaP");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage(), "", JOptionPane.ERROR_MESSAGE);
			}
			JOptionPane.showMessageDialog(null, "Values saved succesiful to property.properties file"
					+"\nusername "+usrname
					+"\npassword "+password,
					"", JOptionPane.PLAIN_MESSAGE);
		}
		else {
			try {
				propertiesfile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage(), "", JOptionPane.ERROR_MESSAGE);			
			}
			
			Properties properties =new Properties();
			
			FileInputStream fis = null;
			try {
				fis = new FileInputStream("property.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage(), "", JOptionPane.ERROR_MESSAGE);
			}
			
			try {
				properties.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage(), "", JOptionPane.ERROR_MESSAGE);
			}
			
			FileOutputStream fos = null;
			try {
				fos = new FileOutputStream("property.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage(), "", JOptionPane.ERROR_MESSAGE);
			}
			
			properties.setProperty("db_user", usrname);
			properties.setProperty("db_password", password);
			try {
				properties.store(fos,"Update on "+new Date()+" with respect to KwaSaP");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage(), "", JOptionPane.ERROR_MESSAGE);
			}
			JOptionPane.showMessageDialog(null, "Values saved succesiful to property.properties file"
					+"\nusername "+usrname
					+"\npassword "+password,
					"", JOptionPane.PLAIN_MESSAGE);
		}
	}
}