package bean;

public class Test {
	private int testID;
	private String testName;
	private String testDate;
	private int userID;
	
	public Test(int testID, String testName, String testDate, int teacherID) {
		super();
		this.testID = testID;
		this.testName = testName;
		this.testDate = testDate;
		this.userID = teacherID;
	}

	public int getTestID() {
		return testID;
	}

	public void setTestID(int testID) {
		this.testID = testID;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getTestDate() {
		return testDate;
	}

	public void setTestDate(String testDate) {
		this.testDate = testDate;
	}

	public int getTeacherID() {
		return userID;
	}

	public void setTeacherID(int teacherID) {
		this.userID = teacherID;
	}

	@Override
	public String toString() {
		return "Test [testID=" + testID + ", testName=" + testName + ", testDate=" + testDate + ", teacherID="
				+ userID + "]";
	}
}
