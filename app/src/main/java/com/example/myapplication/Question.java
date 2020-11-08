package com.example.myapplication;

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;

    public int getmTextResId() {
        return mTextResId;
    }

    public void setmTextResId(int mTextResId) {
        this.mTextResId = mTextResId;
    }

    public boolean ismAnswerTrue() {
        return mAnswerTrue;
    }

    public void setmAnswerTrue(boolean mAnswerTrue) {
        this.mAnswerTrue = mAnswerTrue;
    }



    public Question(int mTestResId, boolean mAnswerTrue) {
        this.mTextResId = mTestResId;
        this.mAnswerTrue = mAnswerTrue;
    }
}
