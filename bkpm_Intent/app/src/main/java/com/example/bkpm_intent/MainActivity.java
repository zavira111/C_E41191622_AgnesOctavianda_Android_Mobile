package com.example.bkpm_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonImpicit (View view){
        Intent intent = new Intent(MainActivity.this,ImpIntentApp.class);
        startActivity(intent);

    public void buttonExplicit (View view)
    Intent intent = new Intent(MainActivity.this, ExIntentApp.class);
    startActivity(intent);

    }
}