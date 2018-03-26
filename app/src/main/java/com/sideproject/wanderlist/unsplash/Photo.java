package com.sideproject.wanderlist.unsplash;

public class Photo {
    private String mPhotoId;
    private String mPhotoUrl;
    private String mUser;
    private String mUserProfileImage;
    private int mLikes;


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
        return mUser;
    }

    public void setUser(String user) {
        mUser = user;
    }

    public String getUserProfileImage() {
        return mUserProfileImage;
    }

    public void setUserProfileImage(String userProfileImage) {
        mUserProfileImage = userProfileImage;
    }

}
