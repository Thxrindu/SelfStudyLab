 package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity implements View.OnClickListener{

     private Button start, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MediaPlayer player = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
        //player.setLooping(true);
        //player.start();

        start = (Button) findViewById(R.id.buttonStart);
        stop = (Button) findViewById(R.id.buttonStop);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if (v == start){
            startService(new Intent(this, MyService.class));
        }else if (v == stop){
            stopService(new Intent(this, MyService.class));
        }
    }

    /*start.setOnClickListener(new View.OnClickListener()
     {
         @Override
         public void onClick(View view) {
             startService(new Intent(MainActivity.this, MyServices.class));
         }
     });

    stop.setOnClickListener(new View.OnClickListener()
     {
         @Override
         public void onClick(View view) {
             stopService(new Intent(MainActivity.this, MyServices.class));
         }
     });*/
}