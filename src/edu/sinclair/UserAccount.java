package edu.sinclair;

//A class that contains a username and password
public class UserAccount {
	
	// instance variables
	private String username;
	private String password;	
	
	//constructor that accepts 2 strings, a username and a password
	public UserAccount(String username, String password) 
	{
		//initiates the user name and password
		this.username = username;
		this.password = password;
	}
	
	//returns the stored username 
	public String getUsername() {return this.username;}
	
	// return true if the argument is the same as this account’s password, 
	// false otherwise 
	public boolean isPasswordCorrect (String password) {return this.password == password;}
	
	//displays the user name for the account
	@Override
	public String toString() {return this.getUsername();}
	
	// uses the username as the unique identifier of an account
	@Override
	public int hashCode () {return this.username.hashCode();}
	
	// two accounts are equal if their users names are identical
	@Override
	public boolean equals(Object o) {return this.hashCode() == o.hashCode();}
	
}
