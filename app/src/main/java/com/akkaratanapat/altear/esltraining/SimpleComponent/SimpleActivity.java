package com.akkaratanapat.altear.esltraining.SimpleComponent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import com.akkaratanapat.altear.esltraining.R;

public class SimpleActivity extends ActionBarActivity {

    Button textViewButton,dialogButton,listViewButton,customButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        setComponent();
    }

    public void setComponent(){
        listViewButton = (Button)findViewById(R.id.button8);
        customButton = (Button)findViewById(R.id.button9);

        listViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SimpleActivity.this,ListviewActivity.class);
                startActivity(i);
            }
        });

        customButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SimpleActivity.this,CustombuttonActivity.class);
                startActivity(i);
            }
        });
    }
}
