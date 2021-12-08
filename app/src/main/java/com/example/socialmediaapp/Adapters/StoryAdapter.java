package com.example.socialmediaapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.socialmediaapp.Models.StoryModel;
import com.example.socialmediaapp.R;

import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.ViewHolder> {


    ArrayList<StoryModel> storyModelsList;
    Context context;

    public StoryAdapter(ArrayList<StoryModel> storyModels, Context context) {
        this.storyModelsList = storyModels;
        this.context = context;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.rec_home_story,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        StoryModel storyModel=storyModelsList.get(position);

        holder.story.setImageResource(storyModel.getStory());
        holder.storyProfile.setImageResource(storyModel.getStoryProfile());
        holder.storyName.setText(storyModel.getStoryName());
        holder.storyType.setImageResource(storyModel.getStoryType());

    }

    @Override
    public int getItemCount() {
        return storyModelsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView story,storyType,storyProfile;
        TextView storyName;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            story=itemView.findViewById(R.id.story_images);
            storyProfile=itemView.findViewById(R.id.rec_story_profile_image);
            storyType=itemView.findViewById(R.id.story_type);
            storyName=itemView.findViewById(R.id.story_name);



        }
    }
}
