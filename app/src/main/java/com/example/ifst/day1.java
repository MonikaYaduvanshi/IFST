package com.example.ifst;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class day1 extends Fragment {

private RecyclerView recyclerView;
private EventListAdapter eventListAdapter;
    private ArrayList<EventLists> mEventLists;

    public day1() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root=  inflater.inflate(R.layout.fragment_day1, container, false);
        recyclerView= root.findViewById(R.id.day1);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        eventListAdapter= new EventListAdapter(getActivity(),mEventLists);
        recyclerView.setAdapter(eventListAdapter);
        return root;


    }


}
