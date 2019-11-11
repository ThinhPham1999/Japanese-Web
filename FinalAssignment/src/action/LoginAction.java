package action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import bean.User;
import bo.UserBO;

public class LoginAction extends ActionSupport implements SessionAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String pass;
	SessionMap<String, Object> sessionmap;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public LoginAction() {
		super();
	}
	
	public String execute() {
		UserBO userbo = new UserBO();
		if (userbo.validate(username, pass)) {
			User user = userbo.getUser(userbo.getUserID(username));
			System.out.println(user);
			this.sessionmap.put("userID", user.getUserID());
			if (user.getPermission() == 2) return "success";
			if (user.getPermission() == 1) return "succesTeacher";
			if (user.getPermission() == 0) return "successAdmin";
		}
		return "failed";
	}
	
	public String logout() {
		sessionmap.remove("customerID");
		return "success";
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		this.sessionmap = (SessionMap<String, Object>)arg0;
	}
	
}
