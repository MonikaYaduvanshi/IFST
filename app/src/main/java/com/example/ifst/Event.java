package com.example.ifst;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.FirebaseDatabase;

public class Event extends AppCompatActivity {

    Button day1,day2;
    ViewPager viewPager;
    ViewPager.OnPageChangeListener onPageChangeListener= new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            int x= viewPager.getCurrentItem();
            if(x==0){
                day1.setBackground(getDrawable(R.drawable.roundbutton));
                day2.setBackground(getDrawable(R.drawable.buttoncolor));
            }
            else{
                day1.setBackground(getDrawable(R.drawable.buttoncolor));
                day2.setBackground(getDrawable(R.drawable.roundbutton));
            }

        }

        @Override
        public void onPageSelected(int position) {


        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        viewPager= findViewById(R.id.eventViewpager);
        viewPager.addOnPageChangeListener(onPageChangeListener);
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
