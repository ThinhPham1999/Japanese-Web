package bean;

import java.util.Date;

public class User {
	protected int userID;
	protected String userName;
	protected String userPass;
	protected String name;
	protected Date dob;
	protected int gender;
	protected int permission;
	
	public User() {
		super();
	}

	public User(int userID, String userName, String userPass, String name, Date dob, int gender, int permission) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.userPass = userPass;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.permission = permission;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getPermission() {
		return permission;
	}

	public void setPermission(int permission) {
		this.permission = permission;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", userPass=" + userPass + ", name=" + name
				+ ", dob=" + dob + ", gender=" + gender + ", permission=" + permission + "]";
	}
	
	
}
