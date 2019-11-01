package bean;

public class Question {
	private int questionID;
	private int questionType;
	private String questionTest;
	private int userID;
	
	public int getQuestionID() {
		return questionID;
	}

	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}

	public int getQuestionType() {
		return questionType;
	}

	public void setQuestionType(int questionType) {
		this.questionType = questionType;
	}

	public String getQuestionTest() {
		return questionTest;
	}

	public void setQuestionTest(String questionTest) {
		this.questionTest = questionTest;
	}

	public int getTeacherID() {
		return userID;
	}

	public void setTeacherID(int teacherID) {
		this.userID = teacherID;
	}

	public Question(int questionID, int questionType, String questionTest, int teacherID) {
		super();
		this.questionID = questionID;
		this.questionType = questionType;
		this.questionTest = questionTest;
		this.userID = teacherID;
	}

	public Question() {
		super();
	}

	@Override
	public String toString() {
		return "Question [questionID=" + questionID + ", questionType=" + questionType + ", questionTest="
				+ questionTest + ", teacherID=" + userID + "]";
	}
	
	
}
