package com.example.android.miwok;

/* == Created by Tom Gehrke on 1/13/2017. == */

public class Word {

    private String mMiwokWord;
    private String mDefaultWord;

    public Word(String defaultWord, String miwokWord) {
        mDefaultWord = defaultWord;
        mMiwokWord = miwokWord;
    }

    public void setMiwokWord(String newWord) {
        mMiwokWord = newWord;
    }

    public void setDefaultWord(String newWord) {
        mDefaultWord = newWord;
    }

    public String getMiwokWord() {
        return mMiwokWord;
    }

    public String getDefaultWord() {
        return mDefaultWord;
    }
}
