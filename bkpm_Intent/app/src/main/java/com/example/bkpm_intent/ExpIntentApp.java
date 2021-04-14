package com.example.bkpm_intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ExpIntentApp {
    editText name;
    Button btsSend;
    private String KEY_NAME = "Nama";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContenView(R.layout.activity_exp_intent_app);
        EditText name = (EditText) findViewById(R.id.editnama);
        Button btnSend = (Button) findViewById(R.id.btn_send);
        btnSend.SetOnClickListener(new View.OnClickListener());
        @Override
                public  void onClick(View view){
            try{
                String nama = name.getText().toString();
                if (nama != ""){
                    Intent i = new Intent(ExpIntentApp.this, Activity_Second.class);
                    i.putExtra(KEY_NAME, nama);
                    startActivity(i); }

                else{
                    Toast.maketext(getApplication()), text "YOU NEED TO FEEL YOUR NAME", Toast.LENGTH_SHORT); }
                catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication()), text "ERROR, TRY AGAIN", Toast.LENGTH_SHORT); }
                }
            }
        }
    }
}
