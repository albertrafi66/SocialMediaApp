package com.example.socialmediaapp.Models;

public class FriendListModel {

    int Imgprofile;

    String friend_name,about,friendShipDate;


    public FriendListModel(int imgprofile, String friend_name, String about, String friendShipDate) {
        Imgprofile = imgprofile;
        this.friend_name = friend_name;
        this.about = about;
        this.friendShipDate = friendShipDate;
    }

    public int getImgprofile() {
        return Imgprofile;
    }

    public void setImgprofile(int imgprofile) {
        Imgprofile = imgprofile;
    }

    public String getFriend_name() {
        return friend_name;
    }

    public void setFriend_name(String friend_name) {
        this.friend_name = friend_name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getFriendShipDate() {
        return friendShipDate;
    }

    public void setFriendShipDate(String friendShipDate) {
        this.friendShipDate = friendShipDate;
    }



}
