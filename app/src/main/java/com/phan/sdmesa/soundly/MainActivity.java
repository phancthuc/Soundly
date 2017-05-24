package com.phan.sdmesa.soundly;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    ToggleButton t;
    private MediaPlayer bg;
    Button buttonStart;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart = (Button) findViewById(R.id.buttonStart);
        buttonStart.setOnClickListener(this);



        bg = MediaPlayer.create(this, R.raw.bgmusic);
        bg.setLooping(true); // Set looping
        bg.setVolume(1.0f, 1.0f);
        bg.start();

    }
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.buttonStart:
                Intent m;
                m = new Intent(this, Packs.class);
                bg.pause();
                startActivity(m);
                break;

        }

    }

}
