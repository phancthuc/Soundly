package com.phan.sdmesa.soundly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Packs extends AppCompatActivity implements View.OnClickListener
{

    Button buttonPackM, buttonPackA;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_packs);


        buttonPackM = (Button) findViewById(R.id.buttonPack1);
        buttonPackM.setOnClickListener(this);
        buttonPackA = (Button) findViewById(R.id.buttonPack2);
        buttonPackA.setOnClickListener(this);


    }

    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.buttonPack1:
                Intent m;
                m = new Intent(this, PackOne.class);
                startActivity(m);
                break;
            case R.id.buttonPack2:
                Intent a;
                a= new Intent(this, PackTwo.class);
                startActivity(a);
                break;

        }

    }

}
