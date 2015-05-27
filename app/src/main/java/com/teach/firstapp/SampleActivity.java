package com.teach.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SampleActivity extends Activity implements View.OnClickListener{

    Button toFirstButton;
    Button toSecondButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_activity_layout);

        toFirstButton = (Button) findViewById(R.id.sample_first);
        toSecondButton = (Button) findViewById(R.id.sample_second);

        toFirstButton.setOnClickListener(this);
        toSecondButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.sample_first:
                openMessage("First message");
                break;
            case R.id.sample_second:
                openMessage("Second message");
                break;
        }
    }

    private void openMessage(String msg){
        Intent intent = new Intent(this, MessageActivity.class);
        intent.putExtra(MessageActivity.MESSAGE_BODY_KEY, msg);
        startActivity(intent);
    }
}
