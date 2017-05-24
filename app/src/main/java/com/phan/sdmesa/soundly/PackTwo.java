package com.phan.sdmesa.soundly;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PackTwo extends AppCompatActivity implements View.OnClickListener
{

    Button a1,a2,a3,a4,a5,a6;
    MediaPlayer A1,A2,A3,A4,A5,A6;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pack_two);

        a1 = (Button) findViewById(R.id.buttonDog);
        a1.setOnClickListener(this);
        a2 = (Button) findViewById(R.id.buttonCat);
        a2.setOnClickListener(this);
        a3 = (Button) findViewById(R.id.buttonCow);
        a3.setOnClickListener(this);
        a4 = (Button) findViewById(R.id.buttonChicken);
        a4.setOnClickListener(this);
        a5 = (Button) findViewById(R.id.buttonHorse);
        a5.setOnClickListener(this);
        a6 = (Button) findViewById(R.id.buttonPig);
        a6.setOnClickListener(this);


    }
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.buttonDog:
                if(A1!=null)
                {
                    A1.release();
                }
                A1 = MediaPlayer.create(this, R.raw.dog);
                A1.start();
                break;
            case R.id.buttonCat:
                if(A2!=null)
                {
                    A2.release();
                }
                A2 = MediaPlayer.create(this, R.raw.cat);
                A2.start();
                break;
            case R.id.buttonCow:
                if(A3!=null)
                {
                    A3.release();
                }
                A3 = MediaPlayer.create(this, R.raw.cow);
                A3.start();
                break;
            case R.id.buttonChicken:
                if(A4!=null)
                {
                    A4.release();
                }
                A4 = MediaPlayer.create(this, R.raw.chicken);
                A4.start();
                break;
            case R.id.buttonHorse:
                if(A5!=null)
                {
                    A5.release();
                }
                A5= MediaPlayer.create(this, R.raw.horse);
                A5.start();
                break;
            case R.id.buttonPig:
                if(A6!=null)
                {
                    A6.release();
                }
                A6 = MediaPlayer.create(this, R.raw.pig);
                A6.start();
                break;

        }

    }

}
