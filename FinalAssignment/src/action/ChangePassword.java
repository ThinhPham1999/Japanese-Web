package action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import bean.User;
import bo.UserBO;

public class ChangePassword extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String oldpass;
	private String newpass;
	private String confirm;
	
	public ChangePassword() {
		super();
	}

	public String getOldpass() {
		return oldpass;
	}

	public void setOldpass(String oldpass) {
		this.oldpass = oldpass;
	}

	public String getNewpass() {
		return newpass;
	}

	public void setNewpass(String newpass) {
		this.newpass = newpass;
	}

	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	
	public String execute() {
		Map<String, Object> session = ActionContext.getContext().getSession();
		int id = (int)session.get("userID");
		UserBO userBo = new UserBO();
		User user = userBo.getUser(id);
		if (user.getUserPass().equals(this.oldpass)) {
			if (this.newpass.equals(this.confirm)) {
				user.setUserPass(newpass);
				userBo.update(user);
				return "success";
			}
		}
		return "failed";
	}
}
