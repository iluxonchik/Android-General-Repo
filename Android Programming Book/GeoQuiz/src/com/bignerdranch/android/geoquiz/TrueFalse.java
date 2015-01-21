package com.bignerdranch.android.geoquiz;

/**
 * Encapsulates a single True-False question.
 */
public class TrueFalse {
	private int mQuestion; // holds the res ID of the string for the question
	
	private boolean mTrueQuestion; // indicates whether the statement is True
	
	public TrueFalse(int question, boolean trueQuestion) {
		mQuestion = question;
		mTrueQuestion = trueQuestion;
	}

	public int getQuestion() {
		return mQuestion;
	}

	public void setQuestion(int question) {
		mQuestion = question;
	}

	public boolean isTrueQuestion() {
		return mTrueQuestion;
	}

	public void setTrueQuestion(boolean trueQuestion) {
		mTrueQuestion = trueQuestion;
	}
}
