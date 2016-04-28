package com.akkaratanapat.altear.esltraining;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.akkaratanapat.altear.esltraining.SimpleComponent.SimpleActivity;
import com.akkaratanapat.altear.esltraining.Socket.MainActivity;


public class FirstActivity extends Activity {

    Button Simple,HTTP,Socket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        setCustom();
    }

    public void setCustom(){

        Simple = (Button) findViewById(R.id.button);
        HTTP = (Button) findViewById(R.id.button2);
        Socket = (Button) findViewById(R.id.button3);

        Simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FirstActivity.this, SimpleActivity.class);
                startActivity(i);
            }
        });

//        HTTP.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(FirstActivity.this, VolleyActivity.class);
//                startActivity(i);
//            }
//        });

        Socket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FirstActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}