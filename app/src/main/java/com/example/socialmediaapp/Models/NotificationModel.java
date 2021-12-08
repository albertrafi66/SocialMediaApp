package com.example.socialmediaapp.Models;

public class NotificationModel {

    int NtImage;
    String Nt_details;
    String Nt_time;

    public NotificationModel(int ntImage, String nt_details, String nt_time) {
        NtImage = ntImage;
        Nt_details = nt_details;
        Nt_time = nt_time;
    }

    public int getNtImage() {
        return NtImage;
    }

    public void setNtImage(int ntImage) {
        NtImage = ntImage;
    }

    public String getNt_details() {
        return Nt_details;
    }

    public void setNt_details(String nt_details) {
        Nt_details = nt_details;
    }

    public String getNt_time() {
        return Nt_time;
    }

    public void setNt_time(String nt_time) {
        Nt_time = nt_time;
    }
}
