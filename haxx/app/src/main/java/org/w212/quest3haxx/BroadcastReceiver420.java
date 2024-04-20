package org.w212.quest3haxx;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BroadcastReceiver420 extends BroadcastReceiver {

    private static final String TAG = "StartMyActivityAtBoot";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.v(TAG, "Receive broadcast");

        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            Log.d(TAG, "Receive boot completed broadcast");
            Intent activityIntent = new Intent(context, MainActivity.class);
            activityIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(activityIntent);
        }
    }
}