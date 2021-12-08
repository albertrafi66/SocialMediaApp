package com.example.socialmediaapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.socialmediaapp.Models.FriendListModel;
import com.example.socialmediaapp.R;

import java.util.ArrayList;

public class FriendListAdapter extends RecyclerView.Adapter<FriendListAdapter.ViewHolder> {

    ArrayList<FriendListModel> friendList;
    Context context;

    public FriendListAdapter(ArrayList<FriendListModel> friendList, Context context) {
        this.friendList = friendList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.rv_profile_friend_list,parent,false);



        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        FriendListModel friendListModel=friendList.get(position);

        holder.friendProfile.setImageResource(friendListModel.getImgprofile());
        holder.friendName.setText(friendListModel.getFriend_name());
        holder.friendAbout.setText(friendListModel.getAbout());
        holder.friendShipDate.setText(friendListModel.getFriendShipDate());








    }

    @Override
    public int getItemCount() {
        return friendList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView friendProfile;
        TextView friendName,friendAbout,friendShipDate;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            friendProfile=itemView.findViewById(R.id.img_profile_friend_list);
            friendName=itemView.findViewById(R.id.friend_name);
            friendAbout=itemView.findViewById(R.id.friend_about);
            friendShipDate=itemView.findViewById(R.id.friend_ship_date);



        }
    }
}
