package com.example.bkpm_intent;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ImpIntentApp extends AppCompatActivity {
    Button button;
    editText edit text;
    @Override
    protected void onCreate(Bundle savedIntanceState){
        super.onCreate(savedIntanceState);
        setContentView(R.layout.activity_imp_intent_app);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener()){
            @Override
                    public void onClick(View view){
                        String url=editText.getText().toString();
                        Intent intent=new Intent(intent.ACTION_VIEW, Url.porse(url));
                        startActivity(intent);
            }
        });
    }
}
