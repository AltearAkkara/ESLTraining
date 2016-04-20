package com.akkaratanapat.altear.esltraining;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.akkaratanapat.altear.esltraining.Socket.MainActivity;

public class FirstActivity extends Activity {

    Button simplButton,httpButton,socketButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        setCustomComponent();
    }

    public void setCustomComponent(){
        simplButton = (Button)findViewById(R.id.button);
        httpButton = (Button)findViewById(R.id.button2);
        socketButton = (Button)findViewById(R.id.button3);

        simplButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        httpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        socketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
