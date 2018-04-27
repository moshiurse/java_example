package com.learn.singleresponsibility.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabseConnectionManager {
	
	private Connection con;
	
	private static DatabseConnectionManager connectionInstance = new DatabseConnectionManager();
	
	private DatabseConnectionManager(){
		
	}
	
	public static DatabseConnectionManager getManagerInstance(){
		return connectionInstance;
	}
	
	public void connect() throws SQLException{
		con = DriverManager.getConnection("url/url");
		System.out.println("Connection Established");
	}
	
	public Connection getConnectionObject(){
		return con;
	}
	
	

}
