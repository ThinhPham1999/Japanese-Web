package bean;

public class Answer {
	private int answerID;
	private int questionID;
	private String answerText;
	
	public Answer(int answerID, int questionID, String answerText) {
		super();
		this.answerID = answerID;
		this.questionID = questionID;
		this.answerText = answerText;
	}

	public Answer() {
		super();
	}

	public int getAnswerID() {
		return answerID;
	}

	public void setAnswerID(int answerID) {
		this.answerID = answerID;
	}

	public int getQuestionID() {
		return questionID;
	}

	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}

	public String getAnswerText() {
		return answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}

	@Override
	public String toString() {
		return "Answer [answerID=" + answerID + ", questionID=" + questionID + ", answerText=" + answerText + "]";
	}
	
}
