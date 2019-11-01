package action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

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
	
	public void setUsername(String usename) {
		this.username = usename;
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
			this.sessionmap.put("username", username);
			return "success";
		}
		return "failed";
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		this.sessionmap = (SessionMap<String, Object>)arg0;
	}
	
}
