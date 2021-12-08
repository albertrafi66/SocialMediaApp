package com.example.socialmediaapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socialmediaapp.Adapters.FriendListAdapter;
import com.example.socialmediaapp.Models.FriendListModel;
import com.example.socialmediaapp.R;

import java.util.ArrayList;


public class ProfileFragment extends Fragment {

   View view;
    RecyclerView RVFriendList;
    ArrayList<FriendListModel> friendList=new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.fragment_profile, container, false);

        RVFriendList=view.findViewById(R.id.rv_friend_list_profile);

        friendList.add(new FriendListModel(R.drawable.p1,"Mostak Mohosin Foisal","Senior Graphics Designer","Since May 2010"));
        friendList.add(new FriendListModel(R.drawable.p2,"Mostak Mohosin Foisal","Senior Graphics Designer","Since May 2010"));
        friendList.add(new FriendListModel(R.drawable.p3,"Mostak Mohosin Foisal","Senior Graphics Designer","Since May 2010"));
        friendList.add(new FriendListModel(R.drawable.p4,"Mostak Mohosin Foisal","Senior Graphics Designer","Since May 2010"));
        friendList.add(new FriendListModel(R.drawable.p5,"Mostak Mohosin Foisal","Senior Graphics Designer","Since May 2010"));
        friendList.add(new FriendListModel(R.drawable.p6,"Mostak Mohosin Foisal","Senior Graphics Designer","Since May 2010"));
        friendList.add(new FriendListModel(R.drawable.p1,"Mostak Mohosin Foisal","Senior Graphics Designer","Since May 2010"));
        friendList.add(new FriendListModel(R.drawable.p2,"Mostak Mohosin Foisal","Senior Graphics Designer","Since May 2010"));

        FriendListAdapter friendListAdapter=new FriendListAdapter(friendList,getContext());

        RVFriendList.setAdapter(friendListAdapter);
        RVFriendList.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));









        return view;

    }
}