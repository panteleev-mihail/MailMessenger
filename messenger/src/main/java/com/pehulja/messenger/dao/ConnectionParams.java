package com.pehulja.messenger.dao;

import java.util.ArrayList;
import java.util.List;

public class ConnectionParams {
	String name, serverPath, dbName, userName, pass;

	public String getServerPath() {
		return serverPath;
	}

	public void setServerPath(String serverPath) {
		this.serverPath = serverPath;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public ConnectionParams(String name, String serverPath, String dbName, String userName,
			String pass) {
		super();
		this.name=name;
		this.serverPath = serverPath;
		this.dbName = dbName;
		this.userName = userName;
		this.pass = pass;
	}
	
	public static List<ConnectionParams> getConnectionParamsList()
	{
		List <ConnectionParams> connectionParamsList = new ArrayList<ConnectionParams>();
		connectionParamsList.add(new ConnectionParams("Дистанційна база на ukraine.com.ua", "if30v.mysql.ukraine.com.ua", "if30v_coursework", "if30v_admin", "98979897"));
		connectionParamsList.add(new ConnectionParams("Локальна база", "localhost", "if30v_coursework", "root", "98979897"));
		return connectionParamsList;
		
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}
