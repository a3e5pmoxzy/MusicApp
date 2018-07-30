package com.example.android.podcastapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView catVTrendingNow;
    TextView catVNew;
    TextView catVTopAudio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catVTrendingNow = findViewById(R.id.cat_v_trendingnow);

        catVTrendingNow.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent trendingNowVIntent = new Intent(MainActivity.this, TrendingNowVActivity.class);
                startActivity(trendingNowVIntent);
            }
        });

        catVNew = findViewById(R.id.cat_v_new);

        catVNew.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent newVIntent = new Intent(MainActivity.this, NewVActivity.class);
                startActivity(newVIntent);
            }
        });

       catVTopAudio = findViewById(R.id.cat_v_top_audio);

        catVTopAudio.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent topAudioVIntent = new Intent(MainActivity.this, TopAudioVActivity.class);
                startActivity(topAudioVIntent);
            }
        });
    }
}