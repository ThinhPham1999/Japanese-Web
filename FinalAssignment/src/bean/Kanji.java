package bean;

public class Kanji {
	private int kanjiID;
	private String kanjiValue;
	private String kanjiHira;
	private String kanjiVietnamese;
	private int userID;
	
	
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public Kanji(int kanjiID, String kanjiValue, String kanjiHira, String kanjiVietnamese, int userID) {
		super();
		this.kanjiID = kanjiID;
		this.kanjiValue = kanjiValue;
		this.kanjiHira = kanjiHira;
		this.kanjiVietnamese = kanjiVietnamese;
		this.userID = userID;
	}

	public int getKanjiID() {
		return kanjiID;
	}

	public void setKanjiID(int kanjiID) {
		this.kanjiID = kanjiID;
	}

	public String getKanjiValue() {
		return kanjiValue;
	}

	public void setKanjiValue(String kanjiValue) {
		this.kanjiValue = kanjiValue;
	}

	public String getKanjiHira() {
		return kanjiHira;
	}

	public void setKanjiHira(String kanjiHira) {
		this.kanjiHira = kanjiHira;
	}

	public String getKanjiVietnamese() {
		return kanjiVietnamese;
	}

	public void setKanjiVietnamese(String kanjiVietnamese) {
		this.kanjiVietnamese = kanjiVietnamese;
	}

	@Override
	public String toString() {
		return "Kanji [kanjiID=" + kanjiID + ", kanjiValue=" + kanjiValue + ", kanjiHira=" + kanjiHira
				+ ", kanjiVietnamese=" + kanjiVietnamese + "]";
	}
}
