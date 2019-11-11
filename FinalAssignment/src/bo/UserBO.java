package bo;

import java.io.Serializable;
import java.util.ArrayList;

import bean.User;
import dao.UserDao;

public class UserBO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserBO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean validate(String username, String pass) {
		User user = UserDao.getUser(username);
		System.out.println(user);
		if (user != null) {
			if (user.getUserPass().equals(pass)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean validateRegister(User user) {
		if (UserDao.getUser(user.getUserName()) != null) {
			return false;
		}
		UserDao.addUser(user);
		return true;
	}
	
	public int getUserID(String username) {
		User user = UserDao.getUser(username);
		return user.getUserID();
	}
	
	public ArrayList<User> listAll(){
		return UserDao.getAll();
	}
	
	public User getUser(int ID) {
		return UserDao.getUserByID(ID);
	}
	
	public boolean update(User user) {
		return UserDao.updateUser(user);
	}
}
