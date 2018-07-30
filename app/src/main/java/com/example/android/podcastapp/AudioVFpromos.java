package com.example.android.podcastapp;

public class AudioVFpromos {
    private String mPodcastVFromosItems;
    private String mAuthorVFpromosItems;

    /**
     * Create a new Audio object.
     *
     * @param podcastvideovideofpromositem is the Podcast name in feature list (video)
     * @param authorvideofpromositem   is the Author in feature list (video)
     */
    public AudioVFpromos(String podcastvideovideofpromositem, String authorvideofpromositem) {
        mPodcastVFromosItems = podcastvideovideofpromositem;
        mAuthorVFpromosItems = authorvideofpromositem;
    }

    public String getPodcastNameVFpromosItem() {return mPodcastVFromosItems;}
    public String getAuthorVFpromosItem() {return mAuthorVFpromosItems;}
}