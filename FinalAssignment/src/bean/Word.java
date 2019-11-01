package bean;

public class Word {
	private int wordID;
	private String wordJanpanese;
	private String wordVietnamese;
	private String wordAudioLink;
	private String wordKanji;
	private int userID;
	
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public Word(int wordID, String wordJanpanese, String wordVietnamese, String wordAudioLink, String wordKanji,
			int userID) {
		super();
		this.wordID = wordID;
		this.wordJanpanese = wordJanpanese;
		this.wordVietnamese = wordVietnamese;
		this.wordAudioLink = wordAudioLink;
		this.wordKanji = wordKanji;
		this.userID = userID;
	}

	public Word() {
		super();
	}

	public int getWordID() {
		return wordID;
	}

	public void setWordID(int wordID) {
		this.wordID = wordID;
	}

	public String getWordJanpanese() {
		return wordJanpanese;
	}

	public void setWordJanpanese(String wordJanpanese) {
		this.wordJanpanese = wordJanpanese;
	}

	public String getWordVietnamese() {
		return wordVietnamese;
	}

	public void setWordVietnamese(String wordVietnamese) {
		this.wordVietnamese = wordVietnamese;
	}

	public String getWordAudioLink() {
		return wordAudioLink;
	}

	public void setWordAudioLink(String wordAudioLink) {
		this.wordAudioLink = wordAudioLink;
	}

	public String getWordKanji() {
		return wordKanji;
	}

	public void setWordKanji(String wordKanji) {
		this.wordKanji = wordKanji;
	}

	@Override
	public String toString() {
		return "Word [wordID=" + wordID + ", wordJanpanese=" + wordJanpanese + ", wordVietnamese=" + wordVietnamese
				+ ", wordAudioLink=" + wordAudioLink + ", wordKanji=" + wordKanji + "]";
	}
}
