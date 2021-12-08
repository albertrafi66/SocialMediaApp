package com.example.socialmediaapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socialmediaapp.Fragments.ViewPagerFragments.NotificationDetailsFragment;
import com.example.socialmediaapp.Fragments.ViewPagerFragments.RequestFragment;
import com.example.socialmediaapp.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;


public class NotificationsFragment extends Fragment {


    TabLayout tabLayout;
    TabItem notiTabItm,recTabItm;

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.fragment_notifications, container, false);


        replace(new NotificationDetailsFragment());
        tabLayout=view.findViewById(R.id.tabLayout_notification);
        notiTabItm=view.findViewById(R.id.tabItmNotification);
        recTabItm=view.findViewById(R.id.tabItmRequest);


       tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
           @Override
           public void onTabSelected(TabLayout.Tab tab) {

               switch (tab.getPosition()){

                   case 0:
                       replace(new NotificationsFragment());
                       break;
                   case 1:
                       replace(new RequestFragment());
                       break;
               }
           }
           @Override
           public void onTabUnselected(TabLayout.Tab tab) {
           }
           @Override
           public void onTabReselected(TabLayout.Tab tab) {
           }
       });














        return view;

    }


    private void replace(Fragment fragment) {

        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frm_layout_notification_container,fragment);
        fragmentTransaction.commit();


    }
}