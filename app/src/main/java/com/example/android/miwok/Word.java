package com.example.android.miwok;

/* == Created by Tom Gehrke on 1/13/2017. == */

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;

    private String mMiwokWord;
    private String mDefaultWord;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    public Word(String defaultWord, String miwokWord, int audioId) {
        mDefaultWord = defaultWord;
        mMiwokWord = miwokWord;
        mAudioResourceId = audioId;
    }

    public Word(String defaultWord, String miwokWord, int imageId, int audioId) {
        mDefaultWord = defaultWord;
        mMiwokWord = miwokWord;
        mImageResourceId = imageId;
        mAudioResourceId = audioId;
    }

    public String getMiwokWord() {
        return mMiwokWord;
    }

    public void setMiwokWord(String newWord) {
        mMiwokWord = newWord;
    }

    public String getDefaultWord() {
        return mDefaultWord;
    }

    public void setDefaultWord(String newWord) {
        mDefaultWord = newWord;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public void setImageResourceId(int newImageId) {
        mImageResourceId = newImageId;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public void setAudioResourceId(int newAudioId) {
        mAudioResourceId = newAudioId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokWord='" + mMiwokWord + '\'' +
                ", mDefaultWord='" + mDefaultWord + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
