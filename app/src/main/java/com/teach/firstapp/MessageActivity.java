package com.teach.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Михаил on 27.05.2015.
 */
public class MessageActivity extends Activity {

    public static final String MESSAGE_BODY_KEY = "MESSAGE_BODY_KEY";

    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message_activity_layout);

        message = (TextView) findViewById(R.id.message_body);

        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            String msg = extras.getString(MESSAGE_BODY_KEY, "No message");
            message.setText(msg);
        }
    }
}
