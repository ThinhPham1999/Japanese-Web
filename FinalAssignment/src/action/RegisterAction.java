package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import bean.User;
import bo.UserBO;

public class RegisterAction extends ActionSupport implements ModelDriven<User>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user = new User();
	
	public RegisterAction() {
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String execute() {
		UserBO userbo = new UserBO();
		System.out.print(this.user);
		if(userbo.validateRegister(user)) {
			System.out.println(user);
			return "success";
		}
		return "failed";
	}

	@Override
	public User getModel() {
		return user;
	}
}
