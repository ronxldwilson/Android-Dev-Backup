package com.example.program09;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private ImageView background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.song);
        background = (ImageView) findViewById(R.id.imageView);
    }

    public void play(View view) {
        mediaPlayer.start();
        background.setBackgroundResource(R.color.blue);
    }

    public void pause(View view) {
        mediaPlayer.pause();
        background.setBackgroundResource(R.color.grey);
    }

    public void back(View view) {
        int currentPosition = mediaPlayer.getCurrentPosition();
        int newPosition = currentPosition - 15;
        mediaPlayer.seekTo(newPosition);
    }

    public void forward(View view) {
        int currentPosition = mediaPlayer.getCurrentPosition();
        int newPosition = currentPosition + 15;
        mediaPlayer.seekTo(newPosition);
    }

    public void stop(View view) {
        mediaPlayer.reset();
        background.setBackgroundResource(R.color.grey);
    }
}