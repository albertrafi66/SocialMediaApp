package com.example.socialmediaapp.Fragments.ViewPagerFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socialmediaapp.Adapters.NotificationDetailsAdapter;
import com.example.socialmediaapp.Models.NotificationModel;
import com.example.socialmediaapp.R;

import java.util.ArrayList;


public class NotificationDetailsFragment extends Fragment {

   RecyclerView ntRec;
   ArrayList<NotificationModel> ntList;
   View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_notification_details, container, false);

        ntRec=view.findViewById(R.id.rec_noti_details);

        ntList=new ArrayList<>();

        ntList.add(new NotificationModel(R.drawable.p1,"<b>Albert Rafi</b> is liked your comment","Just Noz"));
        ntList.add(new NotificationModel(R.drawable.p1,"<b>Albert Rafi</b> is liked your comment","Just Noz"));
        ntList.add(new NotificationModel(R.drawable.p1,"<b>Albert Rafi</b> is liked your comment","Just Noz"));
        ntList.add(new NotificationModel(R.drawable.p1,"<b>Albert Rafi</b> is liked your comment","Just Noz"));
        ntList.add(new NotificationModel(R.drawable.p1,"<b>Albert Rafi</b> is liked your comment","Just Noz"));
        ntList.add(new NotificationModel(R.drawable.p1,"<b>Albert Rafi</b> is liked your comment","Just Noz"));
        ntList.add(new NotificationModel(R.drawable.p1,"<b>Albert Rafi</b> is liked your comment","Just Noz"));
        ntList.add(new NotificationModel(R.drawable.p1,"<b>Albert Rafi</b> is liked your comment","Just Noz"));
        ntList.add(new NotificationModel(R.drawable.p1,"<b>Albert Rafi</b> is liked your comment","Just Noz"));

        NotificationDetailsAdapter notificationDetailsAdapter=new NotificationDetailsAdapter(ntList,getContext());
        ntRec.setAdapter(notificationDetailsAdapter);
        ntRec.setLayoutManager(new LinearLayoutManager(getActivity()));






        return view;

    }
}