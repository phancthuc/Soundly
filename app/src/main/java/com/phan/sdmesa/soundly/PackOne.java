package com.phan.sdmesa.soundly;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PackOne extends AppCompatActivity implements View.OnClickListener
{

    Button s1,s2,s3,s4,s5,s6;
    MediaPlayer S1,S2,S3,S4,S5,S6;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pack_one);

        s1 = (Button) findViewById(R.id.buttonS1);
        s1.setOnClickListener(this);
        s2 = (Button) findViewById(R.id.buttonS2);
        s2.setOnClickListener(this);
        s3 = (Button) findViewById(R.id.buttonS3);
        s3.setOnClickListener(this);
        s4 = (Button) findViewById(R.id.buttonS4);
        s4.setOnClickListener(this);
        s5 = (Button) findViewById(R.id.buttonS5);
        s5.setOnClickListener(this);
        s6 = (Button) findViewById(R.id.buttonS6);
        s6.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.buttonS1:
                if(S1!=null)
                {
                    S1.release();
                }
                S1 = MediaPlayer.create(this, R.raw.s1);
                S1.start();
                break;
            case R.id.buttonS2:
                if(S2!=null)
                {
                    S2.release();
                }
                S2 = MediaPlayer.create(this, R.raw.s2);
                S2.start();
                break;
            case R.id.buttonS3:
                if(S3!=null)
                {
                    S3.release();
                }
                S3 = MediaPlayer.create(this, R.raw.s3);
                S3.start();
                break;
            case R.id.buttonS4:
                if(S4!=null)
                {
                    S4.release();
                }
                S4 = MediaPlayer.create(this, R.raw.s4);
                S4.start();
                break;
            case R.id.buttonS5:
                if(S5!=null)
                {
                    S5.release();
                }
                S5= MediaPlayer.create(this, R.raw.s5);
                S5.start();
                break;
            case R.id.buttonS6:
                if(S6!=null)
                {
                    S6.release();
                }
                S6 = MediaPlayer.create(this, R.raw.s6);
                S6.start();
                break;



        }

    }



}
