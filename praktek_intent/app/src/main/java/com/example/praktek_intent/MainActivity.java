package com.example.praktek_intent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnPindahActivity, btnPindahData, btnDial, btnMaps, btnSms, btnResult;
    private static final int REQUEST_CODE = 75;
    private static final int PICK_CONTACT_REQUEST = 1;
    private TextView textViewResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPindahActivity = findViewById(R.id.btn_pindah_activity);
        btnPindahActivity.setOnClickListener(this);

        btnPindahActivity = findViewById(R.id.btn_pindah_activity_data);
        btnPindahActivity.setOnClickListener(this);

        btnPindahActivity = findViewById(R.id.btn_dial);
        btnPindahActivity.setOnClickListener(this);

        btnPindahActivity = findViewById(R.id.btn_maps);
        btnPindahActivity.setOnClickListener(this);

        btnPindahActivity = findViewById(R.id.btn_sms);
        btnPindahActivity.setOnClickListener(this);

        btnPindahActivity = findViewById(R.id.btn_activity_result);
        btnPindahActivity.setOnClickListener(this);

        textViewResult = findViewById(R.id.textViewResult);
    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_pindah_activity;
                Intent intentPindahActivity = new Intent(this, PindahActivity.class);
                startActivity(intentPindahActivity);
                break;
            case R.id.btn_pindah_activity_data;
                Intent moveWithDataIntent = new (this, PindahDenganData.class);
                Intent moveWithDataIntent.String putExtra;
                putExtra = ("extra_name", "Agnes");
                Intent moveWithDataIntent.putExtra = ("nim", "E41191622");
                startActivity(intentPindahActivity);
                break;
            case R.id.btn_dial;
                String phoneNumber = "085334821556"
                Intent dialphone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                startActivity(dialphone);
                break;
            case R.id.btn_maps;
                Intent intentmaps = new Intent((Intent.ACTION_VIEW, Uri.parse("geo:-8.2755701,113.6407981")));
                intentmaps.setPackage(com.google.android.apps.maps);
                startActivity(intentmaps);
                break;
             case R.id.btn_sms;
                Intent sms = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto: 085334821556"));
                sms.putExtra("sms_body", "Jangan Menyerah Belajar Implicit Dan Explicit ");
                startActivity(sms);
                break;
            case R.id.btn_activity_result;
                Intent moveForResultIntent = new (this, com.example.praktek_intent.PindahResult.class);
                startActivityForResult(moveForResultIntent. REQUEST_CODE);
                break;

            @Override
            protected void onActivityResult(int requestCode, int resulCode, @Nullable Intent data){
                super.onActivityResult(requestCode, resulCode, data);
                if (requestCode == PICK_CONTACT_REQUEST){
                    if (requestCode == RESULT_OK){
                        Uri contactUri = data.getData();
                        String []projection = {ContactsContract.CommonDataKinds.Phone.NUMBER};

                        Cursor cursor = getContentResolver().query(contactUri, projection, null, null, null);
                        cursor.moveToFirst();

                        int column = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
                        String number = cursor.getString(column);
                        textViewResult.setText(number);
                    }
                }
                if  (requestCode == REQUEST_CODE){
                    if (requestCode == com.example.praktek_intent.PindahForResult.RESULT_CODE){
                        int selectedValue = data.getInExtra(com.example.praktek_intent.PindahActivity.EXTRA_VALUE, 0);
                        textViewResult.setText("Hasil:" +selectedValue);
                    }
                }
            }


        }
    }
}