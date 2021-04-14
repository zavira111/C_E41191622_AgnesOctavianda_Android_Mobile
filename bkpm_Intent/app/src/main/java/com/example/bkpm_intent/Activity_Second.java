package com.example.bkpm_intent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_Second extends AppCompatActivity {
    TextView textHello;
    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textHello = (TextView) findViewById(R.id.textHello);
        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        textHello.setText("Hello, " + nama + "!");
    }
}
