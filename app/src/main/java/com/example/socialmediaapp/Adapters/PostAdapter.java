package com.example.socialmediaapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.socialmediaapp.Models.PostModel;
import com.example.socialmediaapp.R;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {


    ArrayList<PostModel> postlist;
    Context context;


    public PostAdapter(ArrayList<PostModel> postlist, Context context) {
        this.postlist = postlist;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.rv_home_frag_layout,parent,false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        PostModel model=postlist.get(position);

        holder.profileImg.setImageResource(model.getProfileImg());
        holder.postImg.setImageResource(model.getPostImg());
        holder.share.setText(model.getShare());
        holder.cmnt.setText(model.getComment());
        holder.like.setText(model.getLike());
        holder.user_name.setText(model.getUser_name());
        holder.about.setText(model.getAbout());





    }

    @Override
    public int getItemCount() {
        return postlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView profileImg,postImg,save;
        TextView user_name,about,like,cmnt,share;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            postImg=itemView.findViewById(R.id.img_home_frag_post);
            profileImg=itemView.findViewById(R.id.profile_image_dashboard_post);
            save=itemView.findViewById(R.id.img_post_bookmark);
            user_name=itemView.findViewById(R.id.txt_dashboard_post_profile_name);
            about=itemView.findViewById(R.id.txt_post_about);
            like=itemView.findViewById(R.id.txt_post_like);
            cmnt=itemView.findViewById(R.id.txt_post_cmnt);
            share=itemView.findViewById(R.id.txt_post_share);




        }
    }
}
