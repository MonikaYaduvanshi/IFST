package com.example.ifst;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


public class HelpDesk extends AppCompatActivity {

    String[] venue = {"G-7", "G-7", "G-7", "G-7", "G-7", "G-7", "Auditorium", "Auditorium", "Auditorium", "Auditorium"};

    String[] name = {"Upma", "Pinky", "Pooja Chauhan", "Shivam Yadav", "Rohit Kumar", "Nadeem", "Dimple Singh", "Pritam", "Abhiniti Garg", "Sagun Sharma"};

    String[] phone = {"+917082375866", "-", "+919816473187", "+918810500070", "+919518234798", "+919015320058", "+919958127533", "+919650332275", "+919999059703", "+917838839808"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_desk);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewPartner);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new HelpDeskRecyclerList(this,name,venue,phone));


    }
}
