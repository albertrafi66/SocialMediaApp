package com.example.socialmediaapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socialmediaapp.Adapters.PostAdapter;
import com.example.socialmediaapp.Adapters.StoryAdapter;
import com.example.socialmediaapp.Models.PostModel;
import com.example.socialmediaapp.Models.StoryModel;
import com.example.socialmediaapp.R;

import java.util.ArrayList;


public class HomeFragment extends Fragment {


    RecyclerView recyclerView,rv_post;
    ArrayList<StoryModel> storyModels=new ArrayList<>();
    ArrayList<PostModel>postList=new ArrayList<>();
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView=view.findViewById(R.id.rec_story_home);
        rv_post=view.findViewById(R.id.home_frag_post);


        setStory();

        setPost();















        return view;
    }

    private void setPost() {

    postList.add(new PostModel(R.drawable.profile_pic,R.drawable.p1,R.drawable.book_mark,"Albert Rafi","Nice travell","56","78","40"));
    postList.add(new PostModel(R.drawable.profile_pic,R.drawable.p2,R.drawable.book_mark,"Albert Rafi","Nice travell","56","78","40"));
    postList.add(new PostModel(R.drawable.profile_pic,R.drawable.p3,R.drawable.book_mark,"Albert Rafi","Nice travell","56","78","40"));
    postList.add(new PostModel(R.drawable.profile_pic,R.drawable.p4,R.drawable.book_mark,"Albert Rafi","Nice travell","56","78","40"));
    postList.add(new PostModel(R.drawable.profile_pic,R.drawable.p5,R.drawable.book_mark,"Albert Rafi","Nice travell","56","78","40"));
    postList.add(new PostModel(R.drawable.profile_pic,R.drawable.p6,R.drawable.book_mark,"Albert Rafi","Nice travell","56","78","40"));

        postList.add(new PostModel(R.drawable.profile_pic,R.drawable.p1,R.drawable.book_mark,"Albert Rafi","Nice travell","56","78","40"));
        postList.add(new PostModel(R.drawable.profile_pic,R.drawable.p2,R.drawable.book_mark,"Albert Rafi","Nice travell","56","78","40"));
        postList.add(new PostModel(R.drawable.profile_pic,R.drawable.p3,R.drawable.book_mark,"Albert Rafi","Nice travell","56","78","40"));
        postList.add(new PostModel(R.drawable.profile_pic,R.drawable.p4,R.drawable.book_mark,"Albert Rafi","Nice travell","56","78","40"));
        postList.add(new PostModel(R.drawable.profile_pic,R.drawable.p5,R.drawable.book_mark,"Albert Rafi","Nice travell","56","78","40"));
        postList.add(new PostModel(R.drawable.profile_pic,R.drawable.p6,R.drawable.book_mark,"Albert Rafi","Nice travell","56","78","40"));
        PostAdapter postAdapter=new PostAdapter(postList,getContext());

        rv_post.setAdapter(postAdapter);

        rv_post.setLayoutManager(new LinearLayoutManager(getActivity()));










    }

    private void setStory() {



        storyModels.add(new StoryModel(R.drawable.profile_pic,R.drawable.live,R.drawable.profile_pic,"Albert Rafi"));
        storyModels.add(new StoryModel(R.drawable.profile_pic,R.drawable.live,R.drawable.profile_pic,"Albert Rafi"));
        storyModels.add(new StoryModel(R.drawable.profile_pic,R.drawable.live,R.drawable.profile_pic,"Albert Rafi"));
        storyModels.add(new StoryModel(R.drawable.profile_pic,R.drawable.live,R.drawable.profile_pic,"Albert Rafi"));


        StoryAdapter storyAdapter=new StoryAdapter(storyModels,getActivity());
        recyclerView.setAdapter(storyAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setNestedScrollingEnabled(false);


    }
}