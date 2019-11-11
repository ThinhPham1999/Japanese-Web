package action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import bean.User;
import bo.UserBO;

public class EditUserAction extends ActionSupport implements ModelDriven<User>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user = new User();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String execute() {
		UserBO userbo = new UserBO();
		userbo.update(user);
		return "success";
	}
	
	public String view() {
		Map<String, Object> session = ActionContext.getContext().getSession();
		int id = (int)session.get("userID");
		UserBO userbo = new UserBO();
		this.user = userbo.getUser(id);
		return "succces";
	}
	
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
}
