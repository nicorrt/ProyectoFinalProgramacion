		package com.anramirez.proyectoFinal.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonBBDD {
	
	private static Connection conn = null;
	
	@SuppressWarnings("unused")
	private void SingletonBBSS(){
		 
	    String url = "jdbc:mysql://localhost:3306/test";
	    String driver = "com.mysql.jdbc.Driver";
	    String usuario = "usuario";
	    String password = "password";
	 
	    try{
	 Class.forName(driver);
	 conn = DriverManager.getConnection(url, usuario, password);
	    }
	    catch(ClassNotFoundException | SQLException e){
	 e.printStackTrace();
	    }
	}
	
	public static Connection getConnection(){
		 
	    if (conn == null){
	 new SingletonBBDD();
	    }
	 
	    return conn;
	}
	
	public static void cerrarConexion()
		{
		try {
			if (conn != null && !conn.isClosed())
				{
					try {
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
