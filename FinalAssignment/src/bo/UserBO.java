package bo;

import bean.User;
import dao.UserDao;

public class UserBO {

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
}
