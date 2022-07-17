package com.example.messagereader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.provider.Telephony;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public  static  TextView message;

    private SMSReceiver myReceiver = new SMSReceiver();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = findViewById(R.id.idMessageShow);





        IntentFilter intentFilter = new IntentFilter();

//        intentFilter.addAction(Telephony.Sms.Intents.SMS_RECEIVED_ACTION);
//
//
//
//        this.registerReceiver(myReceiver,intentFilter);


    }
}