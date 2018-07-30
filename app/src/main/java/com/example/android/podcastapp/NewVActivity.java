package com.example.android.podcastapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NewVActivity extends AppCompatActivity {

    TextView catVTrendingNowExplicit;
    TextView catVTopAudioExplicit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audio_v_fpromos_list);
        ArrayList<AudioVFpromos> audiovfpromotion = new ArrayList<AudioVFpromos>();
        audiovfpromotion.add(new AudioVFpromos("The Problem with the Now", "Author"));
        audiovfpromotion.add(new AudioVFpromos("The Problem with the Now", "Author"));
        audiovfpromotion.add(new AudioVFpromos("The Problem with the Now", "Author"));
        audiovfpromotion.add(new AudioVFpromos("The Problem with the Now", "Author"));
        audiovfpromotion.add(new AudioVFpromos("The Problem with the Now", "Author"));
        audiovfpromotion.add(new AudioVFpromos("The Problem with the Now", "Author"));
        audiovfpromotion.add(new AudioVFpromos("The Problem with the Now", "Author"));
        AudioVFpromosAdapter adapter = new AudioVFpromosAdapter(this, audiovfpromotion);
        ListView listView = findViewById(R.id.fpromos_list_v_audio);
        listView.setAdapter(adapter);

        catVTrendingNowExplicit = findViewById(R.id.btn_fpromos_v_text_view1);

        catVTrendingNowExplicit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent trendingNowVIntent = new Intent(NewVActivity.this, TrendingNowVActivity.class);
                startActivity(trendingNowVIntent);
            }
        });

        catVTopAudioExplicit = findViewById(R.id.btn_fpromos_v_text_view3);

        catVTopAudioExplicit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent topAudioVIntent = new Intent(NewVActivity.this, TopAudioVActivity.class);
                startActivity(topAudioVIntent);
            }
        });

    }
}