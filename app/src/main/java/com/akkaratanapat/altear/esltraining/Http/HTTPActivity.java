package com.akkaratanapat.altear.esltraining.Http;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import com.akkaratanapat.altear.esltraining.R;

public class HTTPActivity extends ActionBarActivity {

    Button asycButton,volleyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_http);
    }

    public void setCustomButton(){
        asycButton = (Button)findViewById(R.id.button4);
        volleyButton = (Button)findViewById(R.id.button5);

        asycButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HTTPActivity.this,VolleyActivity.class);
                startActivity(i);
            }
        });

        volleyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HTTPActivity.this,AsynchronousHttpClientActivity.class);
                startActivity(i);
            }
        });
    }
}
