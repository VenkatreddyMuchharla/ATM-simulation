package com.ATM;

public class User {
	private int id;
	private String Name;
	private String Username;
	private String password;
	private double balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public void setPassword(String password) {
			this.password = password;	
	}
	public User(int id, String name, String username, String password,double balance) {
		this.id = id;
		Name = name;
		Username = username;
		this.password = password;
		this.balance=balance;
	}
	public User() {
		
	}
	public String toString(){
		return "id: "+id+"\nName: "+Name+"\nUsername: "+Username;
		
	}

}
