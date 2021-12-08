package com.example.socialmediaapp.Adapters;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.socialmediaapp.Models.NotificationModel;
import com.example.socialmediaapp.R;

import java.util.ArrayList;

public class NotificationDetailsAdapter extends RecyclerView.Adapter<NotificationDetailsAdapter.ViewHolder> {

    ArrayList<NotificationModel> NtList;
    Context context;

    public NotificationDetailsAdapter(ArrayList<NotificationModel> ntModel, Context context) {
        NtList = ntModel;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.rec_notification_details,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        NotificationModel ntMpodel= NtList.get(position);

        holder.nt_image.setImageResource(ntMpodel.getNtImage());
        holder.nt_details.setText(Html.fromHtml(ntMpodel.getNt_details()));
        holder.nt_time.setText(ntMpodel.getNt_time());





    }

    @Override
    public int getItemCount() {
        return NtList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView nt_image;
        TextView nt_details,nt_time;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nt_image=itemView.findViewById(R.id.notification_profile_image);
            nt_details=itemView.findViewById(R.id.txt_noti_details);
            nt_time=itemView.findViewById(R.id.txt_noti_details_time);


        }
    }
}
