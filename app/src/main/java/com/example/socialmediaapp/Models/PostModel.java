package com.example.socialmediaapp.Models;

public class PostModel {

    int profileImg,postImg,save;
    String user_name,about,like,comment,share;

    public PostModel(int profileImg, int postImg, int save, String user_name, String about, String like, String comment, String share) {
        this.profileImg = profileImg;
        this.postImg = postImg;
        this.save = save;
        this.user_name = user_name;
        this.about = about;
        this.like = like;
        this.comment = comment;
        this.share = share;
    }

    public int getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(int profileImg) {
        this.profileImg = profileImg;
    }

    public int getPostImg() {
        return postImg;
    }

    public void setPostImg(int postImg) {
        this.postImg = postImg;
    }

    public int getSave() {
        return save;
    }

    public void setSave(int save) {
        this.save = save;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }
}
