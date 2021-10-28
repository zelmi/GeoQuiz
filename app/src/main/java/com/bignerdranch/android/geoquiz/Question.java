package com.bignerdranch.android.geoquiz;

public class Question {
//    mTextResId hold the ID for the string of the question
    private int mTextResId;

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public int getTextResId() {
        return mTextResId;
    }

    private boolean mAnswerTrue;

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }
}
