package com.juhibernate.config;

import java.io.IOException;

import javax.swing.JOptionPane;

public class JUdbServer {

	public static void dbStartup() {
		// TODO Auto-generated method stub
		try {
			if (System.getProperty("os.name").equalsIgnoreCase("Linux")) {
				Runtime.getRuntime().exec("chmod +x startdb");
				Runtime.getRuntime().exec("./startdb");
			}
			else
				Runtime.getRuntime().exec("cmd /c startdb.bat");
		} catch (final IOException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage(), new JUdbServer().getClass().getSimpleName(),
					JOptionPane.ERROR_MESSAGE);
		}
	}

}
