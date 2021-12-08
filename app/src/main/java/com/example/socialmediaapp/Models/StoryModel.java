package com.example.socialmediaapp.Models;

public class StoryModel {

    int story,storyType,storyProfile;
    String storyName;

    public StoryModel(int story, int storyType, int storyProfile, String storyName) {
        this.story = story;
        this.storyType = storyType;
        this.storyProfile = storyProfile;
        this.storyName = storyName;
    }

    public int getStory() {
        return story;
    }

    public void setStory(int story) {
        this.story = story;
    }

    public int getStoryType() {
        return storyType;
    }

    public void setStoryType(int storyType) {
        this.storyType = storyType;
    }

    public int getStoryProfile() {
        return storyProfile;
    }

    public void setStoryProfile(int storyProfile) {
        this.storyProfile = storyProfile;
    }

    public String getStoryName() {
        return storyName;
    }

    public void setStoryName(String storyName) {
        this.storyName = storyName;
    }
}
