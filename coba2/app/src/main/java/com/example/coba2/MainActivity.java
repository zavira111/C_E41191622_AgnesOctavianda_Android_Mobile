package com.example.coba2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {
    EditText editnama;
    Button buttonsubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editnama = findViewById(R.id.editnama);
        buttonsubmit = findViewById(R.id.buttonsubmit);
        @Override
                public void onClick(View view) {
            Toast.makeText(context:MainActivity.this, editnama.getText().toString(), Toast.LENGTH_LONG).show();
        }
        });
    }

    public void BersihLayar(View view) {
    editnama.setText("");
    editnama.setFocusable(true);
    }


