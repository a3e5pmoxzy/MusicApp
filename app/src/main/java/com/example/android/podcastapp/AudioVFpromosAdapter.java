package com.example.android.podcastapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AudioVFpromosAdapter extends ArrayAdapter<AudioVFpromos>{

    /**
     * @param context The current context.
     * @param audiovfpromotion   A List of Audio objects (Audio, Video, Custom) to display in a list
     */
    public AudioVFpromosAdapter(Activity context, ArrayList<AudioVFpromos> audiovfpromotion) {
        super(context, 0, audiovfpromotion);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.audio_v_fpromos_list_items, parent, false);
        }
        AudioVFpromos currentVFpromos = getItem(position);
        TextView podcastNameVFpromosTextView = listItemView.findViewById(R.id.podcast_name_text_view);
        podcastNameVFpromosTextView.setText(currentVFpromos.getPodcastNameVFpromosItem());
        TextView authorVFpromosTextView = listItemView.findViewById(R.id.author_text_view);
        authorVFpromosTextView.setText(currentVFpromos.getAuthorVFpromosItem());
        return listItemView;
    }
}

