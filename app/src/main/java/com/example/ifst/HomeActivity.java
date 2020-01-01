package com.example.ifst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RelativeLayout relativeLayout5 = findViewById(R.id.cardRelative5);
        RelativeLayout relativeLayout1 = findViewById(R.id.cardRelative1);
        RelativeLayout relativeLayout4 = findViewById(R.id.cardRelative4);
        RelativeLayout relativeLayoutGallery = findViewById(R.id.relativeViewGallery);
        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, Collaborators.class));
            }
        });
        relativeLayout4.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, Organizers.class));
            }
        });

        relativeLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, SpeakersList.class));
            }
        });
        relativeLayoutGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,Gallery.class));
            }
        });
    }
}
