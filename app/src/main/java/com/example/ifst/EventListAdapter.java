package com.example.ifst;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class EventListAdapter extends RecyclerView.Adapter<EventListAdapter.EventViewHolder> {

    private Context mcontext;
   private ArrayList<EventLists> mEventLists;

    public EventListAdapter(Context mcontext, ArrayList<EventLists> mEventLists) {
        this.mcontext = mcontext;
        this.mEventLists = mEventLists;
    }


    @NonNull
    @Override
    public EventListAdapter.EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(mcontext).inflate(R.layout.eventlist,parent,false);
        return new EventViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull EventListAdapter.EventViewHolder holder, int position) {
          EventLists currentItem= mEventLists.get(position);
          String session= currentItem.getSession();
          String venue= currentItem.getVenue();
          String time= currentItem.getTime();
          holder.session.setText(session);
          holder.time.setText(time);
          holder.venue.setText(venue);


    }

    @Override
    public int getItemCount() {
        return mEventLists.size();
    }

    public class EventViewHolder extends RecyclerView.ViewHolder {
         public TextView session;
         public TextView venue;
         public  TextView time;


        public EventViewHolder(@NonNull View itemView) {
            super(itemView);
            session= itemView.findViewById(R.id.session);
            venue= itemView.findViewById(R.id.venue);
            time= itemView.findViewById(R.id.time);
        }
    }
}
