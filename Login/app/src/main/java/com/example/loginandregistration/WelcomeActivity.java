package com.example.loginandregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        TextView textView = (TextView)findViewById(R.id.editText2);

        StringBuilder msg = new StringBuilder("Welcome  \n");

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        String name= b.getString(Constants.KEY_NAME,"default");
        msg.append(name);

        textView.setText(msg);


    }
}
