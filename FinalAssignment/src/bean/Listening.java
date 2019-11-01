package bean;

public class Listening {
	private int listeningID;
	private String listeningName;
	private String listenLink;
	private int userID;

	public int getTeacherID() {
		return userID;
	}

	public void setTeacherID(int teacherID) {
		this.userID = teacherID;
	}

	public Listening(int listeningID, String listeningName, String listenLink, int teacherID) {
		super();
		this.listeningID = listeningID;
		this.listeningName = listeningName;
		this.listenLink = listenLink;
		this.userID = teacherID;
	}

	public int getListeningID() {
		return listeningID;
	}

	public void setListeningID(int listeningID) {
		this.listeningID = listeningID;
	}

	public String getListeningName() {
		return listeningName;
	}

	public void setListeningName(String listeningName) {
		this.listeningName = listeningName;
	}

	public String getListenLink() {
		return listenLink;
	}

	public void setListenLink(String listenLink) {
		this.listenLink = listenLink;
	}

	@Override
	public String toString() {
		return "Listening [listeningID=" + listeningID + ", listeningName=" + listeningName + ", listenLink="
				+ listenLink + "]";
	}
	
	
	
}
