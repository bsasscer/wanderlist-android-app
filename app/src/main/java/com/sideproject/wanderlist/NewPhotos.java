package com.sideproject.wanderlist;

public class NewPhotos {
    private String mPhotoId;
    private String mPhotoUrl;
    private int mLikes;
    private String mUserName;
    private String mUserProfileImage;

    public String getPhotoId() {
        return mPhotoId;
    }

    public void setPhotoId(String photoId) {
        mPhotoId = photoId;
    }

    public String getPhotoUrl() {
        return mPhotoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        mPhotoUrl = photoUrl;
    }

    public int getLikes() {
        return mLikes;
    }

    public void setLikes(int likes) {
        mLikes = likes;
    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String userName) {
        mUserName = userName;
    }

    public String getUserProfileImage() {
        return mUserProfileImage;
    }

    public void setUserProfileImage(String userProfileImage) {
        mUserProfileImage = userProfileImage;
    }
}
