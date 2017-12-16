package com.nano.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton playButton,pauseButton;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        pauseButton = (ImageButton ) findViewById ( R.id.pauseButtonId );
        playButton = (ImageButton ) findViewById ( R.id.playButtonId );

        mediaPlayer = MediaPlayer.create ( this,R.raw.pakhi);

        playButton.setOnClickListener ( this );
        pauseButton.setOnClickListener ( this );


    }

    @Override
    public void onClick(View view) {

        if (view.getId () == R.id.playButtonId)
        {

            if(mediaPlayer != null)
            {
                mediaPlayer.start ();
            }

        }

        else if (view.getId () == R.id.pauseButtonId)
        {

            if(mediaPlayer != null)
            {
                mediaPlayer.pause ();
            }

        }

    }

    @Override
    protected void onDestroy() {

        mediaPlayer.stop ();
        mediaPlayer.release ();
        mediaPlayer = null;

        super.onDestroy ();
    }
}
