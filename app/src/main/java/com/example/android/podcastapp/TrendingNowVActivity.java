package com.example.android.podcastapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class TrendingNowVActivity extends AppCompatActivity {

    TextView catVNewExplicit;
    TextView catVTopAudioExplicit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audio_v_fpromos_list);
        ArrayList<AudioVFpromos> audiovfpromotion = new ArrayList<AudioVFpromos>();
        audiovfpromotion.add(new AudioVFpromos("Emotions Part One", "Author"));
        audiovfpromotion.add(new AudioVFpromos("Emotions Part One", "Author"));
        audiovfpromotion.add(new AudioVFpromos("Emotions Part One", "Author"));
        audiovfpromotion.add(new AudioVFpromos("Emotions Part One", "Author"));
        audiovfpromotion.add(new AudioVFpromos("Emotions Part One", "Author"));
        audiovfpromotion.add(new AudioVFpromos("Emotions Part One", "Author"));
        audiovfpromotion.add(new AudioVFpromos("Emotions Part One", "Author"));
        AudioVFpromosAdapter adapter = new AudioVFpromosAdapter(this, audiovfpromotion);
        ListView listView = findViewById(R.id.fpromos_list_v_audio);
        listView.setAdapter(adapter);

        catVNewExplicit = findViewById(R.id.btn_fpromos_v_text_view2);

        catVNewExplicit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent newVIntent = new Intent(TrendingNowVActivity.this, NewVActivity.class);
                startActivity(newVIntent);
            }
        });

        catVTopAudioExplicit = findViewById(R.id.btn_fpromos_v_text_view3);

        catVTopAudioExplicit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent topAudioVIntent = new Intent(TrendingNowVActivity.this, TopAudioVActivity.class);
                startActivity(topAudioVIntent);
            }
        });

    }
}