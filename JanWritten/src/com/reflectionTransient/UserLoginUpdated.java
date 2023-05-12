package com.reflectionTransient;

import java.io.*;

class UserInfo implements Serializable {
	
	String username;
	transient String passward;// Now it will not be serialized
	
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserInfo(String username, String passward) {
		super();
		this.username = username;
		this.passward = passward;
	}

	

	
}

public class UserLoginUpdated {
	public static void main(String args[]) throws Exception {
		UserInfo u1 = new UserInfo("Henry","wilsonHenry@123");// creating object
		// writing object into file
		FileOutputStream f = new FileOutputStream("C:\\IndrayaniThinkQ\\JavaWorkspace\\TextFiles\\credentials.txt");
		ObjectOutputStream out = new ObjectOutputStream(f);
		out.writeObject(u1);
		out.flush();
		out.close();
		f.close();
		System.out.println("logged in successfully");
	}

	
}