package com.example.ifst;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Event extends AppCompatActivity {

    Button day1,day2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
         final ViewPager viewPager= findViewById(R.id.eventViewpager);
        DayAdapter adapter= new DayAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        day1= findViewById(R.id.btn1);
        day2= findViewById(R.id.btn2);
        day1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0,true);
            }
        });
        day2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1,true);
            }
        });

    }
}
