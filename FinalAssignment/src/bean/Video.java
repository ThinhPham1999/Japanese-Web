package bean;

public class Video {
	private int videoID;
	private String videoName;
	private String videoLink;
	private int userID;
	
	public int getTeacherID() {
		return userID;
	}

	public void setTeacherID(int teacherID) {
		this.userID = teacherID;
	}

	public Video(int videoID, String videoName, String videoLink, int teacherID) {
		super();
		this.videoID = videoID;
		this.videoName = videoName;
		this.videoLink = videoLink;
		this.userID = teacherID;
	}

	public Video() {
		super();
	}

	public int getVideoID() {
		return videoID;
	}

	public void setVideoID(int videoID) {
		this.videoID = videoID;
	}

	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public String getVideoLink() {
		return videoLink;
	}

	public void setVideoLink(String videoLink) {
		this.videoLink = videoLink;
	}

	@Override
	public String toString() {
		return "Video [videoID=" + videoID + ", videoName=" + videoName + ", videoLink=" + videoLink + "]";
	}
	
}
