package com.example.me.service;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{
    Button startbtn,stopbtn;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startbtn = (Button) findViewById(R.id.startbtn);
        stopbtn  = (Button) findViewById(R.id.stoptbtn);
        editText = (EditText) findViewById(R.id.serviceET);
        startbtn.setOnClickListener(this);
        stopbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if ( v.getId() == R.id.startbtn)
        {
            Intent serviceintent = new Intent(this,TestService.class);
            startService(serviceintent);

        }
        else  if (v.getId() == R.id.stoptbtn)
        {
            Intent serviceintent1 = new Intent(this,TestService.class);
            stopService(serviceintent1);
        }



    }
}
