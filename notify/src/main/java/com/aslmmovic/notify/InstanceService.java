package com.aslmmovic.notify;


import android.util.Log;

import androidx.annotation.NonNull;

import com.aslmmovic.notify.common.SharedPrefrencesManager;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import static com.aslmmovic.notify.common.Constants.TAG_TRACK;

/**
 * Thi class Extends FMS , to retrieve Token and recieve message recieved as Notifcation
 * from Sender Website
 */

public class InstanceService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.i(TAG_TRACK,remoteMessage.toString());
    }

    @Override
    public void onNewToken(@NonNull String s) {
        super.onNewToken(s);
        Log.i(TAG_TRACK, "token is " + s);
        storeToken(s);

    }

    private void storeToken(String s) {
        SharedPrefrencesManager.getInstance(getApplicationContext()).storeToken(s);
    }
}
