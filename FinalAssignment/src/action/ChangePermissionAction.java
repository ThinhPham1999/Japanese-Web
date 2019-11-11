package action;

import com.opensymphony.xwork2.ActionSupport;

import bean.User;
import bo.UserBO;

public class ChangePermissionAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private int id;
	private int permission;
	
	public int getPermission() {
		return permission;
	}

	public void setPermission(int permission) {
		this.permission = permission;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ChangePermissionAction() {
		super();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String view() {
		UserBO userbo = new UserBO();
		this.user = userbo.getUser(id);
		return "success";
	}
	
	public String execute() {
		System.out.println(permission);
		UserBO userbo = new UserBO();
		user = userbo.getUser(id);
		user.setPermission(permission);
		userbo.update(user);
		return "success";
	}

}
