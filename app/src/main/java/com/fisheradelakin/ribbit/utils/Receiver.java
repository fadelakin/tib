package com.fisheradelakin.ribbit.utils;

import android.content.Context;
import android.content.Intent;

import com.fisheradelakin.ribbit.ui.MainActivity;
import com.parse.ParsePushBroadcastReceiver;

/**
 * Created by Fisher on 3/3/15.
 */
public class Receiver extends ParsePushBroadcastReceiver {

    @Override
    public void onPushOpen(Context context, Intent intent) {
        Intent i = new Intent(context, MainActivity.class);
        i.putExtras(intent.getExtras());
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}
