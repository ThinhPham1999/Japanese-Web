package bo;

import bean.User;
import dao.UserDao;

public class UserBO {
	private User user;
	
	public UserBO() {
		super();
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean validate(String username, String pass) {
		setUser(UserDao.getUser(username));
		if (this.user != null) {
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
}
