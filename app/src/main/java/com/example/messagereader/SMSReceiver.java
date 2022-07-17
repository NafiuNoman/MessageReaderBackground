package com.example.messagereader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.util.Log;

public class SMSReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equalsIgnoreCase(Telephony.Sms.Intents.SMS_RECEIVED_ACTION))
        {

            for (SmsMessage smsMessage :Telephony.Sms.Intents.getMessagesFromIntent(intent))
            {
                String smsBody = smsMessage.getMessageBody();

                Log.d("ok....",""+smsBody);

                MainActivity.message.setText(smsBody);

            }

        }
    }
}
