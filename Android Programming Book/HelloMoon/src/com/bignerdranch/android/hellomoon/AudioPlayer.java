package com.bignerdranch.android.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

public class AudioPlayer {

	private MediaPlayer mPlayer;
	
	public void stop() {
		if (mPlayer != null) {
			mPlayer.release();
			mPlayer = null;
		}
	}
	
	public void play(Context c) {
		// prevent creation of multiple MPs if the user clicks "Play"
		// multiple times.
		stop();
		
		// the method below needs context to make sense of the resource ID
		mPlayer = MediaPlayer.create(c, R.raw.one_small_step);
		mPlayer.start();
		
		mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
			
			@Override
			public void onCompletion(MediaPlayer mp) {
				// release as soon as we don't need it
				mp.stop();
			}
		});
	}
}

/*
  NOTE: keep exactly one MediaPlayer around and keep it only as long as it is playing
  something.
*/